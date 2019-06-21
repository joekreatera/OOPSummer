public class Store extends Property{
  public Store(){
    super();
    this.type=TYPE.STORE;
    this.pop=ValueTable.getpop(this);
    this.pol=ValueTable.getpol(this);
  }
}
