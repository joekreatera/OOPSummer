//Carmen Sandoval - A01368019

/*
Compile: 5/10. Version was sent with compiled class files. With those, program did actually run. Once the class files were erased, it did not compile: Possible casuses: all of that was compiled at different times. 
Run: 5:10 . It did run withoud the rebuilt class files
Job: 0/5 Any of the options did run

*/

import java.io.*;
import java.util.*;

public class CityOracle {

    City pcity;

    public CityOracle() {
      pcity= new City("DataFile.txt");
      pcity.loadFile();
    }

    public String printMenu() {
      String str="";
      str="Bienvenido\n";
      str +="Seleccione action:\n";
      str +="1)Obtener pollution\n";
      str +="2)Obtener poblacion de la ciudad\n";
      str +="3)Cargar nueva ciudad\n";
      str +="4)Reporte total\n";
      str +="5)Excepciones\n";
      str +="6)Salir\n";
      str +="----------------------------\n";
      return str;
    }

    public void doMenu() {
      boolean doExit = false;
      try{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(!doExit){
          System.out.println(printMenu());
          System.out.print("Seleccion:");
          String response = in.readLine();
          int option = 0;
          try{
            option = Integer.parseInt(response);
          }catch(NumberFormatException nfe){
            option = 0;
            System.out.println("Opcion invalida, intente de nuevo.");
          }

          if( option == 1){
  //          System.out.println(pcity.getTotalPollution());
          }
          if(option == 2){
//            System.out.println(pcity.getTotalPoblation());

          }
          if(option == 3){
			pcity.loadFile();
          }
          if( option == 4){
//			System.out.println(pcity.getReport());
          }
          if( option == 5){
//			System.out.println(pcity.getExceptions());
          }
          if( option == 6){
              doExit = true;
              in.close();
          }
        }
      }catch(IOException ioe){
        System.out.println("Error " + ioe);
      }

      System.out.println("Programa terminado");
    }



    public static void main(String args[]) {
      CityOracle oracle = new CityOracle();
      oracle.doMenu();
    }
}
