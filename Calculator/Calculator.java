import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

  JTextField myField;

  public Calculator(String title){
    JFrame myFrame = new JFrame(title);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panelZero = new JPanel();
    panelZero.setLayout(new GridLayout(3,1));
    JPanel panelOne = new JPanel();
    panelOne.setLayout(new GridLayout(5,3));
    myField = new JTextField();

    panelZero.add(myField);
    fillButtonPanel(panelOne);
    panelZero.add(panelOne);
    panelZero.add(   new JButton("Clear") );
    myFrame.add(panelZero);
    myFrame.setSize(400,400);
    //myFrame.pack();
    myFrame.setVisible(true);
  }

  public void fillButtonPanel(JPanel panel){
    for(int i = 0; i < 10 ; i++){
      JButton b = new JButton(""+i);
      panel.add(b);
      b.addActionListener(this);
    }

    panel.add(new JButton("="));
    panel.add(new JButton("+"));
    panel.add(new JButton("-"));
    panel.add(new JButton("*"));
    panel.add(new JButton("/"));
  }

  public void actionPerformed(ActionEvent  evt){
      JButton button = (JButton)evt.getSource();
      System.out.println( button.getText() );
      if( button.getText().equals("0")){
        myField.setText("0");
      }
  }

  public static void main(String args[]){
    new Calculator("Calculator");
  }

}
