public class Planet{
  public static final int MAX_RESOURCE_AMOUNT = 100;
  public static final int MIN_RESOURCE_AMOUNT = 10;
  String name = "";
  int resources = 0;
  public String getName(){
    return name;
  }
  public Planet(String s, int r){
    name = s;
    resources = r;
  }

  public boolean isEmpty(){
    if( resources  == 0){
      return true;
    }
    return false;
  }

  public int mine(int maxMinePerDay){
    int m = maxMinePerDay;
    if( resources < maxMinePerDay)
      m = resources;

    resources -= maxMinePerDay;

    if( resources < 0)
      resources = 0;

    return m;
  }

  @Override
  public String toString(){
    return name+"("+resources+")";
  }
}