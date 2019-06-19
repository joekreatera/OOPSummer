import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VideogameStoreUI2 extends JFrame implements ActionListener{
  JList<Videogame> myList ;
  JList<Videogame> orderList;
  JList<Offer> offerList;
  JLabel totalSummaryLabel;
  VideogameStore store;
  public VideogameStoreUI2(String title){
      super(title);
      store = new VideogameStore("db.vg","sales.vg");
      store.loadDatabase();
      //store.saveDatabase();
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new GridLayout(1,2) );

      JPanel leftPanel = new JPanel();
      leftPanel.setLayout(new GridLayout(2,1) );

      JPanel rightPanel = new JPanel();
      rightPanel.setLayout(new GridLayout(2,1) );

      JPanel rightTopPanel = new JPanel();
      rightTopPanel.setLayout(new GridLayout(2,1) );

      JPanel rightBottomPanel = new JPanel();
      rightTopPanel.setLayout(new GridLayout(1,1) );

      JButton button = new JButton("Click");
      button.addActionListener(this);

      myList = new JList(store.getInventory());
      orderList  = new JList(store.getInventory());
      offerList = new JList(store.getInventory());
      totalSummaryLabel = new JLabel("Summary");
      mainPanel.add(leftPanel);
      mainPanel.add(rightPanel);
      leftPanel.add(myList);
      leftPanel.add(button);
      rightPanel.add(rightTopPanel);
      rightPanel.add(rightBottomPanel);
      rightTopPanel.add(orderList);
      rightTopPanel.add(offerList);
      rightBottomPanel.add(totalSummaryLabel);



      getContentPane().add(mainPanel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800,600);
      setVisible(true);
  }

  public void actionPerformed(ActionEvent evt){

      ListModel<Videogame> model = myList.getModel();
      Videogame vg = model.getElementAt( myList.getSelectedIndex() );
      System.out.println("Videogame: " +  vg );
      vg.setPrice(1.0f);
      System.out.println("Videogame: " +  vg );

      myList.updateUI();
  }
  public static void main(String args[]){
    new VideogameStoreUI2("Videogame Store 2");
  }


}
