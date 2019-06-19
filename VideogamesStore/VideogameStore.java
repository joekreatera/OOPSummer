import java.io.*;

public class VideogameStore{
  Videogame[] inventory;
  Payment[] payments;
  Offer[] offers;
  String dataFile = "_default.vg";
  String salesFile = "_sales.vg";
  int lastPayment = 0;
  int lastPaymentPrinted = 0;
  public VideogameStore(String dataFile,String salesFile){
    // initialize according to game database
    this.dataFile = dataFile;
    this.salesFile = salesFile;
    // this should be implemented with another type of structure. for now, take a very big number (bad for memory)
    payments = new Payment[100];
    // this should be implemented with another type of structure. for now, take a very big number (bad for memory)
    offers = new Offer[100];
  }
  public Videogame[] getInventory(){
      return inventory;
  }

  public static float getAmountOfOffer(Offer f){
    if( f.getType() == Offer.DISCOUNT)
      return ((DiscountOffer)f).getAmount();
    return 0;
  }


  public boolean sellVideogame(long id){
    return sellVideogame(id, null);
  }
  /**
  * Description: function to sellVIdeogame
  * Requires: Long Id (Videogame Id on File)
  */
  public boolean sellVideogame(long id, Offer offer){
    for( int i = 0; i < inventory.length ; i++){
      if( inventory[i].getId() == id){
          int s = inventory[i].getStock();
          if( s <= 0){
              return false;
          }
          s -= 1;
          inventory[i].setStock(s);
          // addPayment database
          /*
          if( offer != null){
              payments[lastPayment] = OfferPayment(inventory[i], "date",
                                              inventory[i].getPrice() - VideogameStore.getAmountOfOffer()
                                              offer)
          }else{
            payments[lastPayment] = Payment(inventory[i], "date",inventory[i].getPrice());
          }
          */
          return true;
      }
    }
    return false;
  }

  public String getPrintedCatalogue(){
    String result = "id)\tName\t\t\t\tRating\t\t\tPrice\tStock\n";
    for(int i = 0 ; i<inventory.length ; i++){
        result += inventory[i].getPrintView() + "\n";
    }
    return result;
  }

  public void loadDatabase(){
    try{
      FileReader reader = new FileReader(dataFile);
      BufferedReader database= new  BufferedReader(reader);
      int videogames = 0;

      while( database.readLine() != null ){
        System.out.println("Read line");
        videogames++;
      }
      inventory = new Videogame[videogames];
      database.close();
      reader = new FileReader(dataFile);
      database = new BufferedReader(reader);
      String str = "";
      videogames = 0;
      while( (str = database.readLine()) != null ){
        inventory[videogames] = new Videogame(str);
        videogames++;
      }
      database.close();

    }catch(IOException ioe){
      System.out.println("Exception " + ioe);
    }
  }

  public void saveDatabase(){
      // please make backup before doing this!!!
      try{
          FileWriter file = new FileWriter(dataFile);
          PrintWriter printer = new PrintWriter(file, true);

          for(int i = 0; i < inventory.length ;i++){
            printer.println( inventory[i] );
          }
          printer.close();

          file = new FileWriter(salesFile , true);
          printer = new PrintWriter(file, true);

          /*
          while( payments[lastPaymentPrinted] != null && lastPaymentPrinted < payments.length ){
              printer.println( payments[lastPaymentPrinted++] );

          }*/
          printer.close();

      }catch(IOException ioe){
        System.out.println("Exception " + ioe);
      }
  }

}
