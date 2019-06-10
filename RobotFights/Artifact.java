class Artifact{

  public enum ARTIFACT_TYPE{NONE, FIRE, CLASH,ELECTRICAL};

  protected ARTIFACT_TYPE type;
  protected int strength;

  public Artifact(){
    type = ARTIFACT_TYPE.NONE;
    strength = 0;
  }

  public void setType(ARTIFACT_TYPE t){
    type = t;
  }
  public ARTIFACT_TYPE getType(){
    return type;
  }
  public void setStrength(int s){
    strength = s;
  }
  public int getStrength(){
    return strength;
  }

  @Override
  public String toString(){
      return "Artifact("+type+", "+strength+")";
  }

}
