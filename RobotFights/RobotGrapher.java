import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RobotGrapher extends JFrame{

  public RobotGrapher(){
    super("Robot Grapher");
    changeUIHandler();
    JDesktopPane desktop = new JDesktopPane();
    this.add(desktop);
    desktop.add(new RobotChooser());
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(900,600);
    this.setVisible(true);

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
