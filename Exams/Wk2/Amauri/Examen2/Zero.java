public class Zero extends Property{

  public Zero(){
    super();
    this.setType(PROPERTY_TYPE.NONE);
    this.setSize(PROPERTY_SIZE.SMALL);
    this.setPopulation(0f);
    this.setPollution(0f);
  }

  @Override
  public String toString(){

    return "," + size + ", " + population + "," + pollution;
  }
}
