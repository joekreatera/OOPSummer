import java.io.*;

public class VideogameStore{
  Videogame[] inventory;

  public VideogameStore(String dataFile){
    // initialize according to game database
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
  public static void main(String args[]){
    VideogameStore vs = new VideogameStore("db.vg");
  }

}
