import java.io.*;

class City{

  Property[][] properties;
  int amounts[];
  float[][] pollutionAndPopulationQty;
  public static final int SMALL_INDUSTRY_QTY = 0;
  public static final int MEDIUM_INDUSTRY_QTY = 1;
  public static final int LARGE_INDUSTRY_QTY = 2;
  public static final int SMALL_STORE_QTY = 3;
  public static final int MEDIUM_STORE_QTY = 4;
  public static final int LARGE_STORE_QTY = 5;
  public static final int SMALL_HOUSE_QTY = 6;
  public static final int MEDIUM_HOUSE_QTY = 7;
  public static final int LARGE_HOUSE_QTY = 8;
  public static final int POPULATION = 1;
  public static final int POLLUTION = 0;
  public City(){
      amounts = new int[9];
      pollutionAndPopulationQty = new float[9][2];
  }

  public void resetCounters(){

    for(int i = 0; i < 9 ;i++){
      amounts[i] = 0;
      pollutionAndPopulationQty[i][POLLUTION]  = 0.0f;
      pollutionAndPopulationQty[i][POPULATION]  = 0.0f;
    }
  }
  public boolean readFile(String file) throws Exception{

    BufferedReader reader = new BufferedReader(new FileReader(file) );
    properties = new Property[8][8];
    resetCounters();

    String str = "";
    int  line = 0;
    while( (str = reader.readLine()) != null ){

        for(int i = 0; i < 8; i++){
            String tp = ""+str.charAt(i);
            if( tp.equals("0") ){
              properties[line][i] = new Property(i, line, Property.getRandom(),Property.PROPERTY_CLASS.NONE );
            }
            if( tp.equals("1") ){
              properties[line][i] = new House(i, line , Property.getRandom(),Property.PROPERTY_CLASS.HOUSE );
              fillCounters( 3 + (properties[line][i].getIntFromType()-1) ,
                            properties[line][i].getPopulation(),
                            properties[line][i].getPollution()
                            );
            }
            if( tp.equals("2") ){
              properties[line][i] = new Store(i, line , Property.getRandom(),Property.PROPERTY_CLASS.STORE );
              fillCounters( 0 + (properties[line][i].getIntFromType()-1) ,
                            properties[line][i].getPopulation(),
                            properties[line][i].getPollution()
                            );
            }
            if( tp.equals("3") ){
              properties[line][i] = new Industry(i, line, Property.getRandom(),Property.PROPERTY_CLASS.INDUSTRY );
              fillCounters( 6 + (properties[line][i].getIntFromType()-1) ,
                            properties[line][i].getPopulation(),
                            properties[line][i].getPollution()
                            );
            }
        }

        line++;
    }
    reader.close();

    return true;
  }


  /*
  Just go forward and down, two cases,
  Industry meets House (front , down)
  House meets Industry (front, down)
  */
  public int getErrors(){

      int errors = 0;
      for(int i = 0; i < properties.length ; i++){
        for(int j=0; j < properties[0].length-1 ; j++){

            if(properties[i][j].getPropertyClass() == Property.PROPERTY_CLASS.HOUSE  ){
              if(properties[i][j+1].getPropertyClass() == Property.PROPERTY_CLASS.INDUSTRY  ){
                  errors++;
              }
              if(i+1 < properties.length && properties[i+1][j].getPropertyClass() == Property.PROPERTY_CLASS.INDUSTRY  ){
                  errors++;
              }
            }

            if(properties[i][j].getPropertyClass() == Property.PROPERTY_CLASS.INDUSTRY  ){
              if(properties[i][j+1].getPropertyClass() == Property.PROPERTY_CLASS.HOUSE  ){
                  errors++;
              }
              if(i+1 < properties.length && properties[i+1][j].getPropertyClass() == Property.PROPERTY_CLASS.HOUSE  ){
                  errors++;
              }
            }


            if(properties[i][j].getPropertyClass() == Property.PROPERTY_CLASS.STORE &&
                properties[i][j].getType() == Property.PROPERTY_SIZE.LARGE
            ){
              if(properties[i][j+1].getPropertyClass() == Property.PROPERTY_CLASS.INDUSTRY &&
                  properties[i][j+1].getType() == Property.PROPERTY_SIZE.MEDIUM
              ){
                  errors++;
              }
              if(i+1 < properties.length && properties[i+1][j].getPropertyClass() == Property.PROPERTY_CLASS.INDUSTRY &&
                properties[i+1][j].getType() == Property.PROPERTY_SIZE.MEDIUM
              ){
                  errors++;
              }
            }

            if(properties[i][j].getPropertyClass() == Property.PROPERTY_CLASS.INDUSTRY &&
                properties[i][j].getType() == Property.PROPERTY_SIZE.MEDIUM
            ){
              if(properties[i][j+1].getPropertyClass() == Property.PROPERTY_CLASS.STORE &&
                  properties[i][j+1].getType() == Property.PROPERTY_SIZE.LARGE
              ){
                  errors++;
              }
              if(i+1 < properties.length &&
                  properties[i+1][j].getPropertyClass() == Property.PROPERTY_CLASS.STORE &&
                  properties[i+1][j].getType() == Property.PROPERTY_SIZE.LARGE
              ){
                  errors++;
              }
            }

        }
      }

      return errors;
  }

  public static String getFirstCharOfType(Property p){
    if( p instanceof House) return "H";
    if( p instanceof Industry) return "I";
    if( p instanceof Store) return "S";
    return "_";
  }

  public String getPrintedMap(){
    /*
    I - INDUSTRYsize
    S - STOREsize
    H - Housesize
    */
    String res = "";
    for(int i = 0; i < properties.length ; i++){
      for(int j=0; j < properties[0].length-1 ; j++){
          String t = City.getFirstCharOfType(properties[i][j]);
          res += (t=="_"?"  ":t+properties[i][j].getIntFromType())+" ";
      }
      res +="\n";
    }
    return res;
  }

  public void fillCounters(int index, float pop, float pol){
    amounts[index ] += 1;
    pollutionAndPopulationQty[index][POPULATION] += pop ;
    pollutionAndPopulationQty[index][POLLUTION] += pol ;
  }

  public String getReport(){
    String result = "";
    float[][] a = pollutionAndPopulationQty;
    result = "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n";
    result += "Industry: \tQTY \t\tPOL \t\tPOP \n";
    result += "SMA: \t\t" +amounts[SMALL_INDUSTRY_QTY]+"\t\t"+a[SMALL_INDUSTRY_QTY][POLLUTION]+"\t"+a[SMALL_INDUSTRY_QTY][POPULATION]+ "\n";
    result += "MED: \t\t" +amounts[MEDIUM_INDUSTRY_QTY]+"\t\t"+a[MEDIUM_INDUSTRY_QTY][POLLUTION]+"\t"+a[MEDIUM_INDUSTRY_QTY][POPULATION]+"\n";
    result += "LAR: \t\t" +amounts[LARGE_INDUSTRY_QTY]+"\t\t"+a[LARGE_INDUSTRY_QTY][POLLUTION]+"\t"+a[LARGE_INDUSTRY_QTY][POPULATION]+"\n";
    result += "------------------------------------------------------------- \n";
    result += "Store   : \tQTY \t\tPOL \t\tPOP \n";
    result += "SMA: \t\t" +amounts[SMALL_STORE_QTY]+"\t\t"+a[SMALL_STORE_QTY][POLLUTION]+"\t"+a[SMALL_STORE_QTY][POPULATION]+ "\n";
    result += "MED: \t\t" +amounts[MEDIUM_STORE_QTY]+"\t\t"+a[MEDIUM_STORE_QTY][POLLUTION]+"\t"+a[MEDIUM_STORE_QTY][POPULATION]+"\n";
    result += "LAR: \t\t" +amounts[LARGE_STORE_QTY]+"\t\t"+a[LARGE_STORE_QTY][POLLUTION]+"\t"+a[LARGE_STORE_QTY][POPULATION]+"\n";
    result += "------------------------------------------------------------- \n";
    result += "House   : \tQTY \t\tPOL \t\tPOP \n";
    result += "SMA: \t\t" +amounts[SMALL_HOUSE_QTY]+"\t\t"+a[SMALL_HOUSE_QTY][POLLUTION]+"\t"+a[SMALL_HOUSE_QTY][POPULATION]+ "\n";
    result += "MED: \t\t" +amounts[MEDIUM_HOUSE_QTY]+"\t\t"+a[MEDIUM_HOUSE_QTY][POLLUTION]+"\t"+a[MEDIUM_HOUSE_QTY][POPULATION]+"\n";
    result += "LAR: \t\t" +amounts[LARGE_HOUSE_QTY]+"\t\t"+a[LARGE_HOUSE_QTY][POLLUTION]+"\t"+a[LARGE_HOUSE_QTY][POPULATION]+"\n";
    result += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ \n";
    return result;
  }

  public float getPollution(){

    float totalPollution = 0.0f;

    if(properties == null) return 0.0f;

    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
          totalPollution += properties[i][j].getPollution();
      }
    }
    return totalPollution;
  }

  public float getPopulation(){
    float totalPopulation = 0.0f;

    if(properties == null) return 0.0f;

    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
          totalPopulation += properties[i][j].getPopulation();
      }
    }

    return totalPopulation;
  }

  public void cleanse(){
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
           properties[i][j] = null;
      }
    }
  }
}
