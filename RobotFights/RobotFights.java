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

      System.out.println( robotChampion.printPos()
                          + " <-> " +
                          robotContender.printPos() );
      for(int i = 0; i < 5; i++){
          robotChampion.moveTowards(robotContender);
          robotContender.moveTowards(robotChampion);
          System.out.println( robotChampion.printPos()
                              + " <-> " +
                              robotContender.printPos() );
      }

      System.out.println("------");
      System.out.println("End");
  }
  public static void main(String args[]){
    System.out.println("Let's get ready to rumble");
    Robot joe = new J03(100,100);
    Robot chucho = new CH4CH0(-50,-80);
    RobotFights mainEvent = new RobotFights( chucho, joe);
    mainEvent.fight();
  }
}
