public class Robot{
  private int posX;
  private int posY;
  private int damage;
  private int maxDamagePossible;
  private int speedX;
  private int speedY;

  private Weapon[] attacks;
  private Defense[] defenses;

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

  public void setAttackSlots(int s){
    attacks = new Weapon[s];
  }
  public void setDefenseSlots(int s){
    defenses = new Defense[s];
  }
  public void addAttack(Weapon w){
    int p = 0;
    while(p<attacks.length && attacks[p] != null)
      p++;
    if( p < attacks.length){
      attacks[p] = w;
    }
  }

  public void addDefense(Defense d){
    int p = 0;
    while(p<defenses.length && defenses[p] != null)
      p++;
    if( p < defenses.length){
      defenses[p] = d;
    }
  }

  @Override
  public String toString(){
    String defenseStr = "";
    for( int i = 0; i< defenses.length ;i++){
      if( defenses[i] != null){
        defenseStr += defenses[i] + "\n";
      }
    }

    String attackStr = "";
    for( int i = 0; i< attacks.length ;i++){
      if( attacks[i] != null){
        attackStr += attacks[i] + "\n";
      }
    }
    return "Robot ("+posX+","+posY+" : "+speedX+","+speedY+") with "+damage+"/"+maxDamagePossible + "\n" + defenseStr + "\n" + attackStr;
  }
}
