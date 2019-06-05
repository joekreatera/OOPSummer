import javax.swing.*;

public class LiquidPressure{

  public static final float GRAVITY = 9.81f;

  public static String input(String msg){
    return JOptionPane.showInputDialog(null,msg);
  }
  public static float conv(String num){
    return Float.parseFloat(num);
  }

  /*
  TODO: validation for height and diameter limit
  */
  public static void main(String args[]){
    // ask for liquid rho in kg/m3
    float rho = conv(input("Density  kg/m3"));
    // ask for height
    float height = conv(input("Tank height") );
    int h = (int)height;
    // ask for diameter
    float diameter = conv(input("Tank diameter") );
    int d = (int)diameter;
    // solve pressure
    float pressure = rho*GRAVITY*h;
    // paint

    String tankDiameter = "";
    for(int i = 0; i < d ; i++){
      tankDiameter += "*";
    }

    for(int i = 0; i < h ; i++){
      System.out.println(tankDiameter);
    }

    System.out.println("pressure! " + pressure);

  }

}
