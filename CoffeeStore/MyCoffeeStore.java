public class MyCoffeeStore{


  Catalogue myCatalogue =  new Catalogue();

  public Catalogue getCatalogue(){
      return myCatalogue;
  }

  public static void main(String args[]){

      MyCoffeeStore store = new MyCoffeeStore();
      System.out.println( store.getCatalogue()  );

  }

}
