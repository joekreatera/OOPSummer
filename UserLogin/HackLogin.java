import java.io.*;
import java.util.*;

public class HackLogin{

  public static void main(String args[]) throws Exception{

    BufferedReader reader = new BufferedReader(new FileReader("pass.txt") );

    String str = "";
    while( (str = reader.readLine()) != null ){
      UserLogin login = new UserLogin("users.txt");
      StringTokenizer tokenizer = new StringTokenizer(str,":");
      String user = tokenizer.nextToken();
      String pass = tokenizer.nextToken();
      boolean v = login.doValidate(user, pass);
      login.closeFile();

      if( v ){
        System.out.println("Hacked!!!!!!! -------------------- ");
        return;
      }
    }

    System.out.println("End reading file!");
  }

}
