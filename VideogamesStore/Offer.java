public class Offer{
  int type = 0;
  String description = "";
  float offerAmount = 0.0f;
  public static final int DISCOUNT = 1;
  public static final int FREEBIE = 2;

  public float getOfferAmount(){
    return offerAmount;
  }
  public void setOfferAmount(float oa){
    offerAmount =oa;
  }

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
