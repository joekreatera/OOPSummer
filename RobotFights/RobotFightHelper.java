public class RobotFightHelper{

  /*
  Requires: that w.strength > d.strength
  */
  public static int damageFromType(Weapon w, Defense d){
    int finalDamage = 0;
    if(w.getType() == Artifact.ARTIFACT_TYPE.FIRE){
      if(d.getType() == Artifact.ARTIFACT_TYPE.FIRE){
        return (w.getStrength()-d.getStrength())/2;
      }
      if(d.getType() == Artifact.ARTIFACT_TYPE.ELECTRICAL){
        return w.getStrength()*2;
      }
      if(d.getType() == Artifact.ARTIFACT_TYPE.CLASH){
        return w.getStrength()/2;
      }
    }
    if(w.getType() == Artifact.ARTIFACT_TYPE.ELECTRICAL){
      if(d.getType() == Artifact.ARTIFACT_TYPE.FIRE){
        return w.getStrength()/2;
      }
      if(d.getType() == Artifact.ARTIFACT_TYPE.ELECTRICAL){
        return (w.getStrength()-d.getStrength())/2;
      }
      if(d.getType() == Artifact.ARTIFACT_TYPE.CLASH){
        return w.getStrength()*2;
      }
    }
    if(w.getType() == Artifact.ARTIFACT_TYPE.CLASH){
      if(d.getType() == Artifact.ARTIFACT_TYPE.FIRE){
          return w.getStrength()*2;
      }
      if(d.getType() == Artifact.ARTIFACT_TYPE.ELECTRICAL){
          return w.getStrength()/2;
      }
      if(d.getType() == Artifact.ARTIFACT_TYPE.CLASH){
          return (w.getStrength()-d.getStrength())/2;
      }
    }

  }

}
