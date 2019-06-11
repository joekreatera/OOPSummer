public class J03 extends Robot{

  public J03(int ox, int oy){
      super(ox,oy,100,4,3);
      this.setAttackSlots(4);
      this.setDefenseSlots(2);
      this.addAttack( new FireWeapon(10) );
      this.addAttack( new ElectricalWeapon(5) );
      this.addAttack( new FireWeapon(20) );
      this.addAttack( new ClashWeapon(3) );
      this.addDefense(new ElectricalDefense(9));
      this.addDefense(new ClashDefense(4));
  }

}
