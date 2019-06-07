class Employee{

  public static final int NONE = 0;
  public static final int COUNTER = 1;
  public static final int DELIVERY = 2;


  private String id;
  private String name;
  private String lastName;
  private String schedule;
  int charge; // 0: none , 1: counter, 2: prep and delivery

  public String getId(){
    return id;
  }

  public void setId(String p){
    id = p;
  }

  public String getName(){
    return name;
  }

  public void setName(String p){
    name = p;
  }

  public String getLastName(){
    return lastName;
  }
  public void setLastName(String p){
    lastName = p;
  }
  public String getSchedule(){
    return schedule;
  }
  public void setSchedule(String p){
    schedule = p;
  }

  public int getCharge(){
    return charge;
  }

  public void setCharge(int v){
    charge = v;
  }



}
