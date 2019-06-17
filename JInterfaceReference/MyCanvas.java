import javax.swing.*;
import java.awt.*;

public class MyCanvas extends Canvas{
  boolean square =false;

  public void paintSquare(){
    square =true;
    this.repaint();
  }
  public void paint(Graphics g){
    if(square){
      this.getGraphics().drawRect(10,10,400,400);
    }
    g.drawLine(0,0,100,100);
  }
}
