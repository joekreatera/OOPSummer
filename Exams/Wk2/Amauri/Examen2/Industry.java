public class Industry extends Property{

  public Industry(){
    super();
    this.setType(PROPERTY_TYPE.INDUSTRY);
    this.getSizee(this);
    this.getThePopulation(this);
    this.getThePollution(this);
  }

  @Override
  public String toString(){

    return "," + size + ", " + population + "," + pollution;
  }
}
