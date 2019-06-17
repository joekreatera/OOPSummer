public class Property{


  public enum PROPERTY_SIZE{NONE, SMALL, MEDIUM, LARGE};
  public enum PROPERTY_CLASS{NONE,HOUSE, STORE, INDUSTRY};

  private float pollution;
  private float population;
  private int locX;
  private int locY;
  private PROPERTY_SIZE type;
  private PROPERTY_CLASS propertyClass;
  public Property(int lx, int ly, float pol, float pop, PROPERTY_SIZE t , PROPERTY_CLASS pc){
    locX = lx;
    locY = ly;
    population = pop;
    pollution = pol;
    type = t;
    propertyClass = pc;
  }
  public PROPERTY_CLASS getPropertyClass(){
    return propertyClass;
  }

  public void setPropertyClass(PROPERTY_CLASS pc){
    propertyClass = pc;
  }
  public int getIntFromType(){
    return (type==Property.PROPERTY_SIZE.LARGE)?3:(type==Property.PROPERTY_SIZE.MEDIUM)?2:1;
  }
  public Property(int lx, int ly){
    locX = lx;
    locY = ly;
    propertyClass = PROPERTY_CLASS.NONE;
    type = PROPERTY_SIZE.NONE;
  }

  public Property(int lx, int ly, PROPERTY_SIZE s ,PROPERTY_CLASS pc){
    locX = lx;
    locY = ly;
    type = s;
    propertyClass = pc;
  }

  public void setPopulation(float p){
    population = p;
  }
  public void setPollution(float p){
    pollution = p;
  }

  public static PROPERTY_SIZE getRandom(){
      if(Math.random() < 0.3f){
        return PROPERTY_SIZE.SMALL;
      }

      if(Math.random() < 0.6f){
          return PROPERTY_SIZE.MEDIUM;
      }

      return PROPERTY_SIZE.LARGE;
  }

  public float getPollution(){
      return pollution;
  }
  public float getPopulation(){
      return population;
  }
  public int getLocX(){
      return locX;
  }
  public int getLocY(){
      return locY;
  }

  public PROPERTY_SIZE getType(){
      return type;
  }

  @Override
  public String toString(){
    return "( " + propertyClass + "//" + type + "/" + population + " , " + pollution + ")";
  }

}
