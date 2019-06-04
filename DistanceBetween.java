import javax.swing.*;

public class DistanceBetween{

  // wrappers
  public static String input(String msg){
    return JOptionPane.showInputDialog(null,msg);
  }
  public static int conv(String num){
    return Integer.parseInt(num);
  }

  // math engine
  public static float distance(
  int x1,
  int y1,
  int x2,
  int y2){
      int a = x2-x1;
      int b = y2-y1;
      double d = Math.sqrt(a*a + b*b);
      return (float)d;
  }
  // main input and show
  public static void main(String[] args){
    int ox = conv(input("Origen X"));
    int oy = conv(input("Origen Y"));
    int dx = conv(input("Destino X"));
    int dy = conv(input("Destino Y"));

    // let the magic begin
    float d = distance(ox,oy,dx,dy);

    float t = d*(0.5f);
    System.out.println("T:"  + t);
  }

}
