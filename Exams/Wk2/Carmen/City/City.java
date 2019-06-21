import java.io.*;
import java.util.*;

public class City {


  String dataFile = "por_defecto.txt";

    public City (String dataFile) {
      this.dataFile = dataFile;
    }

    public void loadFile() {

		int pronone=0;
		int prohouse=0;
		int prostore=0;
		int proindustry=0;

		try{

        FileReader reader = new FileReader(dataFile);
        BufferedReader input = new BufferedReader(reader);

        String myLine = "";
        while( (myLine = input.readLine()) != null ){
        	int longi = myLine.length();
        	for(int i=0; i<longi; i++) {
        		String prop = myLine.charAt(i) + "";
        		int yoli = Integer.parseInt(prop);
	        		if(yoli==0) {
	        			pronone++;
	        		} else if(yoli==1) {
	        			prohouse++;
	        			this.getQtyHouses();
	        		} else if(yoli==2) {
	        			prostore++;
	        			this.getQtyStores();
	        		} else if(yoli==3) {
	        			proindustry++;
	        			this.getQtyIndustries();
	        		}
        	}
        	              System.out.println("Sin terreno:\t"+pronone+"\tCasas\t"+prohouse+"\tTiendas\t"+prostore+"\tIndustrias\t"+proindustry);
        }
        input.close();
      }catch(FileNotFoundException fnfe){
        System.out.println(fnfe);
      }catch(IOException ioe){
        System.out.println(ioe);
      }
	}

  public void getQtyIndustries() {
    float people = (float)(Math.random()*80+40);
    float pollutionKey = 0;
    int type = 0;
    float totalpKey = 0;
    float totalPeople=0;
    if(people>=40 && people<53) {
      pollutionKey = (float)(Math.random()*103+80);
      type = 1;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion: \t " + people + "\tContaminacion de:\t " + pollutionKey + "\tIndustria tipo: \t " + type);
      System.out.println("Poblacion total industrias tipo 1: \t" + totalPeople + "\tContaminacion total industrias tipo 1: \t" + totalpKey);
    } else if(people>=53 && people<66) {
      pollutionKey = (float)(Math.random()*126+103);
      type = 2;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion: \t " + people + "Contaminacion de:\t " + pollutionKey + "\tIndustria tipo: \t" + type);
      System.out.println("Poblacion total industrias tipo 2:\t" + totalPeople + "\tContaminacion total industrias tipo 2:\t" + totalpKey);
    } else if(people>=66 && people<=80) {
      pollutionKey = (float)(Math.random()*150+126);
      type = 3;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion:\t " + people + "\tContaminacion de:\t " + pollutionKey + "\tIndustria tipo:\t " + type);
      System.out.println("Poblacion total industrias tipo 3:\t" + totalPeople + "\tContaminacion total industrias tipo 3: \t" + totalpKey);
    }
    
    
  }
  
    public void getQtyHouses() {
    float people = (float)(Math.random()*6+2);
    float pollutionKey = 0;
    int type = 0;
    float totalPeople=0;
    float totalpKey=0;
    if(people>=2 && people<4) {
      pollutionKey = (float)(Math.random()*7+5);
      type = 1;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion: \t " + people + "\tContaminacion de:\t " + pollutionKey + "\tCasa tipo:\t " + type);
      System.out.println("Poblacion total casas tipo 1:\t" + totalPeople + "\tContaminacion total casas tipo 1:\t" + totalpKey);
    } else if(people>=4 && people<5) {
      pollutionKey = (float)(Math.random()*9+7);
      type = 2;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion: \t " + people + "\tContaminacion de:\t " + pollutionKey + "\tCasa tipo: \t " + type);
      System.out.println("Poblacion total casas tipo 2: \t" + totalPeople + "\tContaminacion total casas tipo 2:\t" + totalpKey);
    } else if(people>=5 && people<=6) {
      pollutionKey = (float)(Math.random()*10+9);
      type = 3;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion:\t " + people + "\tContaminacion de:\t " + pollutionKey + "\tCasa tipo: \t" + type);
      System.out.println("Poblacion total casas tipo 3:\t" + totalPeople + "\tContaminacion total casas tipo 3:\t" + totalpKey);

    }
  }
  
    public void getQtyStores() {
    float people = (float)(Math.random()*30+20);
    float pollutionKey = 0;
    int type = 0;
    float totalpKey = 0;
    float totalPeople=0;
    if(people>=20 && people<24) {
      pollutionKey = (float)(Math.random()*34+20);
      type = 1;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion:\t " + people + "\tContaminacion de:\t " + pollutionKey + "\tTienda tipo:\t " + type);
      System.out.println("Poblacion total tiendas tipo 1:\t" + totalPeople + "\tContaminacion total tiendas tipo 1:\t" + totalpKey);
    } else if(people>=24 && people<27) {
      pollutionKey = (float)(Math.random()*47+34);
      type = 2;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion:\t " + people + "\tContaminacion de:\t " + pollutionKey + "\tTienda tipo:\t " + type);
      System.out.println("Poblacion total tiendas tipo 2:\t" + totalPeople + "\tContaminacion total tiendas tipo 2:\t" + totalpKey);
    } else if(people>=27 && people<=30) {
      pollutionKey = (float)(Math.random()*60+47);
      type = 3;
      totalPeople=people;
      totalpKey=pollutionKey;
      System.out.println("Poblacion:\t " + people + "Contaminacion de: \t" + pollutionKey + "\tTienda tipo: \t " + type);
      System.out.println("Poblacion total tiendas tipo 3:\t"+ totalPeople + "\tContaminacion total tiendas tipo 3:\t" + totalpKey);
    
 	 }
    }





 /* public String getTotalPollution() {

    }

    public String getTotalPoblation() {

    }

    public String getReport() {

    }

    public String getExceptions() {

    }
 */


}
