import java.io.*;

/*
COmpile: 10
RUn: 10
Jobs: almost everythiong was done in the right way. The random city was "load new city" from a new file!. 
		Great for the Print city 
	
*/
public class CityOracle{

  Property[][] city = new Property[8][8];

  public void generateCity(){
    try{
      int i = 0;
      int j = 0;
      String line = "";
      int ref;
      BufferedReader reader = new BufferedReader(new FileReader("MyCity.city"));
      while((line = reader.readLine()) != null){
        for(j = 0; j < 8; j++){
          ref = line.charAt(j);
          if(ref == 48){
            city[j][i] = new Property(j, i, Property.PROPERTY_TYPE.NONE);
          }
          if(ref == 49){
            city[j][i] = new Property(j, i, Property.PROPERTY_TYPE.HOUSE);
          }
          if(ref == 50){
            city[j][i] = new Property(j, i, Property.PROPERTY_TYPE.STORE);
          }
          if(ref == 51){
            city[j][i] = new Property(j, i, Property.PROPERTY_TYPE.INDUSTRY);
          }
        }
        i++;
      }
    }
    catch(IOException ioe){
      System.out.println("Exception " + ioe);
    }
  }

  public int askInput(){
    try{
      BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
      String answer = input.readLine();
      if(answer.equals("0")){ return 0; }
      if(answer.equals("1")){ return 1; }
      if(answer.equals("2")){ return 2; }
      if(answer.equals("3")){ return 3; }
      if(answer.equals("4")){ return 4; }
      if(answer.equals("5")){ return 5; }
      if(answer.equals("6")){ return 6; }
      if(answer.equals("7")){ return 7; }
      else{
        System.out.println("Not a valid input. Try again.");
        return 10;
      }
    }
    catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
    return 10;
  }

  public void printCity(){
    int i = 0;
    int j = 0;
    for(i = 0; i < 8; i++){
      for(j = 0; j < 8; j++){
        System.out.println(city[j][i]);
      }
    }
  }

  public void totalPopulation(){
    int totalPeople = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i < 8; i++){
      for(j = 0; j < 8; j++){
        totalPeople += city[j][i].getPeople();
      }
    }
    System.out.println("\nTotal Population of your City: "+totalPeople+"\n");
  }

  public void totalPollution(){
    float totalPollution = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i < 8; i++){
      for(j = 0; j < 8; j++){
        totalPollution += city[j][i].getPollution();
      }
    }
    System.out.println("\nYour city generates "+totalPollution+"kg of pollution per day!\n");
  }

  public void totalBuildings(){
    int totalBuildings = 0;
    int houses = 0;
    int stores = 0;
    int industries = 0;
    int i = 0;
    int j = 0;
    for(i = 0; i < 8; i++){
      for(j = 0; j < 8; j++){
        if(city[j][i].getType() != Property.PROPERTY_TYPE.NONE){
          totalBuildings ++;
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE){
            houses ++;
          }
          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE){
            stores ++;
          }
          if(city[j][i].getType() == Property.PROPERTY_TYPE.INDUSTRY){
            industries ++;
          }
        }

      }
    }
    System.out.println("\nYour city has a total of "+totalBuildings+" properties, of which:");
    System.out.println(""+houses+" Are Houses");
    System.out.println(""+stores+" Are Stores");
    System.out.println(""+industries+" Are Industries");
    System.out.println(""+(64-totalBuildings)+" Are Empty Terrains\n");
  }


  public void checkErrors(){
    int totalErrors = 0;
    for(int i = 0; i <= 7; i++){
      for(int j = 0; j <= 7; j++){

          // TESTING FOR HOUSES AND INDUSTRIES

// CORNERS
        if(j==0 && i==0){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j+1][i].getLevel() == 2 ||
          city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i+1].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
        if(j==7 && i==0){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j-1][i].getLevel() == 2 ||
          city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i+1].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
        if(j==0 && i==7){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j+1][i].getLevel() == 2 ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i-1].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
        if(j==7 && i==7){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[6][7].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[7][6].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[7][7].getPosX()+","+city[7][7].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[6][7].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[6][7].getLevel() == 2 ||
          city[7][6].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[7][6].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
// BORDERS WITHOUT CORNERS
        if(j>0 && j<7 && i==0){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j+1][i].getLevel() == 2 ||
          city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j-1][i].getLevel() == 2 ||
          city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i+1].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
        if(j>0 && j<7 && i==7){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j+1][i].getLevel() == 2 ||
          city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j-1][i].getLevel() == 2 ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i-1].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
        if(i>0 && i<7 && j==0){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i+1].getLevel() == 2 ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i-1].getLevel() == 2 ||
          city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j+1][i].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
        if(i>0 && i<7 && j==7){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY ||
          city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i+1].getLevel() == 2 ||
          city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i-1].getLevel() == 2 ||
          city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j-1][i].getLevel() == 2)){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
// THE REST OF THE PROPERTIES
        if(j>0 && j<7 && i>0 && i<7){
          if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE &&
          (city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY
          || city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY
          || city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY
          || city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY)){
            totalErrors++;
            System.out.println("Generation error: House at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry");
          }

          if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE && city[j][i].getLevel() == 3 &&
          (city[j][i+1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i+1].getLevel() == 2
          || city[j][i-1].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j][i-1].getLevel() == 2
          || city[j+1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j+1][i].getLevel() == 2
          || city[j-1][i].getType() == Property.PROPERTY_TYPE.INDUSTRY && city[j-1][i].getLevel() == 2 )){
            totalErrors++;
            System.out.println("Generation error: Store (Lvl.3) at "+city[j][i].getPosX()+","+city[j][i].getPosY()+" collides with an Industry (Lvl.2)");
          }
        }
      }
    }
    System.out.println("\nErrors in generation: "+totalErrors+"\n");
  }

  public void printMap(){
    System.out.println("\n                  C I T Y   M A P\n\n");
    System.out.println("        0    1    2    3    4    5    6    7");
    String map = "      -----------------------------------------\n";
    for(int i = 0; i < 8; i++){
      map += "    "+i+" | ";
      for(int j = 0; j < 8; j++){
        //map += "O";
        if(city[j][i].getType() == Property.PROPERTY_TYPE.NONE){
          map += " ";
          map += " ";
        }
        if(city[j][i].getType() == Property.PROPERTY_TYPE.HOUSE){
          map += "H";
          map += ""+city[j][i].getLevel();
        }
        if(city[j][i].getType() == Property.PROPERTY_TYPE.STORE){
          map += "S";
          map += ""+city[j][i].getLevel();
        }
        if(city[j][i].getType() == Property.PROPERTY_TYPE.INDUSTRY){
          map += "F";
          map += ""+city[j][i].getLevel();
        }
        map += " | ";
      }
      map += "\n      -----------------------------------------\n";
    }
    System.out.println(map);
    System.out.println("H = House");
    System.out.println("S = Store");
    System.out.println("F = Factory\n");
  }


  public void randomCity(){
    String matrix = "";
    String line = "";
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 8; j++){
        line += ""+(int)(Math.random()*4);
        if(j == 7){ line += "\n"; }
      }
      matrix += line;
      line = "";
    }
    try{
      FileWriter writer = new FileWriter("MyCity.city");
      PrintWriter printer = new PrintWriter(writer, true);
      printer.print(matrix);
      printer.close();
    }
    catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
  }



  public static void main(String args[]){
    int response = 10;
    CityOracle myOracle = new CityOracle();
    myOracle.generateCity();
    System.out.println("\nCreating city based on file layout...");
    try{Thread.sleep(2000);}
    catch(InterruptedException ex){Thread.currentThread().interrupt();}
    System.out.println("\nBuilding Houses, Stores and Industries...");
    try{Thread.sleep(2000);}
    catch(InterruptedException ex){Thread.currentThread().interrupt();}
    System.out.println("\nWaiting for people to move in...\n");
    try{Thread.sleep(2000);}
    catch(InterruptedException ex){Thread.currentThread().interrupt();}
    System.out.println("==================== CITY SIMULATOR ====================");
    while(response != 0){
      System.out.println("========================================================");
      System.out.println("=             What would you like to do?               =");
      System.out.println("=                                                      =");
      System.out.println("=           [1] Generate a new Random City             =");
      System.out.println("=                [2] Print City Data                   =");
      System.out.println("=              [3] Check City Population               =");
      System.out.println("=            [4] Check City Pollution (Kg)             =");
      System.out.println("=       [5] Check Property Types and Quantities        =");
      System.out.println("=       [6] Check for errors in City Generation        =");
      System.out.println("=                 [7] Print City Map                   =");
      System.out.println("=                      [0] Exit                        =");
      System.out.println("=                                                      =");
      System.out.println("========================================================");

      response = myOracle.askInput();

      if(response == 1){
        myOracle.randomCity();
        myOracle.generateCity();
        System.out.println("\n New city generated! \n");
      }
      if(response == 2){
        myOracle.printCity();
      }
      if(response == 3){
        myOracle.totalPopulation();
      }
      if(response == 4){
        myOracle.totalPollution();
      }
      if(response == 5){
        myOracle.totalBuildings();
      }
      if(response == 6){
        myOracle.checkErrors();
      }
      if(response == 7){
        myOracle.printMap();
      }
    }
    System.out.println("COME BACK SOON!");

  }

}
