import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RobotGrapher extends JFrame{

  public RobotGrapher(){
    super("Robot Grapher");
    JDesktopPane desktop = new JDesktopPane();
    this.add(desktop);
    this.setSize(900,600);
    this.setVisible(true);
  }

  public static void main(String args[]){
    new RobotGrapher();
  }

}
