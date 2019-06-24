import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowShow extends JFrame implements ActionListener{

  IndividualWindow w1;
  IndividualWindow w2;
  IndividualWindow w3;
  IndividualWindow w4;
  JMenuItem item;

  public WindowShow(){
    super("All window and menu");

    JDesktopPane desktop = new JDesktopPane();

    JMenuBar menu = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenu win = new JMenu("Window");
    item = new JMenuItem("Exit");
    item.addActionListener(this);
    file.add(item);
    win.add(createMenu("W1"));
    win.add(createMenu("W2"));
    win.add(createMenu("W3"));
    win.add(createMenu("W4"));

    menu.add(file);
    menu.add(win);



    this.setJMenuBar(menu);
    this.getContentPane().add(desktop);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    w1 = new IndividualWindow(true, true, true, true);
    w2 = new IndividualWindow(true, true, true, true);
    w3 = new IndividualWindow(true, true, true, true);
    w4 = new IndividualWindow(true, true, true, true);
    w1.setLocation(0,0);
    w2.setLocation(400,0);
    w3.setLocation(0,300);
    w4.setLocation(400,300);
    desktop.add(w1);
    desktop.add(w2);
    desktop.add(w3);
    desktop.add(w4);
    w1.setNextWindow(w2);
    w2.setNextWindow(w3);
    w3.setNextWindow(w4);
    w4.setNextWindow(w1);

    desktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
    this.setSize(800,700);
    this.setVisible(true);

    w1.addToList("Man United");
    w1.addToList("Man City");
    w1.addToList("Tottenham");
  }

  public void actionPerformed(ActionEvent evt){
      if( evt.getSource() == item){
        System.exit(0);
      }
  }

  public JMenu createMenu(String title){
    JMenu menu = new JMenu(title);
    menu.add( new JMenuItem("A") );
    menu.add( new JMenuItem("B") );
    menu.add( new JMenuItem("C") );
    menu.add( new JMenuItem("D") );
    return menu;
  }
  public static void main(String args[]){
    new WindowShow();
  }

}
