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

    offers[0] = new Offer(Offer.DISCOUNT, "DESC. 50%");
    offers[0].setOfferAmount(0.5f);
    offers[1] = new Offer(Offer.DISCOUNT, "DESC. 40%");
    offers[1].setOfferAmount(0.4f);
    offers[2] = new Offer(Offer.DISCOUNT, "DESC. 30%");
    offers[2].setOfferAmount(0.3f);
    offers[3] = new Offer(Offer.DISCOUNT, "DESC. 20%");
    offers[3].setOfferAmount(0.2f);
    offers[4] = new Offer(Offer.DISCOUNT, "DESC. 10%");
    offers[4].setOfferAmount(0.1f);
    offers[5] = new Offer(Offer.FREEBIE, "Gorra");
    offers[6] = new Offer(Offer.FREEBIE, "Figura");
    offers[7] = new Offer(Offer.FREEBIE, "Sombrero");

  }

  public java.util.Vector getOffers(){
    int i = 0;
    java.util.Vector<Offer> outVector = new java.util.Vector();
    Offer offer = offers[0];
    while(offer != null){
      i++;
      offer = offers[i];
      outVector.add(offer);
    }
    return outVector;
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
