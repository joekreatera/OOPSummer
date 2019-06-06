public class Catalogue{

  Beverage[] baseBeverages;

  public Catalogue(){
      baseBeverages = new Beverage[5];
      baseBeverages[0] = new Beverage(Beverage.SMALL,Beverage.HOT,Beverage.COFFEE,  10.0f,  30.0f,"Cafe basico",  Beverage.NONE,Beverage.NONE);
      baseBeverages[1] = new Beverage(Beverage.LARGE,Beverage.HOT,Beverage.COFFEE,  15.0f,  45.0f,"Cafe grande",  Beverage.NONE,Beverage.NONE);
      baseBeverages[2] = new Beverage(Beverage.SMALL,Beverage.COLD,Beverage.COFFEE,  10.0f,  30.0f,"Cafe de fresa ch",  Beverage.STRAWBERRY,Beverage.WHIPPED_CREAM);
      baseBeverages[3] = new Beverage(Beverage.LARGE,Beverage.COLD,Beverage.COFFEE,  20.0f,  40.0f,"Cafe de fresa gd",  Beverage.STRAWBERRY,Beverage.WHIPPED_CREAM);
      baseBeverages[4] = new Beverage(Beverage.LARGE,Beverage.COLD,Beverage.TEA,  5.0f,  40.0f,"Te basico",  Beverage.MANGO,Beverage.NONE);

  }

}
