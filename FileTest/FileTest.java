import java.io.*;

public class FileTest{


  public static void main(String args[]){

      try{
        FileWriter writer = new FileWriter("textFile.txt");
        PrintWriter output = new PrintWriter(writer, true);

        output.println("THis is a new line");
        output.println("THis is a another new line");

        output.close();

        FileReader reader = new FileReader("textFile.txt");
        BufferedReader input = new BufferedReader(reader);

        String myLine = "";
        while( (myLine = input.readLine()) != null ){
          System.out.println("FIle line: " + myLine );
        }

        input.close();
      }catch(FileNotFoundException fnfe){
        System.out.println(fnfe);
      }catch(IOException ioe){
        System.out.println(ioe);
      }

  }



}
