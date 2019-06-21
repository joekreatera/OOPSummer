import java.io.*;

/*
compile: 10
RUn: 10
Job: 5/5
*/


public class CityOracle{
  City Llanaslandia=new City();
  public CityOracle(){
    Llanaslandia.readDesign();
    Llanaslandia.setNumProperties();
    Llanaslandia.setPropertyStats();
  }
public String printMenu(){
    String str = "";
    str = "------------------------------\n";
    str += "Welcome to Cities: skylines v. 0.0.0.0.0.0.0.0.0.0.0.0.0.1\n";
    str += "Options (select the number you need):\n";
    str += "1)Get pollution in the city\n";
    str += "2)Get population in the city\n";
    str += "3)Load new City\n";
    str += "4)Get the city's plan statistics\n";
    str += "5)Get the city's plan mistakes\n";
    str += "6)Exit\n";
    str += "------------------------------\n";
    return str;
  }
  public void doUI(){
      boolean doExit = false;
      try{
        BufferedReader in = new BufferedReader(
                                        new InputStreamReader(System.in));

        while(!doExit){
          System.out.println("------------------------------\n");
          System.out.println("Llanasland: ");
          for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
              System.out.print(Llanaslandia.CityPlan[i][j]);
            }
            System.out.println();
          }
          System.out.println("------------------------------\n");
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
              Llanaslandia.getTotalPollution();
          }
          if(option == 2){
              Llanaslandia.getTotalPopulation();
          }
          if(option == 3){
              Llanaslandia.loadNewCity();
          }
          if(option == 4){
              Llanaslandia.printQty();
          }
          if(option == 5){
              Llanaslandia.getCityErrors();
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

  public static void main(String args []){
    CityOracle Orale=new CityOracle();
    Orale.doUI();

  }
}
