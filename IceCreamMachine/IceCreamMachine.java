import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IceCreamMachine{


  public IceCreamMachine(){

      JFrame window = new JFrame("IcreCream!!!");
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel main =  new JPanel();
      main.setLayout(new GridLayout(2,1) );

      JPanel top = new JPanel();
      top.setLayout( new GridLayout(1,2) );

      JPanel bottomReset = new JPanel();
      bottomReset.setLayout( new GridLayout(1,1) );


      JPanel flavours = new JPanel();
      flavours.setLayout( new GridLayout(5,1) );

      JPanel total = new JPanel();
      total.setLayout(new GridLayout(1,1));

      flavours.add(new JButton("Fresa"));
      flavours.add(new JButton("Vainilla"));
      flavours.add(new JButton("Limon"));
      flavours.add(new JButton("Uva"));
      flavours.add(new JButton("Café"));

      total.add(new JLabel("<html>1<br/>1<br/>1<br/>1<br/>1<br/></html>"));

      bottomReset.add(new JButton("Reset!") );

      top.add(flavours);
      top.add(total);
      main.add(top, bottomReset);
      window.getContentPane().add(main);

      window.setSize(600,600);
      window.setVisible(true);

  }

  public static void main(String args[]){
    new IceCreamMachine();
  }

}
