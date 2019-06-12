class RobotFights{
  Robot robotChampion;
  Robot robotContender;
  public static final int DISTANCE_TO_ATTACK = 6;
  public RobotFights(Robot champion, Robot contender){
      robotChampion = champion;
      robotContender = contender;
  }
  public void fight(){
      System.out.println("Start!");
      System.out.println("------ \n" + robotChampion + " \n\t\t\tvs\n" + robotContender);

      System.out.println( robotChampion.printPos()
                          + " <-> " +
                          robotContender.printPos() );

      /*
        General algorithm
          while both are living
            if distance > DISTANCE_TO_ATTACK
                advanceTowardsEnemy
            else
                {robotA, robotB} = getRandomFirstTurn from {champion, contender}
                attack = robotA.chooseRandomAttack()
                defense = robotB.chooseRandomDefense();
                doAttackSecondRobot = false;
                if( attack.strength > defense.strength)
                  robotB.getDamage(attack.strength)
                  if( random > 0.5 )
                    doAttackSecondRobot = true
                  else
                    robotB.moveAway()
                else
                  doAttackSecondRobot = true

                if( doAttackSecondRobot )
                  attack = robotB.chooseRandomAttack()
                  defense = robotA.chooseRandomDefense();
                  if(attack.strengh > defense.strength)
                    robotA.getDamage(attack.strength)
                  else
                    noop // retake fight

      */
      while(robotContender.isAvailable() && robotChampion.isAvailable()){
          if( getDistance(robotContender,robotChampion) > DISTANCE_TO_ATTACK ){
            robotChampion.moveTowards(robotContender);
            robotContender.moveTowards(robotChampion);
            System.out.println( robotChampion.printPos()
                                + " <-> " +
                                robotContender.printPos() );
          }else{
            Robot rA = getRandomFrom(robotChampion, robotContender);
            Robot rB = (rA==robotChampion)?robotContender:robotChampion;
            Weapon w = rA.getRandomAttack();
            Defense d = rB.getRandomDefense();
            boolean doAttackSecondRobot = false;
            doAttackSecondRobot = attackRobot(rA,rB,w,d);

            if(doAttackSecondRobot){
              w = rB.getRandomAttack();
              d = rA.getRandomDefense();
              attackRobot(rB,rA,w,d);
            }else{
              // robotB should move away!!!
              // yeah! you can make it!
            }
            System.out.println(rA.printDamage() + "//"+ rB.printDamage() );
          }

      }
      System.out.println("------");
      System.out.println("End");
  }

  public boolean attackRobot(Robot attacker, Robot defender,
                              Weapon attack, Defense defense){

    if( attack.getStrength() > defense.getStrength() ){
        defender.addDamage( RobotFightHelper.damageFromType(attack,defense));

        if( attack.getType() == defense.getType()){
          return true;
        }else{
          if(Math.random() > 0.5)
            return true;
        }

    }
    return false;
  }

  public Robot getRandomFrom(Robot robotA, Robot robotB){
    return (Math.random()>0.5)?robotA:robotB;
  }

  public float getDistance(Robot robotA, Robot robotB){

      int dx = robotB.getPosX()-robotA.getPosX();
      int dy = robotB.getPosY()-robotA.getPosY();
      return (float)Math.sqrt( Math.pow(dx,2) + Math.pow(dy,2) );
  }

  public static void main(String args[]){
    System.out.println("Let's get ready to rumble");
    Robot joe = new J03(100,100);
    Robot chucho = new CH4CH0(-50,-80);
    RobotFights mainEvent = new RobotFights( chucho, joe);
    mainEvent.fight();
  }
}
