import java.io.*;
import java.util.*;

public class UserLogin{

  FileReader input;
  BufferedReader reader;

  public UserLogin(String fileName) throws FileNotFoundException{
    openFile(fileName);
  }

  public void openFile(String fileName) throws FileNotFoundException{
    input = new FileReader(fileName);
    reader = new BufferedReader(input);
  }

  public void doInput() throws IOException{

      BufferedReader systemInput = new BufferedReader(new InputStreamReader(System.in) );
      System.out.print("User:");
      String user = systemInput.readLine();
      System.out.print("Pass:");
      String pass = systemInput.readLine();

      boolean validate = doValidate(user,pass);

      if( validate){
        System.out.println(":)");
        System.out.println("Entered!");
      }else{
        System.out.println("Bye");
      }

  }
  public boolean doValidate(String u, String p) throws IOException{

    String str  = "";
    while( (str = reader.readLine()) != null ){
      StringTokenizer tokenizer = new StringTokenizer(str,":");
      String user = tokenizer.nextToken();
      String pass = tokenizer.nextToken();

      if( user.equals(u) && pass.equals(p) ){
        return true;
      }
    }

    return false;
  }

  public void closeFile() throws IOException{
    reader.close();
  }

  public static void main(String args[]){
      try{
      UserLogin login = new UserLogin("users.txt");
      login.doInput();
      login.closeFile();
    }catch(Exception e){
      System.out.println(e);
    }
  }

}
