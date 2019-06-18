public class DiscountOffer extends Offer{

  private float amount;

  public float getAmount(){
    return amount;
  }

  public DiscountOffer(float o){
    super(Offer.DISCOUNT);
    amount = o;
  }

  @Override
  public String toString(){
      return "OFFER:" + getAmount();
  }
}
