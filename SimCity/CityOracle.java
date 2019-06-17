import java.io.*;
import java.util.*;

class CityOracle{
  PrintWriter writer;
  BufferedReader reader;
  City city;

  public CityOracle(){
    writer = new PrintWriter(new OutputStreamWriter(System.out) , true );
    reader = new BufferedReader(new InputStreamReader(System.in) );
    city = new City();
    city.readFile("default.city");
  }

  public int doMenu(){
    writer.println("0) Exit");
    writer.println("1) Pollution of the city");
    writer.println("2) Population of the city");
    writer.println("3) Load new city");
    writer.println("4) General Report");
    writer.println("5) Error Report");

    writer.print("Selection:"); writer.flush();
    try{
      return Integer.parseInt(reader.readLine());
    }catch(Exception e){
      return -1;
    }


  }

  public void doLoop() {

    int option = -1;
    while( option != 0){
      option = doMenu();
      if( option == 1){

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
