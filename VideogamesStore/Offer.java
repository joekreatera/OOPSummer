public class Offer{
  int type = 0;
  public static final int DISCOUNT = 1;
  public static final int FREEBIE = 2;

  public Offer(int type){
    this.type = type;
  }

  public int getType(){
    return type;
  }

  @Override
  public String toString(){
      return "Offer " + getType();
  }
}
