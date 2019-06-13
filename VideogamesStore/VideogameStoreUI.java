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
