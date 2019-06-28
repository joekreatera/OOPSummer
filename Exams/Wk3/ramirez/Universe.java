class Universe{
    SpaceShip spaceShip;
    Planet[] planets;
    Planet[] planeta;
    int actualPlanetCounter = 0;
    String str = "";

    public Universe()
    {
      planets = new Planet[20];
      planeta = new Planet[20];
      PlanetNamesCatalogue.initNames();
      int div = PlanetNamesCatalogue.getLength()/planets.length;

      String str = "";
      for( int i = 0; i < planets.length ; i++){
          planets[i] = new Planet( PlanetNamesCatalogue.getRandomName( div*i, div*i+div ),
                                   (int)(Math.random()*Planet.MAX_RESOURCE_AMOUNT+Planet.MIN_RESOURCE_AMOUNT)
                                  );
          str += planets[i]+",";
      }
      spaceShip = new SpaceShip("Nabuchedenezaar", (int)(1+Math.random()*SpaceShip.MAX_MINING_PER_DAY));
      System.out.println("Universe created with " + str);
    }

    public Planet getNextPlanet(){
      // remember that ++ , uses and the increments!!!
      // to test, check the name of the first planet, that should be the first planet to be done
      if(actualPlanetCounter >= planeta.length )
        return null;
      return planeta[actualPlanetCounter++];
    }

    public String runDays(Planet[] planetas){
      int day = 0;
      for(int i=0;i<20;i++)
      {
      	planeta[i]=planetas[i];
      }
      Planet actualPlanet = getNextPlanet();
      while(day < 30 && actualPlanet != null){

        spaceShip.mine(actualPlanet);

        if(actualPlanet.isEmpty()){
          System.out.println(day+") \t\tCaptain's log " + spaceShip + " \t\t" + actualPlanet);
          str = str + day+") \t\tCaptain's log " + spaceShip + " \t\t" + actualPlanet + "\n";
          actualPlanet = getNextPlanet();

        }
        day++;
      }
      System.out.println("Mined " + spaceShip  + " in " + day + " days");
      str = str + "Mined " + spaceShip  + " in " + day + " days";
      return str;
    }
    
	public Planet[] getPlanets()
  	{
  		return planets;		
  	}
  	
    public static void main(String args[]){

      Universe u = new Universe();
      //u.runDays();
    }

}