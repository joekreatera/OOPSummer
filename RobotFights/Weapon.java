public class Weapon extends Artifact{

  public Weapon(){
    super();
  }

  @Override
  public String toString(){
      return "Weapon("+type+", "+strength+")";
  }
}
