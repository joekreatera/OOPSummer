import java.io.*;
public class VideogameStoreUI{

  VideogameStore store;

  public VideogameStoreUI(){
    store = new VideogameStore("db.vg");
    store.loadDatabase();
    store.saveDatabase();
  }
  public String printMenu(){
    String str = "";
    str = "------------------------------\n";
    str += "Welcome to my Videogame Store\n";
    str += "Options (select the number you need):\n";
    str += "1)View catalogue\n";
    str += "2)Buy videogame\n";
    str += "3)View Sales\n";
    str += "4)Exit\n";
    str += "------------------------------\n";
    return str;
  }

  public void doSale(BufferedReader in) throws IOException{
    int option = -1;
    while( option != 0){
      try{
        System.out.print("Videogame Id:)");
        long id = Long.parseLong(in.readLine());
        // not implemented yet!!!
        boolean found = store.sellVideogame(id);
        if( !found ){
          System.out.println("Videogame not found // Or not enough units!!!");
        }else{
          store.saveDatabase();
          System.out.println("Videogame sold!");
        }
        option = 0;
      }catch(NumberFormatException nfe){
        System.out.println("That's not a valid Id.  (0) to return.");
      }
    }
  }

  public void doUI(){
      boolean doExit = false;
      try{
        BufferedReader in = new BufferedReader(
                                        new InputStreamReader(System.in));

        while(!doExit){
          System.out.println(printMenu());
          System.out.print("Selection:");
          String response = in.readLine();
          int option = 0;
          try{
            option = Integer.parseInt(response);
          }catch(NumberFormatException nfe){
            option = 0;
            System.out.println("Didn't catch your option!. Again.");
          }

          if( option == 1){
            System.out.println(store.getPrintedCatalogue());
          }
          if(option == 2){
            // ask for videogame id!!
            doSale(in);
          }
          if( option == 4){
              doExit = true;
              in.close();
          }
        }
      }catch(IOException ioe){
        System.out.println("Error " + ioe);
      }

      System.out.println("Program terminated!");

  }

  public static void main(String args[]){
    VideogameStoreUI ui = new VideogameStoreUI();
    ui.doUI();
  }

}
