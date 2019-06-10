class RobotFights{
  Robot robotChampion;
  Robot robotContender;
  public RobotFights(Robot champion, Robot contender){
      robotChampion = champion;
      robotContender = contender;
  }
  public void fight(){
      System.out.println("Start!");
      System.out.println("------ \n" + robotChampion + " \n\t\t\tvs\n" + robotContender);
      System.out.println("------");
      System.out.println("End");
  }
  public static void main(String args[]){
    System.out.println("Let's get ready to rumble");
    Robot joe = new Robot(0,0,100,4,3);
    Robot chucho = new Robot(10,10,300,2,2);

    joe.setAttackSlots(4);
    chucho.setAttackSlots(3);
    joe.setDefenseSlots(2);
    chucho.setDefenseSlots(4);

    joe.addAttack( new Weapon() );joe.addAttack( new Weapon() );
    joe.addAttack( new Weapon() );joe.addAttack( new Weapon() );

    chucho.addAttack( new Weapon() ); chucho.addAttack( new Weapon() );
    chucho.addAttack( new Weapon() );

    joe.addDefense(new Defense()); joe.addDefense(new Defense());

    chucho.addDefense(new Defense()); chucho.addDefense(new Defense());
    chucho.addDefense(new Defense()); chucho.addDefense(new Defense());

    RobotFights mainEvent = new RobotFights( chucho, joe);
    mainEvent.fight();
  }
}
