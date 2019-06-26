import java.awt.*;
import javax.swing.*;

public class RobotCanvas extends Canvas{
  RobotFights event;
  Robot r1;
  Robot r2;
  public RobotCanvas(Robot r1, Robot r2){
    r1.setPosX(0);
    r1.setPosY(0);
    r1.reSpawn();
    r2.setPosX(390);
    r2.setPosY(390);
    r2.reSpawn();
    this.r1 = r1;
    this.r2 = r2;
    event = new RobotFights(r1,r2);
  }

  public void nextFrame(){

  }

  public void paint(Graphics g){
    g.drawRect( r1.getPosX(),r1.getPosY(),10,10);
    g.drawRect( r2.getPosX(),r2.getPosY(),10,10);
    event.fight();
    repaint();
  }
}
