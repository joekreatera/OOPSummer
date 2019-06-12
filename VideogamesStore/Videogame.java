import java.util.*;

public class Videogame{
  float price;
  String name;
  String rating;
  int stock;
  public Videogame(String data){
      StringTokenizer tokens = new StringTokenizer(data,",");
      int dataNum = 0;
      while(tokens.hasMoreTokens()){
          String val = tokens.nextToken();
          if( dataNum == 0) name = val;
          if( dataNum == 1) rating = val;
          if( dataNum == 2) price = Float.parseFloat(val);
          if( dataNum == 3) stock = Integer.parseInt(val);
          dataNum++;
      }
  }
  public float getPrice(){ return price;}
  public String getName(){ return name;}
  public String getRating(){return rating;}
  public int getStock(){ return stock;}
  public void setPrice(float p){ price = p;}
  public void setName(String p){name = p;}
  public void setRating(String p){rating = p;}
  public void setStock(int p){ stock = p;}
}
