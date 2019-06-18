import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IceCreamMachine implements ActionListener{


  JButton strawberryBtn;
  JButton vanillaBtn;
  JButton lemonBtn;
  JButton coffeeBtn;
  JButton grapeBtn;
  JButton resetBtn;

  JLabel totalLabel;
  JLabel totalCheckCount;
  String totalCheck = "";
  float totalBalance = 0.0f;

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
      total.setLayout(new GridLayout(2,1));

      setUpButtons(flavours);

      totalLabel = new JLabel("<html><b>Total!!</b><br/>1<br/>1<br/>1<br/>1<br/></html>");
      totalCheckCount = new JLabel("$0.00");
      total.add(totalLabel);
      total.add(totalCheckCount);

      resetBtn =  new JButton("Reset!");
      bottomReset.add(resetBtn); resetBtn.addActionListener(this);

      top.add(flavours);
      top.add(total);
      main.add(top);
      main.add(bottomReset);
      window.getContentPane().add(main);

      window.setSize(600,600);
      window.setVisible(true);

  }

  public void setUpButtons(JPanel flavours){
    strawberryBtn = new JButton("Fresa");
    flavours.add(strawberryBtn); strawberryBtn.addActionListener(this);
    vanillaBtn = new JButton("Vainilla");
    flavours.add(vanillaBtn); vanillaBtn.addActionListener(this);
    lemonBtn = new JButton("Limon");
    flavours.add(lemonBtn); lemonBtn.addActionListener(this);
    grapeBtn = new JButton("Uva");
    flavours.add(grapeBtn); grapeBtn.addActionListener(this);
    coffeeBtn = new JButton("Cafe");
    flavours.add(coffeeBtn); coffeeBtn.addActionListener(this);

  }

  public void actionPerformed(ActionEvent evt){

    if( evt.getSource() == strawberryBtn ){
        totalCheck += "Fresa: $10.00 <br/>";
        totalBalance += 10.0f;
    }
    if( evt.getSource() == vanillaBtn ){
        totalCheck += "Vainilla: $10.00 <br/>";
          totalBalance += 10.0f;
    }
    if( evt.getSource() == lemonBtn ){
        totalCheck += "Limon: $10.00 <br/>";
        totalBalance += 10.0f;
    }
    if( evt.getSource() == grapeBtn ){
        totalCheck += "Uva: $10.00 <br/>";
        totalBalance += 10.0f;
    }
    if( evt.getSource() == coffeeBtn ){
        totalCheck += "Cafe: $10.00 <br/>";
        totalBalance += 10.0f;
    }

    if( evt.getSource() == resetBtn){
      totalCheck = "";
      totalBalance = 0.0f;
    }
    totalLabel.setText("<html>"+totalCheck+"</html>");
    totalCheckCount.setText("$ " + totalBalance );
  }


  public static void main(String args[]){
    new IceCreamMachine();
  }

}
