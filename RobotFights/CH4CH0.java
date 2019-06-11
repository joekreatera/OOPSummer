public class CH4CH0 extends Robot{

  public CH4CH0(int ox, int oy){
    super(ox, oy,300,2,2);
    this.setAttackSlots(3);
    this.setDefenseSlots(4);
    this.addAttack( new ClashWeapon(5) );
    this.addAttack( new ElectricalWeapon(10) );
    this.addAttack( new FireWeapon(4) );
    this.addDefense(new ElectricalDefense(5));
    this.addDefense(new FireDefense(7));
    this.addDefense(new ClashDefense(6));
    this.addDefense(new ClashDefense(4));
  }
}
