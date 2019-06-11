public class Universe{

  int f;
  int e;
  Planet[] planetsUniverse;

  public Universe(){
    planetsUniverse= new Planet[3];
    planetsUniverse[0]= new Planet("bicholandia", 10000.0f );
    planetsUniverse[1]= new Planet("xavi en qatar", 9000.0f);
    planetsUniverse[2]= new Planet("raul seleccion", 3000.0f);
  }

  public Planet getRPR(){


      f=0;
      return planetsUniverse[f] ;
  }

  public Planet getNext(){
    e=1;
    return planetsUniverse[e];
  }

  @Override
  public String toString(){

    String planetsUniverseStr= "";
    for( int i=0; i < planetsUniverse.length; i++)
    {
      planetsUniverseStr += "\n" + planetsUniverse[i];
    }


    return "Impresion de recursos:  " + planetsUniverseStr ;
  }



}
