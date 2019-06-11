public class J03 extends Robot{

  public J03(int ox, int oy){
      super(ox,oy,100,4,3);
      this.setAttackSlots(4);
      this.setDefenseSlots(2);
      this.addAttack( new Weapon() );
      this.addAttack( new Weapon() );
      this.addAttack( new Weapon() );
      this.addAttack( new Weapon() );
      this.addDefense(new Defense());
      this.addDefense(new Defense());
  }

}
