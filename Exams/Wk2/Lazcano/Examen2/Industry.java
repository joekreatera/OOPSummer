public class Industry extends Property{
  public Industry(){
    super();
    this.type=TYPE.INDUSTRY;
    this.pop=ValueTable.getpop(this);
    this.pol=ValueTable.getpol(this);
  }
}
