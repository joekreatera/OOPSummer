import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class RobotGraphWindow extends JInternalFrame implements ActionListener{

  JButton doNextFrameBtn;
  RobotCanvas c;
  public RobotGraphWindow(Robot r1, Robot r2){
    super("Graph!!",false,true,false,false);
    setSize(400,400);
    setLocation(400,0);
    c = new RobotCanvas(r1,r2);
    this.getContentPane().add(c);
    doNextFrameBtn = new JButton("Next frame");
    doNextFrameBtn.addActionListener(this);
    this.getGlassPane().add(doNextFrameBtn);
    this.repaint();
    this.setVisible(true);
  }
  public void actionPerformed(ActionEvent evt){
    c.nextFrame();
  }
}
