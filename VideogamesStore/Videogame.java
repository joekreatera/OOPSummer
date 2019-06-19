import java.util.*;

public class Videogame{
  float price;
  String name;
  String rating;
  int stock;
  private long id;

  public static boolean FILE_EDITION = false;
  public Videogame(String data){
      StringTokenizer tokens = new StringTokenizer(data,",");
      int dataNum = 0;
      while(tokens.hasMoreTokens()){
          String val = tokens.nextToken();
          if( dataNum == 0) id = Long.parseLong(val);
          if( dataNum == 1) name = val;
          if( dataNum == 2) rating = val;
          if( dataNum == 3) price = Float.parseFloat(val);
          if( dataNum == 4) stock = Integer.parseInt(val);
          dataNum++;
      }
  }

  public long getId(){ return id;}
  public float getPrice(){ return price;}
  public String getName(){ return name;}
  public String getRating(){return rating;}
  public int getStock(){ return stock;}
  public void setId(long i){ id = i; }
  public void setPrice(float p){ price = p;}
  public void setName(String p){name = p;}
  public void setRating(String p){rating = p;}
  public void setStock(int p){ stock = p;}
  @Override
  public String toString(){
      //Fifa 2000, M, 1200.00,4
      if( Videogame.FILE_EDITION){
        return toFileString();
      }
      return id+")"+name +":" + price + "(" + stock +")";
  }

  public String toFileString(){
      //Fifa 2000, M, 1200.00,4
    return id+","+name + "," + rating + ","+ price + "," + stock;
  }
  public static String getFixedCharactersName(String name , int limit){
      if(name.length() > limit){
        return name.substring(0,limit);
      }
      String finalStr = name;
      for(int i = name.length() ; i< limit; i++)
        finalStr += " ";

      return finalStr;
  }
  public String getPrintView(){
    String thisName = Videogame.getFixedCharactersName(name,20);
    return id+")\t"+thisName+"\t\t"+rating+"\t\t\t"+price+"\t" + stock;
  }
}
