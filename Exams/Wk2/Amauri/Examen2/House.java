public class House extends Property{

  public House(){
    super();
    this.setType(PROPERTY_TYPE.HOUSE);
    this.getSizee(this);
    this.getThePopulation(this);
    this.getThePollution(this);
  }

  @Override
  public String toString(){

    return "," + size + ", " + population + "," + pollution;
  }

}
