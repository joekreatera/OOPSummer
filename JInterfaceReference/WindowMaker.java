import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowMaker implements ActionListener{

  JFrame frame;

  public WindowMaker(){

    frame = new JFrame("First Frame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    // options: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE , DISPOSE_ON_CLOSE, EXIT_ON_CLOSE
    JPanel panel = new JPanel(new GridLayout(3,3) );
    JTextField text = new JTextField();
    JButton myButton = new JButton("Click me");
    myButton.addActionListener(this);
    panel.add(new JLabel("Nombre"));
    panel.add(text);

    panel.add( myButton );
    panel.add(new JButton("Button4"));
    panel.add(new JButton("Button5"));
    panel.add(new JButton("Button6"));
    panel.add(new JButton("Button7"));
    panel.add(new JButton("Button8"));
    panel.add(new JButton("Button9"));

    frame.setJMenuBar( getMenuBar() );
    frame.setContentPane(panel);

    frame.pack();
    frame.setSize(400,400);
    frame.setVisible(true);

    // https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html#anexample
  }

  public JMenuBar getMenuBar(){
      // https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html

      JMenuBar bar= new JMenuBar();

      JMenu file = new JMenu("File");
      JMenuItem close = new JMenuItem("Exit");
      close.addActionListener(this);
      file.add(close);
      bar.add(file);

      return bar;
  }

  public void actionPerformed(ActionEvent evt){
      System.out.println(evt.getSource());
      System.out.println(evt);
  }


  public static void main(String args[]){

    new WindowMaker();



  }
}
