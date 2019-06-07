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
          rev += b.getPrice();
      }
      System.out.println("Rev  " + rev);
  }

  public static void main(String   args[]){

      MyCoffeeStore store = new MyCoffeeStore();
      store.oneDay();
  }

}
