import java.io.*;

public class RobotFightHelper{
  public static void saveDatabase(String dataFile, Robot robot,boolean isFirst){
      // please make backup before doing this!!!
      try{

          FileWriter file = new FileWriter(dataFile , !isFirst); // true here will append,not write from beginning
          PrintWriter printer = new PrintWriter(file, true);
          printer.println( robot.getSaveString() );
          printer.close();

      }catch(IOException ioe){
        System.out.println("Exception " + ioe);
      }
  }

  /*
  Requires: that w.strength > d.strength
  */
  public static int damageFromType(Weapon w, Defense d){

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

    return 0;

  }

}
