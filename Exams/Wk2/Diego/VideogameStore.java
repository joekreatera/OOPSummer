import java.io.*;

public class VideogameStore
{
  Videogame[] inventory;
  String dataFile = "_default.vg";
  public VideogameStore(String dataFile)
  {
	this.dataFile = dataFile;
  }
  
  public boolean restockVideogame(long id)
  {
  	for(int i = 0; i < inventory.length; i++)
  	{
  		if(inventory[i].getId() == id)
  		{
  			int s = inventory[i].getStock();
  			if(s <= 0)
  			{
  				return false;
  			}
  			s += 1;
  			inventory[i].setStock(s);
  			return true;
  		}
  	}
  	return false;
  }
  
  public boolean sellVideogame(long id)
  {
    for( int i = 0; i < inventory.length ; i++)
    {
      if( inventory[i].getId() == id)
      {
          int s = inventory[i].getStock();
          if( s <= 0)
          {
              return false;
          }
          s -= 1;
          inventory[i].setStock(s);
          // addPayment database
          return true;
      }
    }
    return false;
  }

  public String getPrintedCatalogue()
  {
    String result = "id)\tName\t\t\t\tRating\t\t\tPrice\tStock\n";
    for(int i = 0 ; i<inventory.length ; i++){
        result += inventory[i].getPrintView() + "\n";
    }
    return result;
  }

  public void loadDatabase()
  {
    try
    {
      FileReader reader = new FileReader(dataFile);
      BufferedReader database= new  BufferedReader(reader);
      int videogames = 0;

      while( database.readLine() != null )
      {
        System.out.println("Read line");
        videogames++;
      }
      inventory = new Videogame[videogames];
      database.close();
      reader = new FileReader(dataFile);
      database = new BufferedReader(reader);
      String str = "";
      videogames = 0;
      while( (str = database.readLine()) != null )
      {
        inventory[videogames] = new Videogame(str);
        videogames++;
      }
      database.close();

    }
    catch(IOException ioe)
    {
      System.out.println("Exception " + ioe);
    }
  }

  public void saveDatabase()
  {
      // please make backup before doing this!!!
      try
      {
          FileWriter file = new FileWriter(dataFile);
          PrintWriter printer = new PrintWriter(file, true);

          for(int i = 0; i < inventory.length ;i++)
          {
            printer.println( inventory[i] );
          }
          printer.close();

      }
      catch(IOException ioe)
      {
        System.out.println("Exception " + ioe);
      }
  }

}