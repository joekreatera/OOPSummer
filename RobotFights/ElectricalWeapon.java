public class ElectricalWeapon extends Weapon{

  public ElectricalWeapon(int s){
    super();
    this.setStrength(s);
    this.setType(Artifact.ARTIFACT_TYPE.ELECTRICAL);
  }

}
