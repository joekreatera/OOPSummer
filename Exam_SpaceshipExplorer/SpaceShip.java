public class SpaceShip{

  public static final int MAX_MINING_PER_DAY = 20;

  String name ="";
  int minePerDay = 0;
  int resourcesMined = 0;
  public SpaceShip(String n, int maxMinePerDay){
    name = n;
    minePerDay = maxMinePerDay;
  }

  public void mine(Planet p){
    resourcesMined += p.mine(minePerDay);
  }

  @Override
  public String toString(){
      return " ("+name+"):" + resourcesMined;
  }
}
