public class MyCoffeeStore{


  Catalogue myCatalogue;
  Employee counterEmployee;
  Employee deliveryEmployee;

  public MyCoffeeStore(){
    myCatalogue =  new Catalogue();
    counterEmployee = new Employee();
    deliveryEmployee = new Employee();

    counterEmployee.setName("Mawi");
    deliveryEmployee.setName("Llanas");

    counterEmployee.setCharge(Employee.COUNTER);
    deliveryEmployee.setCharge(Employee.DELIVERY);
  }

  public Catalogue getCatalogue(){
      return myCatalogue;
  }

  public void oneDay(){
    float rev = 0;
      for( int i = 0; i < 20 ; i++){
          Beverage b = getCatalogue().getRandomBeverage();
          Payment pay = doPayment();
          System.out.println(pay);
          rev += pay.getOrder().getPrice();
      }
      System.out.println("Rev  " + rev);
  }

  public Payment doPayment(Beverage b){
    int pt = Payment.CARD;
    float ag = 0;
    if( Math.random() > 0.5f){
      pt  = Payment.CASH;
      ag = b.getPrice() + (float)(Math.random()*100);
    }
    Payment pay = new Payment(counterEmployee,b,pt,ag);
    pay.calculateAmountReturned();
    return pay;
  }

  public static void main(String   args[]){

      MyCoffeeStore store = new MyCoffeeStore();
      store.oneDay();
  }

}
