import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class VideogameStoreUI2 extends JFrame
  implements ActionListener, ListSelectionListener{
  JList<Videogame> myList ;
  JList<Videogame> orderList;
  JList<Offer> offerList;
  JLabel totalSummaryLabel;
  VideogameStore store;
  DefaultListModel<Videogame> offerListModel;
  Videogame selectedVideogame;

  public VideogameStoreUI2(String title){
    super(title);

    String uis[] = {
    "com.sun.java.swing.plaf.windows.WindowsLookAndFeel",
    "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel",
    "javax.swing.plaf.metal.MetalLookAndFeel",
    "javax.swing.plaf.nimbus.NimbusLookAndFeel",
    "com.sun.java.swing.plaf.motif.MotifLookAndFeel"
  };

    try{
      UIManager.setLookAndFeel(uis[2]);
    }catch(Exception cnfe){
      System.out.println("Exception " + cnfe);
    }




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
      offerListModel = new DefaultListModel();
      orderList  = new JList( offerListModel );
      orderList.addListSelectionListener(this);
      offerList = new JList( store.getOffers()  );
      offerList.addListSelectionListener(this);
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

  public void valueChanged(ListSelectionEvent listEvent){

    if( listEvent.getSource() == orderList ){
      if( !listEvent.getValueIsAdjusting() ){
        int sel = orderList.getSelectedIndex();
        selectedVideogame = (orderList.getModel()).getElementAt(sel);
      }
    }
    if( listEvent.getSource() == offerList){
      if( !listEvent.getValueIsAdjusting() ){
        int sel = offerList.getSelectedIndex() ;
        Offer thisOffer = offerList.getModel().getElementAt(sel);
        if( selectedVideogame != null){
          Payment p = new OfferPayment(
            selectedVideogame,
            "Fecha de hoy",
            selectedVideogame.getPrice(),
            thisOffer
          );
          selectedVideogame = null;
          orderList.clearSelection();
          offerList.clearSelection();
        }else{
          JOptionPane.showMessageDialog(null, "Selecciona un juego!");
          offerList.clearSelection();
        }
      }
    }

  }

  public void actionPerformed(ActionEvent evt){

      ListModel<Videogame> model = myList.getModel();
      Videogame vg = model.getElementAt( myList.getSelectedIndex());
      vg.setStock( vg.getStock() - 1);
      offerListModel.addElement(vg);
      orderList.updateUI();
  }
  public static void main(String args[]){
    new VideogameStoreUI2("Videogame Store 2");
  }


}
