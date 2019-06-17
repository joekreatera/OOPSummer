import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowExample extends JFrame implements ActionListener{

    JList list;
    MyCanvas c;
    JPanel uiPanel;

  public WindowExample(String title){
    super(title);

    this.getContentPane().setLayout( new GridLayout(1,2) );


    this.getContentPane().add(getCanvas());

    getUI();
    this.getContentPane().add(uiPanel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400,800);
    this.setVisible(true);
  }

  public void getUI(){
    uiPanel = new JPanel();
    uiPanel.setLayout(new GridLayout(3,1));

    String circle = "Circulo";
    String square= ("Cuadro") ;
    String pentagon = ("Pentagono") ;

    list = new JList(new Object[]{circle, square, pentagon});
    JButton drawButton = new JButton("Dibuja ahora!");

    uiPanel.add(list);
    uiPanel.add(drawButton);
    drawButton.addActionListener(this);


  }
  public JPanel getCanvas(){
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(1,1));
    c = new MyCanvas();
    c.setSize(400,400);
    panel.add(c);
    c.repaint();
    return panel;
  }


  public void actionPerformed(ActionEvent evt){

    System.out.println(" -list " + list.getSelectedIndex() );
    if(  list.getSelectedIndex()  == 1){
      JButton clear = new JButton("Reiniciar");
      clear.addActionListener(this);
      uiPanel.add(clear);
      uiPanel.updateUI();
      c.paintSquare();
    }

  }

  public static void main(String args[]){

    new WindowExample("Drawing example");

  }
}
