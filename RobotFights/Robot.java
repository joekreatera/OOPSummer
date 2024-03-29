public class Robot{
  private int posX;
  private int posY;
  private int damage;
  private int maxDamagePossible;
  private int speedX;
  private int speedY;

  private String image;


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

  public void reSpawn(){
    damage = 0;
  }

  public String getImage(){
    return image;
  }
  public void setImage(String str){
    image= str;
  }
  public boolean isAvailable(){
    return damage < maxDamagePossible;
  }

  public int getPosX(){ return posX;}
  public int getPosY(){return posY;}
  public void setPosX(int x){posX = x;}
  public void setPosY(int y){posY = y;}
  public int getSpeedX(){ return speedX;}
  public int getSpeedY(){ return speedY;}

  public void addDamage(int d){
    damage += d;
  }

  public String printDamage(){
      return "R("+damage+" from " + maxDamagePossible+ ")";
  }

  public Weapon getRandomAttack(){
    return attacks[(int)Math.random()*(attacks.length-1)];
  }
  public Defense getRandomDefense(){
    return defenses[(int)Math.random()*(defenses.length-1)];
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

  public void moveTowards(Robot r){
      int cx = r.getPosX() - this.getPosX();
      int cy = r.getPosY() - this.getPosY();

      int dirX = cx >= 0 ?1:-1;
      int dirY = cy >= 0 ?1:-1;

      cx = Math.abs(cx)>getSpeedX()?getSpeedX()*dirX:cx;
      cy = Math.abs(cy)>getSpeedY()?getSpeedY()*dirY:cy;

      this.setPosX( this.getPosX() + cx);
      this.setPosY( this.getPosY() + cy);

  }

  public String printPos(){
      return "R("+getPosX()+","+getPosY()+")";
  }

  public String getSaveString(){

    String defenseStr = "";
    for( int i = 0; i< defenses.length ;i++){
      if( defenses[i] != null){
        defenseStr += defenses[i].getType() + ":" + defenses[i].getStrength() + ",";
      }
    }

    String attackStr = "";
    for( int i = 0; i< attacks.length ;i++){
      if( attacks[i] != null){
        attackStr += attacks[i].getType() + ":" + attacks[i].getStrength() + ",";
      }
    }
    return posX+","+posY+","+speedX+","+speedY+","+maxDamagePossible+","
          +defenses.length+","+attacks.length+","+
          defenseStr+""+attackStr
          ;


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
    return "Robot ("+posX+","+posY+" : "+speedX+","+speedY+") with "+damage+"/"+maxDamagePossible+")"; // + "\n" + defenseStr + "\n" + attackStr;
  }

}
