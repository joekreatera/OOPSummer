import java.awt.*;
import javax.swing.*;

public class RobotCanvas extends Canvas{
  RobotFights event;
  public RobotCanvas(Robot r1, Robot r2){
    r1.setPosX(0);
    r1.setPosY(0);

    r2.setPosX(400);
    r2.setPosY(400);
    event = new RobotFights(r1,r2);
  }

  public void nextFrame(){
    event.fight();
    repaint();
  }

  public void paint(Graphics g){
    g.drawRect( r1.getPosX(),r1.getPosY(),10,10);
    g.drawRect( r2.getPosX(),r2.getPosY(),10,10);
  }
}
