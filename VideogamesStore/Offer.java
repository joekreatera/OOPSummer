public class Offer{
  int type = 0;
  String description = "";
  public static final int DISCOUNT = 1;
  public static final int FREEBIE = 2;

  public void setDescription(String d){
     description = d;
  }
  public String getDescription(){
    return description;
  }
  public Offer (int type, String desc){
    description = desc;
    this.type = type;
  }

  public Offer(int type){
    this.type = type;
  }

  public int getType(){
    return type;
  }

  @Override
  public String toString(){
      return "Offer " + getType() + " " + description;
  }
}
