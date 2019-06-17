import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator{
  public Calculator(String title){
    JFrame myFrame = new JFrame(title);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel panelZero = new JPanel();
    panelZero.setLayout(new GridLayout(2,1));
    JPanel panelOne = new JPanel();
    panelOne.setLayout(new GridLayout(6,3));
    JTextField myField = new JTextField();
    panelZero.add(myField);
    fillButtonPanel(panelOne);
    panelZero.add(panelOne);
    myFrame.add(panelZero);
    myFrame.setSize(400,400);
    myFrame.setVisible(true);
  }

  public void fillButtonPanel(JPanel panel){
    for(int i = 0; i < 10 ; i++){
      panel.add(new JButton(""+i));
    }

    panel.add(new JButton("="));
    panel.add(new JButton("+"));
    panel.add(new JButton("-"));
    panel.add(new JButton("*"));
    panel.add(new JButton("/"));
    panel.add(new JButton("Clear"));
  }

  public static void main(String args[]){
    new Calculator("Calculator");
  }

}
