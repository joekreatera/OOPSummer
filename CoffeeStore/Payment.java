class Payment{

  public static final int NONE = 0;
  public static final int CASH = 1;
  public static final int CARD = 2;


  private Employee whoSold;
  private Beverage order;
  private int paymentType;
  private float amountGiven;
  private float amountReturned;

  public Payment(Employee e, Beverage o, int pt, float ag){
// fill this
    whoSold = e;
    order = o;
    paymentType = pt;
    amountGiven = ag;
    if( paymentType == Payment.CARD){
        amountGiven = order.getPrice();
        amountReturned = 0;
    }
  }
  public Employee getWhoSold(){ return whoSold; }
  public Beverage getOrder(){ return order; }
  public int getPaymentType(){ return paymentType; }
  public float getAmountGiven(){ return amountGiven; }
  public float getAmountReturned(){ return amountReturned;}
  public void calculateAmountReturned(){
      if( paymentType == Payment.CARD){
          amountReturned = 0;
      }else{
          amountReturned = amountGiven - order.getPrice();
      }
//TODO: [fix] we will suppose all payments are enough to cover the whole amount
  }
  @Override
  public String toString(){
    String pt = (paymentType==Payment.CARD?"CARD":"CASH");
    return order + " sold by " + whoSold
    + " must return " + amountReturned
    + " (paid with " + pt + ")";
  }

}
