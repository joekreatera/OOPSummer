public class House extends Property{
  public House(){
    super();
    this.type=TYPE.HOUSE;
    this.pop=ValueTable.getpop(this);
    this.pol=ValueTable.getpol(this);
  }
}
