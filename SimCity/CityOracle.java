import java.io.*;
import java.util.*;

class CityOracle{
  PrintWriter writer;
  BufferedReader reader;
  City city;

  public CityOracle(){

    try{
      writer = new PrintWriter(new OutputStreamWriter(System.out) , true );
      reader = new BufferedReader(new InputStreamReader(System.in) );
      city = new City();
      try{
        city.readFile("default.city");
      }catch(Exception c){
        writer.println("Could not read file");
      }
    }catch(Exception e){
      System.out.println("Problem " + e);
    }
  }

  public void showReport() {
      try{
        writer.println(city.getReport());
      }catch(Exception e){
        System.out.println("Problem with report output");
      }
  }

  public int doMenu(){
    writer.println("0) Exit");
    writer.println("1) Pollution of the city");
    writer.println("2) Population of the city");
    writer.println("3) Load new city");
    writer.println("4) General Report");
    writer.println("5) Error Report");
    writer.println("6) Print city");

    writer.print("Selection:"); writer.flush();
    try{
      return Integer.parseInt(reader.readLine());
    }catch(Exception e){
      return -1;
    }
  }

  public void inputNewFile(){

    try{
      String newFile = (reader.readLine());
      city.cleanse();
      city = new City();
      city.readFile(newFile);
      writer.println("New city loaded! (" + newFile+")");
    }catch(Exception e){
      System.out.println(e);
    }
  }

  public void doLoop() {

    int option = -1;
    while( option != 0){
      option = doMenu();
      if( option == 1){
          writer.println("Total pollution " + city.getPollution() );
      }
      if( option == 2){
          writer.println("Total population " + city.getPopulation() );
      }
      if( option == 3){
          writer.print("New file "); writer.flush();
          inputNewFile();
      }
      if( option == 4){
          showReport();
      }
      if( option == 5){
          writer.println("Errors on planning " + city.getErrors());
      }
      if( option == 6){
          writer.println(city.getPrintedMap());
      }

    }

    try{
      reader.close();
      writer.close();
    }catch(Exception e){
      System.out.println("Ex:"+ e);
    }
  }


  public static void main(String args[]){

      (new CityOracle()).doLoop();

  }
}
