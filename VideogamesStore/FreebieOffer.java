public class FreebieOffer extends Offer{

  private String freebie;

  public String getFreebie(){
    return freebie;
  }

  public FreebieOffer(String fr){
    super(Offer.FREEBIE);
    freebie = fr;
  }

  @Override
  public String toString(){
      return "OFFER:" + getFreebie();
  }

}
