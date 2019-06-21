import java.util.*;
import java.io.*;

public class City{
  private String filename;
  private Property[][] properties=new Property[8][8];
  private int errors;
  private int[] houses;
  private int[] industry;
  private int[] stores;
  private float population;
  private float pollution;
  private int emptylots;

  public int geterrors(){
    this.scanCity();
    return this.errors;
  }
  public int getHouses  (int i){return houses  [i];}
  public int getStores  (int i){return stores  [i];}
  public int getIndustri(int i){return industry[i];}

  public void cleanCount(){
    this.emptylots=0;
    for(int i=0; i<3; i++){
      this.houses[i]=0;
      this.industry[i]=0;
      this.stores[i]=0;
    }
  }

  public String count(){
    this.cleanCount();
    String str="";
    for(int i=0; i<8; i++){
      for(int j=0;j<8;j++){
        if(this.properties[i][j].getType()==Property.TYPE.HOUSE){
          if(this.properties[i][j].getLevel()==Property.LEVEL.LOW)houses[0]++;
          if(this.properties[i][j].getLevel()==Property.LEVEL.MEDIUM)houses[1]++;
          if(this.properties[i][j].getLevel()==Property.LEVEL.HIGH)houses[2]++;
        }
        if(this.properties[i][j].getType()==Property.TYPE.STORE){
          if(this.properties[i][j].getLevel()==Property.LEVEL.LOW)stores[0]++;
          if(this.properties[i][j].getLevel()==Property.LEVEL.MEDIUM)stores[1]++;
          if(this.properties[i][j].getLevel()==Property.LEVEL.HIGH)stores[2]++;
        }
        if(this.properties[i][j].getType()==Property.TYPE.INDUSTRY){
          if(this.properties[i][j].getLevel()==Property.LEVEL.LOW)industry[0]++;
          if(this.properties[i][j].getLevel()==Property.LEVEL.MEDIUM)industry[1]++;
          if(this.properties[i][j].getLevel()==Property.LEVEL.HIGH)industry[2]++;
        }
          if(this.properties[i][j].getType()==Property.TYPE.NULL)emptylots++;
      }
    }
    str+="\nHouses:";
    str+="\n\tSmall:" + this.houses[0];
    str+="\n\tMedium:"+ this.houses[1];
    str+="\n\tLarge:"+ this.houses[2];
    str+="\nStores:";
    str+="\n\tSmall:" + this.stores[0];
    str+="\n\tMedium:"+ this.stores[1];
    str+="\n\tLarge:"+ this.stores[2];
    str+="\nIndustry:";
    str+="\n\tSmall:" + this.industry[0];
    str+="\n\tMedium:"+ this.industry[1];
    str+="\n\tLarge:"+ this.industry[2];
    str+="\nEmpty Lots: "+this.emptylots;
    return str;
  }

  public void changeFile(String file){
    this.filename=file;
    this.loadfile();
  }

  public float getPopulation(){
    this.population=0;
    for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){
        this.population+=this.properties[i][j].population();
      }
    }
    return this.population;
  }

  public float getPollution(){
    this.pollution=0;
    for(int i=0; i<8; i++){
      for(int j=0; j<8; j++){
        this.pollution+=this.properties[i][j].pollution();
      }
    }
    return this.pollution;
  }

  public void randomcity(){
    int ran[][]=new int[8][8];
    String str="";
    try{
      FileWriter file= new FileWriter(this.filename);
      PrintWriter printer= new PrintWriter(file, true);
      for(int i=0; i<8; i++){
        str="";
        for(int j=0; j<8; j++){
          ran[i][j]=(int)(Math.random()*3.99999);
          str+=ran[i][j];
        }
        printer.println(str);
      }
      printer.close();
    }catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
    this.loadfile();
  }

  public void linetoarr(int dir, String data){
    for(int i=0; i<8; i++){
      switch(data.charAt(i)){
        case '1':
          this.properties[dir][i]=new House();
          break;

        case '2':
          this.properties[dir][i]=new Store();
          break;

        case '3':
          this.properties[dir][i]=new Industry();
          break;

        default:
          this.properties[dir][i]=new Property();
          break;
      }
    }
  }

  public void loadfile(){
    try{
      FileReader reader = new FileReader(this.filename);
      BufferedReader input = new BufferedReader(reader);

      String line;
      int dir=0;
      while((line=input.readLine())!=null){
        this.linetoarr(dir,line);
        dir++;
      }
      input.close();
    }catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
  }

  public Boolean Error(Property p1, Property p2){
    if(p1.getType()==Property.TYPE.HOUSE && p2.getType()==Property.TYPE.INDUSTRY){
      return true;
    }
    if(p1.getType()==Property.TYPE.INDUSTRY && p2.getType()==Property.TYPE.HOUSE){
      return true;
    }
    if(p1.getType()==Property.TYPE.INDUSTRY && p2.getType()==Property.TYPE.STORE){
      if(p1.getLevel()==Property.LEVEL.MEDIUM && p1.getLevel()==Property.LEVEL.HIGH){
        return true;
      }
    }
    if(p1.getType()==Property.TYPE.STORE && p2.getType()==Property.TYPE.INDUSTRY){
      if(p1.getLevel()==Property.LEVEL.HIGH && p1.getLevel()==Property.LEVEL.MEDIUM){
        return true;
      }
    }
    return false;
  }

  public void scanCity(){
    this.errors=0;
    for(int i=0; i<8; i++){
      for(int j=1;j<8;j++){
        if(Error(properties[i][j],properties[i][j-1]))errors++;
      }
    }
  }

  @Override
  public String toString(){
    String str="";
    for(int i=0; i<8; i++){
      str+="\n";
      for(int j=0; j<8; j++){
        str+=properties[i][j];
        str+=" ";
      }
    }
    return str;
  }

  public City(String file){
    this.filename=file;
    this.houses=new int[3];
    this.industry=new int[3];
    this.stores=new int[3];
    this.emptylots=0;
    this.errors=0;
    this.population=0;
    this.pollution=0;
    this.loadfile();
  }
}
