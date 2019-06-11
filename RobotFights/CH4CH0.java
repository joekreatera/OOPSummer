public class CH4CH0 extends Robot{

  public CH4CH0(int ox, int oy){
    super(ox, oy,300,2,2);
    this.setAttackSlots(3);
    this.setDefenseSlots(4);
    this.addAttack( new Weapon() );
    this.addAttack( new Weapon() );
    this.addAttack( new Weapon() );
    this.addDefense(new Defense());
    this.addDefense(new Defense());
    this.addDefense(new Defense());
    this.addDefense(new Defense());
  }
}
