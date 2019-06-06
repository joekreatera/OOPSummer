public class Catalogue{

  Beverage[] baseBeverages;

  public Catalogue(){
      baseBeverages = new Beverage[5];
      baseBeverages[0] = new Beverage(
        Beverage.SMALL,
        Beverage.HOT,
        Beverage.COFFEE,
        10.0f,
        30.0f,
        "Cafe basico",
        Beverage.NONE,
        Beverage.NONE
      );

  }

}
