/*
Way too interesting the thinking of the Universe inside the mySpaceShip
Good names for the planets **cough
Pretty good job.
Compile: 20
Runs: 20
Job: 20
*/
public class SpaceTravel{

Universe myUniverse;
SpaceShip mySpaceShip;
public SpaceTravel(){
  myUniverse= new Universe();
  mySpaceShip= new SpaceShip(0f);


}


public Universe getUniverse(){
  return myUniverse;
}

public SpaceShip getSpaceShip(){
  return mySpaceShip;
}

public void thirtydays(){
        SpaceShip nave= getSpaceShip();
        Planet planeta= getUniverse().getRPR();

        float goldenplaneta=planeta.getGold();
        float goldinship=getSpaceShip().getSpaceShipGold();
        float goldminado=0;
         float goldenplanetabicho=0;

        for(int day=0; day<30; day++){
          System.out.println("\n");
          System.out.println("Estamos minando ahora en: " +planeta.getPlanetName());
           goldminado= goldenplaneta - (goldenplaneta-((int)(Math.random()*1000)));
           goldinship= goldminado+goldinship;
           goldenplaneta= goldenplaneta-goldminado;
           System.out.println("El oro que se mino hoy fue: " + goldminado);
           System.out.println("El oro que queda en: " + planeta.getPlanetName() + " " + "es: "  + goldenplaneta);
           if(goldenplaneta<=0){
             goldenplanetabicho= goldinship+goldenplaneta;
             System.out.println("El oro que se mino en: " + planeta.getPlanetName() + " " + "fue: " + (goldenplanetabicho));
             System.out.println("ya se acabo el oro, amonos a otro planeta prro");

             planeta= getUniverse().getNext();
             goldenplaneta= planeta.getGold();
           }
        }
        System.out.println("\n");
        System.out.println("Se acabo la temporada de minar");
        System.out.println("El oro que se mino en: " + planeta.getPlanetName() + " " + "fue: " + (planeta.getGold()-goldenplaneta));
        System.out.println("El oro total que hay en la nave ahora es de: " + (goldenplanetabicho+(planeta.getGold()-goldenplaneta)));






}


public static void main(String args[]){
  SpaceTravel travel= new SpaceTravel();
  System.out.println(travel.getUniverse());
  System.out.println(travel.getSpaceShip());
  travel.thirtydays();
}




}
