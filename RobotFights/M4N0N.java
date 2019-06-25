public class M4N0N extends Robot{

  public M4N0N(int ox, int oy){
      super(ox,oy,180,2,2);
      this.setAttackSlots(3);
      this.setDefenseSlots(3);
      this.addAttack( new FireWeapon(10) );
      this.addAttack( new ElectricalWeapon(5) );
      this.addAttack( new FireWeapon(20) );
      this.addDefense( new FireDefense(13) );
      this.addDefense(new ElectricalDefense(9));
      this.addDefense(new ClashDefense(6));
  }
  @Override
  public String toString(){
      String robot="       _\n";
      robot+="      [ ]\n";
      robot+="     (   )\n";
      robot+="      |>|\n";
      robot+="   __/===\\__\n";
      robot+="  //| o=o |\\\\\n";
      robot+="<]  | o=o |  [>\n";
      robot+="    \\=====/\n";
      robot+="   / / | \\ \\\n";
      robot+="  <_________>\n";

      return  "M4N0N)"+ super.toString() ;
  }

}
