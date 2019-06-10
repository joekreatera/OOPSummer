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
    RobotFights mainEvent = new RobotFights( new Robot() , new Robot());
    mainEvent.fight();
  }
}
