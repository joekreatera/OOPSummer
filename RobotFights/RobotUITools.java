import java.awt.*;
import javax.swing.*;

public class RobotUITools{

  public static ImageIcon getResizedImageIcon(ImageIcon original
    int newWidth,
    int newHeight
    ){
    Image img = original.getResource().getImage();
    Image resized = img.getScaledInstance(
                  newWidth, newHeight,
                  Image.SCALE_SMOOTH);
    return new ImageIcon(resized);
  }

}
