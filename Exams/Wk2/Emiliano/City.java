import java.io.*;
import javax.swing.JOptionPane;
public class City{
  int [][]CityPlan=new int [8][8];
  int [][]HouseStats;
  int [][]StoreStats;
  int [][]IndustryStats;
  int numHouses;
  int numStores;
  int numIndustries;
  int numEmptys;
  float totalPollution;
  float totalPopulation;
  int storesone;
  int storestwo;
  int storesthree;
  int housesone;
  int housestwo;
  int housesthree;
  int industriesone;
  int industriestwo;
  int industriesthree;
  int houseIndustryE=0;
  int t2industryt3store;

public void readDesign(){
  try{
  String line;
  FileReader reader = new FileReader("CityDesign.txt");
  BufferedReader buff = new BufferedReader(reader);
  for (int j=0;j<=7;j++){
  line=buff.readLine();
  for(int i=0;i<=7;i++){
    CityPlan[j][i]=Character.getNumericValue (line.charAt(i));
  }
}

  }
  catch(IOException ioe){
      System.out.println("Exception " + ioe);
    }
}

public void setNumProperties(){
  for(int i = 0; i < 8; i++)
  {
     for(int j = 0; j < 8; j++)
     {
        if(CityPlan[i][j]==0){
          numEmptys++;
        }
        if(CityPlan[i][j]==1){
          numHouses++;
          }

        if(CityPlan[i][j]==2){
          numStores++;
        }
        if(CityPlan[i][j]==3){
          numIndustries++;

          }

        }
     }
  }


public void setPropertyStats(){
   HouseStats=new int[numHouses][3];
   StoreStats=new int[numStores][3];
   IndustryStats=new int[numIndustries][3];
   int houses=0;
   int stores=0;
   int industries=0;
  House casa= new House();
  Store tienda=new Store();
  Industry industria=new Industry();
  for(int i = 0; i < 8; i++)
  {
     for(int j = 0; j < 8; j++)
     {
       if (CityPlan[i][j]==1){
         casa.setHouseData();
         HouseStats[houses][0]=j;
         HouseStats[houses][1]=i;
         HouseStats[houses][2]=casa.getType();
         if(casa.getType()==1)housesone++;
         if(casa.getType()==2)housestwo++;
         if(casa.getType()==3)housesthree++;
         totalPopulation+=casa.getPopulation();
         totalPollution+=casa.getPollution();
         houses++;
       }
       if (CityPlan[i][j]==2){
         tienda.setStoreData();
         StoreStats[stores][0]=j;
         StoreStats[stores][1]=i;
         StoreStats[stores][2]=tienda.getType();
         if(tienda.getType()==1)storesone++;
         if(tienda.getType()==2)storestwo++;
         if(tienda.getType()==3)storesthree++;
         totalPopulation+=tienda.getPopulation();
         totalPollution+=tienda.getPollution();
         stores++;
     }
     if (CityPlan[i][j]==3){
       industria.setIndustryData();
       IndustryStats[industries][0]=j;
       IndustryStats[industries][1]=i;
       IndustryStats[industries][2]=industria.getType();
       if(industria.getType()==1)industriesone++;
       if(industria.getType()==2)industriestwo++;

       if(industria.getType()==3)industriesthree++;
       totalPopulation+=industria.getPopulation();
       totalPollution+=industria.getPollution();
       industries++;
  }
}
}
}

public void getTotalPollution(){
  System.out.println("Total Pollution : "+totalPollution+" Kg.");

}
public void getTotalPopulation(){
  System.out.println("Total Population : "+totalPopulation);
}
public void printQty(){
  System.out.println("City Plan Stats: \n");
  System.out.println("Total city size: 64 ");
  System.out.println("Occupied Space: "+(numHouses+numStores+numIndustries));
  System.out.println("Empty Slots: "+numEmptys);
  System.out.println("Total Houses: "+numHouses);
  System.out.println("Houses Type One: "+housesone);
  System.out.println("Houses Type Two: "+housestwo);
  System.out.println("Houses Type Three: "+housesthree);
  System.out.println("Total Stores: "+numStores);
  System.out.println("Stores Type One: "+storesone);
  System.out.println("Stores Type Two: "+storestwo);
  System.out.println("Stores Type Three: "+storesthree);
  System.out.println("Total Industries: "+numIndustries);
  System.out.println("Industries Type One: "+industriesone);
  System.out.println("Industries Type Two: "+industriestwo);
  System.out.println("Industries Type Three: "+industriesthree);

}

public void getCityErrors(){
int x;
int y;
for(int i=0;i<numHouses;i++){
   x=HouseStats[i][0];
   y=HouseStats[i][1];
    for(int j=0;j<numIndustries;j++){
      if(IndustryStats[j][1]==y){
      if(IndustryStats[j][0]==x-1||IndustryStats[j][0]==x+1){
        houseIndustryE++;
      }
    }
    if(IndustryStats[j][0]==x){
      if(IndustryStats[j][1]==y-1||IndustryStats[j][1]==y+1){
        houseIndustryE++;
      }

    }
}
}
for(int i=0;i<numIndustries;i++){
   x=IndustryStats[i][0];
   y=IndustryStats[i][1];
    for(int j=0;j<numStores;j++){
      if(IndustryStats[i][2]==2&&StoreStats[j][2]==3){
      if(StoreStats[j][1]==y){
      if(StoreStats[j][0]==x-1||StoreStats[j][0]==x+1){
        t2industryt3store++;
      }
    }
    if(StoreStats[j][0]==x){
      if(StoreStats[j][1]==y-1||StoreStats[j][1]==y+1){
        t2industryt3store++;
      }

    }

}
}
}

  System.out.println("Houses next to Industries errors : "+ houseIndustryE);
  System.out.println("Type 2 Industries next to Type 3 Stores errors : "+ t2industryt3store);
  System.out.println("Total Errors: "+(houseIndustryE+t2industryt3store));
}

 public void loadNewCity(){
   String fila;

      try{
          FileWriter ingecivil = new FileWriter("CityDesign.txt");
          PrintWriter arquitecto = new PrintWriter(ingecivil, true);
          for(int i=0;i<=7;i++){
            fila=JOptionPane.showInputDialog("Write the 8 digits[0,3] of row "+i);
            if(fila.length()<8){
              while(fila.length()<8){
                fila+="0";
              }

            };
            arquitecto.println(fila.substring(0,8));
          }
          JOptionPane.showMessageDialog(null, "Reboot the program in order to load your new city");
          arquitecto.close();

      }catch(IOException ioe){
        System.out.println("Exception " + ioe);
      }
  }

 }
