class Universe{
    SpaceShip spaceShip;
    Planet[] planets;
    int actualPlanetCounter = 0;

    public Universe(){
      planets = new Planet[20];
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
      if(actualPlanetCounter >= planets.length )
        return null;
      return planets[actualPlanetCounter++];
    }

    public void runDays(){
      int day = 0;
      Planet actualPlanet = getNextPlanet();
      while(day < 30 && actualPlanet != null){

        spaceShip.mine(actualPlanet);

        if(actualPlanet.isEmpty()){
          System.out.println(day+") \t\tCaptain's log " + spaceShip + " \t\t" + actualPlanet);
          actualPlanet = getNextPlanet();

        }
        day++;

      }

      System.out.println("Mined " + spaceShip  + " in " + day + " days");
    }

    public static void main(String args[]){

      Universe u = new Universe();
      u.runDays();
    }

}
