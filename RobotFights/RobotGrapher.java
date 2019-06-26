import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RobotGrapher extends JFrame{

  RobotGraphWindow grapher;
  private static RobotGrapher mainWindow;
  JDesktopPane desktop;
  public static RobotGrapher getMainWindow(){ return mainWindow; }
  public RobotGrapher(){
    super("Robot Grapher");
    changeUIHandler();
    desktop = new JDesktopPane();
    this.add(desktop);
    desktop.add(new RobotChooser());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(900,600);
    this.setVisible(true);
    RobotGrapher.mainWindow = this;
  }
  public void showGraphWindow(Robot r1, Robot r2){
    grapher = new RobotGraphWindow(r1,r2);
    desktop.add(grapher);
  }

  public void changeUIHandler(){
    String[] uis = {"com.sun.java.swing.plaf.windows.WindowsLookAndFeel",
      "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel",
     "javax.swing.plaf.metal.MetalLookAndFeel",
     "javax.swing.plaf.nimbus.NimbusLookAndFeel",
     "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
   };

    try{
      UIManager.setLookAndFeel(uis[3]);
    }catch(Exception cnfe){
      System.out.println("Exception " + cnfe);
    }

  }

  public static void main(String args[]){
    new RobotGrapher();
  }

}
