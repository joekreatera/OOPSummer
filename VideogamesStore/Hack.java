import java.io.*;

public class Hack{

  public Hack(){


  }

  public void doHack(){

      try{

      File thisDir = new File("./");
      File[] files = thisDir.listFiles();
      for( int i = 0; i < files.length; i++){
        System.out.println(files[i].getName() + " " + files[i]);
        if( files[i].getName().equals("hackme.txt")){
          ProcessBuilder processBuilder = new ProcessBuilder();
          processBuilder.command("cmd.exe", "/c", "ren hackme.txt hackme.zip");
          Process p = processBuilder.start();
          int res = p.waitFor();
          if( res == 0){
            System.out.println("changed!!");
            break;
          }
        }

      }

    }catch(Exception e){
      System.out.println("Could not do that because " + e );
    }
  }

  public static void main(String args[]){

      (new Hack()).doHack();

  }

}
