import java.io.*;

public class VideogameStore{
  Videogame[] inventory;

  public VideogameStore(String dataFile){
    // initialize according to game database
  }

  public void loadDatabase(String dataFile){
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

  public void saveDatabase(String filename){
      // please make backup before doing this!!!
      try{
          FileWriter file = new FileWriter(filename);
          PrintWriter printer = new PrintWriter(file, true);

          for(int i = 0; i < inventory.length ;i++){
            printer.println( inventory[i] );
          }
          printer.close();

      }catch(IOException ioe){
        System.out.println("Exception " + ioe);
      }
  }
  public static void main(String args[]){
    VideogameStore vs = new VideogameStore("db.vg");
    vs.loadDatabase("db.vg");
    vs.saveDatabase("db.vg");
  }

}
