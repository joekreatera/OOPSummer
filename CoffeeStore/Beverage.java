public class Beverage{

  /*
  size: {sm:1, lg:2} small, large
  type: {c:1, h:2} cold, hot
  base: {c:1, t:2} coffee, tea
  cost: float, non-negative numbers  > 0
  price: float, non-negative numbers > 0
  productKey: String, TBD
  syrup: {s:1,b:2,m:3,l:4} strawberry, berry, mango, lemon
  topping: {wc:1, sp:2} whipped cream, sparks
  */

  private int size;
  private int type;
  private int base;
  private float cost;
  private float price;
  private String productKey;
  private int syrup;
  private int topping;

  public int getSize(){ return size;}
  public void setSize(int s){ size = s;}

  public int getType(){ return type;}
  public void setType(int s){ type = s;}

  public int getBase(){ return base;}
  public void setBase(int s){ base = s;}

  public float getCost(){ return cost;}
  public void setCost(float s){ cost = s;}

  public float getPrice(){ return price;}
  public void setPrice(float s){ price = s;}

  public String getProductKey(){ return productKey;}
  public void setProductKey(String s){ productKey = s;}

  public int getSyrup(){ return syrup;}
  public void setSyrup(int s){ syrup = s;}

  public int getTopping(){ return topping;}
  public void setTopping(int s){ topping = s;}
}
