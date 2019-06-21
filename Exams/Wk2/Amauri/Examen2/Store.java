public class Store extends Property{

  public Store(){
    super();
    this.setType(PROPERTY_TYPE.STORE);
    this.getSizee(this);
    this.getThePopulation(this);
    this.getThePollution(this);
  }

  @Override
  public String toString(){

    return "," + size + ", " + population + "," + pollution;
  }
}
