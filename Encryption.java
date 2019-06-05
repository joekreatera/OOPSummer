import javax.swing.*;

public class Encryption{

  public static String input(String msg){
    return JOptionPane.showInputDialog(null,msg);
  }
  public static int conv(String num){
    return Integer.parseInt(num);
  }

  public static void main(String args[]){

    String res = input("Enter your name");

    if( res.length() < 3){
      System.out.println("More than 2 characters please");
    }else{

      String finalString = "";
      for(int i=0; i < res.length() ; i++){

          finalString += "" + (((int)res.charAt(i))-48+1) + "-";

      }

      finalString = finalString.substring(0,finalString.length() -1 );
      System.out.println("Exit: " + finalString);
    }

  }


}
