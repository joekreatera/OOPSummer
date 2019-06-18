import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

  JTextField myField;
  float operand1 = 0.0f;
  int operands = 0;
  int operation = 0;
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

    JButton op = new JButton("=");
    panel.add(op); op.addActionListener(this);
    op = new JButton("+");
    panel.add(op); op.addActionListener(this);
    op = new JButton("-"); op.addActionListener(this);
    panel.add(op);
    op = new JButton("*"); op.addActionListener(this);
    panel.add(op);
    op = new JButton("/"); op.addActionListener(this);
    panel.add(op);
  }

  public void actionPerformed(ActionEvent  evt){
      JButton button = (JButton)evt.getSource();
      System.out.println( button.getText() );
      String prevText  = myField.getText();

      if(operands == 2){
        prevText = "";
        operands = 0;
        operation = 0;
        operand1 = 0f;
      }
      if( button.getText().equals("0")){
        myField.setText( prevText + 0);
      }
      if( button.getText().equals("1")){
        myField.setText( prevText + 1);
      }
      if( button.getText().equals("2")){
        myField.setText( prevText + 2);
      }
      if( button.getText().equals("3")){
        myField.setText( prevText + 3);
      }
      if( button.getText().equals("4")){
        myField.setText( prevText + 4);
      }
      if( button.getText().equals("5")){
        myField.setText( prevText + 5);
      }
      if( button.getText().equals("6")){
        myField.setText( prevText + 6);
      }
      if( button.getText().equals("7")){
        myField.setText( prevText + 7);
      }
      if( button.getText().equals("8")){
        myField.setText( prevText + 8);
      }
      if( button.getText().equals("9")){
        myField.setText( prevText + 9);
      }

      if( button.getText().equals("+")){
        System.out.println("This is + ");
        if( operands == 0){
          operands++;
          operation = 1;
          operand1 = Float.parseFloat(prevText);
          myField.setText("");
        }

      }

      if( button.getText().equals("=")){
        if(  operands == 1){
          operands++;
          if( operation == 1){
            float result = operand1 + Float.parseFloat(prevText);
            myField.setText(""+result);
          }

        }

      }
  }

  public static void main(String args[]){
    new Calculator("Calculator");
  }

}
