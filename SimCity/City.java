class City{

  Property[][] properties;

  public City(){

  }

  public boolean readFile(String str) throws Exception{

    BufferedReader reader = new BufferedReader(new FileReader(str) );
    properties = new Property[8][8];


    String str = "";
    int  line = 0;
    while( (str = reader.readLines()) != null ){

        for(int i = 0; i < 8; i++){
            String tp = str.getCharAt(i);
            if( tp.equals("0") ){
              Property[line][i] = new Property();
            }
            if( tp.equals("1") ){
              Property[line][i] = new Property();
            }
            if( tp.equals("2") ){
              Property[line][i] = new Property();
            }
            if( tp.equals("3") ){
              Property[line][i] = new Property();
            }
        }

        line++;
    }
    reader.close();

    return true;
  }

  public float getPollution(){
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){

      }
    }
    return 0.0f;
  }

  public float getPopulation(){
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){

      }
    }

    return 0.0f;
  }
}
