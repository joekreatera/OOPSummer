public class Property {


  public enum PROPERTY_TYPE{NONE, INDUSTRY, HOUSE, STORE};
  protected PROPERTY_TYPE type;
  private int locX;
  private int locY;
  protected float pollutionKey;
  protected float people;

  public Property(String str) {
    type = PROPERTY_TYPE.NONE;
  }


  public int getLocX(){ return locX;}
  public void setLocX(int s){ locX = s;}

  public int getLocY(){ return locY;}
  public void setLocY(int s){ locY = s;}

  public float getPollutionKey(){ return pollutionKey;}
  public void setPollutionKey(float b){ pollutionKey = b;}

  public float getPeople(){ return people;}
  public void setPeople(float b){ people = b;}

  public void setType(PROPERTY_TYPE t) {
    type =t;
  }

  public PROPERTY_TYPE getType() {
    return type;
  }

/*	public void setHouses() {
    float pkey=0;
    float ptotal=0;
    this.loadFile();
    for(int i=0; i<=prohouse; i++) {
      House.getQty();
      people = ptotal++;
      pollutionKey = pkey++;
    }
  }

  public void setStores() {
    float pkey=0;
    float ptotal=0;
    this.loadFile();
    for(int i=0; i<=prostore; i++) {
      Store.getQty();
      people = ptotal++;
      pollutionKey = pkey++;
    }
  }

  public void setIndustries() {
    float pkey=0;
    float ptotal=0;
    this.loadFile();
    for(int i=0; i<=proindustry; i++) {
      Industry.getQty();
      people = ptotal++;
      pollutionKey = pkey++;
    }
    */
  }

