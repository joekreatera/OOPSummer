public class Beverage{

  public static final int SMALL = 1;
  public static final int LARGE = 2;
  public static final int COLD = 1;
  public static final int HOT = 2;
  public static final int COFFEE = 1;
  public static final int TEA = 2;
  public static final int NONE = 0;
  public static final int STRAWBERRY = 1;
  public static final int BERRY = 2;
  public static final int MANGO = 3;
  public static final int LEMON = 4;
  public static final int WHIPPED_CREAM = 1;
  public static final int SPARKS = 2;

  /*
  size: {sm:1, lg:2} small, large
  type: {c:1, h:2} cold, hot
  base: {c:1, t:2} coffee, tea
  cost: float, non-negative numbers  > 0
  price: float, non-negative numbers > 0
  productKey: String, TBD
  syrup: {n:0 , s:1,b:2,m:3,l:4} none, strawberry, berry, mango, lemon
  topping: {n:0 ,wc:1, sp:2} none, whipped cream, sparks
  */

  private int size;
  private int type;
  private int base;
  private float cost;
  private float price;
  private String productKey;
  private int syrup;
  private int topping;


  public Beverage(int s, int t, int b, float c, float p, String pk, int y, int o){
    setSize(s);
    setType(t);
    setBase(b);
    setCost(c);
    setPrice(p);
    setProductKey(pk);
    setSyrup(y);
    setTopping(o);
  }

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

  @Override
  public String toString(){
    return  productKey + ":("+cost+") p:"+price+" s:"+size+" t:"+type; 
  }
}
