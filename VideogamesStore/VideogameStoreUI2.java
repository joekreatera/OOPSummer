import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VideogameStoreUI2 extends JFrame implements ActionListener{

  JList myList ;

  public VideogameStoreUI2(String title){
      super(title);
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new GridLayout(2,1) );
      String[] options = {"VJ1","VJ2","VJ3","VJ4"};
      myList = new JList(options);
      mainPanel.add(myList);
      JButton button = new JButton("Click");
      button.addActionListener(this);
      mainPanel.add(button);
      getContentPane().add(mainPanel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800,600);
      setVisible(true);
  }

  public void actionPerformed(ActionEvent evt){

      System.out.println("Jlist " + myList.getSelectedIndex() );

  }
  public static void main(String args[]){
    new VideogameStoreUI2("Videogame Store 2");
  }


}
