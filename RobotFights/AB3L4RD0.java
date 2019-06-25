public class AB3L4RD0 extends Robot{

  public AB3L4RD0(int ox, int oy){
    super(ox, oy,500,3,3);
    this.setAttackSlots(5);
    this.setDefenseSlots(3);
    this.addAttack( new ClashWeapon(5) );
    this.addAttack( new ElectricalWeapon(10) );
    this.addAttack( new FireWeapon(4) );
    this.addAttack( new ElectricalWeapon(12) );
    this.addAttack( new ClashWeapon(6) );
    this.addDefense(new ElectricalDefense(5));
    this.addDefense(new FireDefense(7));
    this.addDefense(new ClashDefense(6));
  }

  @Override
  public String toString(){
      String robot = "";
      robot+="   __,_,\n";
      robot+="  [_|_/\n";
      robot+="   //\n";
      robot+=" _//    __\n";
      robot+="(_|)   |@@|\n";
      robot+=" \\ \\__ \\--/ __\n";
      robot+="  \\o__|----|  |   __\n";
      robot+="      \\ }{ /\\ )_ / _\\\n";
      robot+="      /\\__/\\ \\__O (__\n";
      robot+="     (--/\\--)    \\__/\n";
      robot+="     _)(  )(_\n";
      robot+="    `---''---`\n";

      return  "AB3L4RD0)"+ super.toString() ;

  }
}
