public class Robot{
  private int posX;
  private int posY;
  private int damage;
  private int maxDamagePossible;
  private int speedX;
  private int speedY;

  public Robot(){
    posX = 0;
    posY = 0;
    maxDamagePossible = 0;
    speedX = 0;
    speedY = 0;
    damage = 0;
  }

  public Robot(int ox, int oy, int mdp, int sx, int sy){
    posX = ox;
    posY = oy;
    maxDamagePossible = mdp;
    speedX = sx;
    speedY = sy;
    damage = 0;
  }

  @Override
  public String toString(){
    return "Robot ("+posX+","+posY+" : "+speedX+","+speedY+") with "+damage+"/"+maxDamagePossible;
  }
}
