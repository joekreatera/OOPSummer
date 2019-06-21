import java.io.*;

/*
Compile 10
Run 10
Job 
From the tasks, only view catalogue, buy videogame and add to stock did work. 
3/6s

*/
public class VideogameStoreUI
{

  VideogameStore store;

  public VideogameStoreUI()
  {
    store = new VideogameStore("db.vg");
    store.loadDatabase();
    store.saveDatabase();
  }
  
  public String printMenu()
  {
    String str = "";
    str = "------------------------------\n";
    str += "Welcome to GameStop. Please help\n\n";
    str += "Options (select the number you need):\n\n";
    str += "1)View catalogue\n";
    str += "2)Buy videogame\n";
    str += "3)Add videogame\n";
    str += "4)Add to stock\n";
    str += "5)Add a promotion\n";
    str += "6)View Sales\n";
    str += "7)Exit\n";
    str += "-----------------------------\n";
    return str;
  }
  
  public void doRestock(BufferedReader in) throws IOException
  {
  	int stockOption = -1;
  	while(stockOption != 0)
  	{
  		try
  		{
  			System.out.print("Videogame Id: ");
  			long id = Long.parseLong(in.readLine());
  			boolean found = store.restockVideogame(id);
  			if(!found)
  			{
  				System.out.println("\nVideogame not found. Please try again\n");
  			}
  			else
  			{
  				store.saveDatabase();
  				System.out.println("\n selected videogame's stock increased by 1\n");
  			}
  			stockOption = 0;
  		}
  		catch(NumberFormatException nfe)
  		{
  			System.out.println("\nNot a valid ID. Press (0) to return\n");
  		}
  	}
  }
	
  public void doSale(BufferedReader in) throws IOException
  {
    int option = -1;
    while( option != 0)
    {
      try
      {
        System.out.print("Videogame Id: ");
        long id = Long.parseLong(in.readLine());
        boolean found = store.sellVideogame(id);
        if( !found )
        {
          System.out.println("\nVideogame not found // Or not enough units!!!\n");
        }
        else
        {
          store.saveDatabase();
          System.out.println("\nVideogame sold!\n");
        }
        option = 0;
      }
      catch(NumberFormatException nfe)
      {
        System.out.println("\nThat's not a valid Id.  (0) to return.\n");
      }
    }
  }

  public void doUI()
  {
      boolean doExit = false;
      try
      {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(!doExit)
        {
          System.out.println(printMenu());
          System.out.print("Selection:");
          String response = in.readLine();
          int option = 0;
          try
          {
            option = Integer.parseInt(response);
          }
          catch(NumberFormatException nfe)
          {
            option = 0;
            System.out.println("\nDidn't catch your option!. Again.\n");
          }

          if( option == 1)
          {
            System.out.println(store.getPrintedCatalogue());
          }
          if(option == 2)
          {
            doSale(in);
          }
          if(option == 4)
          {
          	doRestock(in);
          }
          if( option == 7)
          {
              doExit = true;
              in.close();
          }
        }
      }
      catch(IOException ioe)
      {
        System.out.println("Error " + ioe);
      }
      System.out.println("Program terminated!");
  }

  public static void main(String args[])
  {
    VideogameStoreUI ui = new VideogameStoreUI();
    ui.doUI();
  }
}