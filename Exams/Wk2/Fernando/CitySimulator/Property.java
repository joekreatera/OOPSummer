public class Property{

  private int posX;
  private int posY;
  private float pollution;
  private int people;
  private PROPERTY_TYPE type;
  private int level;
  public enum PROPERTY_TYPE{NONE, HOUSE, STORE, INDUSTRY};


  public Property(int lx, int ly, PROPERTY_TYPE pt){
    posX = lx;
    posY = ly;
    type = pt;
    level = (int)(Math.random()*3)+1;
    if(type == PROPERTY_TYPE.NONE){
      level = 0;
      pollution = 0;
      people = 0;
    }
    if(type == PROPERTY_TYPE.HOUSE){
      if(level == 1){
        people = (int)(Math.random()*2)+2;
        pollution = (float)(Math.random()*1)+5;
      }
      if(level == 2){
        people = (int)(Math.random()*2)+4;
        pollution = (float)(Math.random()*1)+7;
      }
      if(level == 3){
        people = 6;
        pollution = (float)(Math.random()*1)+9;
      }
    }
    if(type == PROPERTY_TYPE.STORE){
      if(level == 1){
        people = (int)(Math.random()*4)+20;
        pollution = (float)(Math.random()*13)+20;
      }
      if(level == 2){
        people = (int)(Math.random()*4)+24;
        pollution = (float)(Math.random()*13)+34;
      }
      if(level == 3){
        people = (int)(Math.random()*3)+28;
        pollution = (float)(Math.random()*12)+48;
      }
    }
    if(type == PROPERTY_TYPE.INDUSTRY){
      if(level == 1){
        people = (int)(Math.random()*14)+40;
        pollution = (float)(Math.random()*23)+80;
      }
      if(level == 2){
        people = (int)(Math.random()*14)+53;
        pollution = (float)(Math.random()*23)+104;
      }
      if(level == 3){
        people = (int)(Math.random()*15)+66;
        pollution = (float)(Math.random()*23)+127;
      }
    }
  }


  public void setPosX(int x){
    posX = x;
  }
  public void setPosY(int y){
    posY = y;
  }
  public void setPollution(float p){
    pollution = p;
  }
  public void setPeople(int p){
    people = p;
  }
  public void setType(PROPERTY_TYPE t){
    type = t;
  }
  public void setLevel(int l){
    level = l;
  }

  public int getPosX(){
    return posX;
  }
  public int getPosY(){
    return posY;
  }
  public float getPollution(){
    return pollution;
  }
  public int getPeople(){
    return people;
  }
  public PROPERTY_TYPE getType(){
    return type;
  }
  public int getLevel(){
    return level;
  }

@Override
  public String toString(){
    return "\n          Property Type: "+ type +"(Level "+ level +")"+
           "\n          x: "+ posX +"  y: "+ posY+
           "\n          People: "+people+
           "\n          Pollution per day: "+ pollution +"\n";
  }


}
