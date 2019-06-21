import java.io.*;
public class CityOracle{

/*

Grade:

Compile 10
Run 10
Job: 4/5 (Load new city did not work out)

Everything was just fine. The load new city was almost ready, you should have asked the user for the filename

*/


City mycity;

public CityOracle(){
  mycity= new City();
}


  public String printMenu(){
    String str = "";
    str = "------------------------------\n";
    str += "Welcome to the sims city\n";
    str += "Options (select the number you need):\n";
    str += "1)Get Pollution in the city\n";
    str += "2)Get Population in the city\n";
    str += "3)Load new city\n";
    str += "4)Get Qty report\n";
    str += "5)Get city errors\n";
    str += "6)Exit\n";
    str += "------------------------------\n";
    return str;
  }

  public void doUI(){
      boolean doExit = false;
      try{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

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
            mycity.totalcontamination();
          }
          if( option == 2){
            mycity.poblaciontotal();
          }

          if( option == 3){
            mycity.NewCityy();
          }

          if( option == 4){
            mycity.contadores();
          }

          if( option == 5){
            mycity.totalerrors();
          }

          if( option == 6){
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
    CityOracle cityoracle= new CityOracle();
    cityoracle.doUI();
  }
}
