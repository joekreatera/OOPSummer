import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

import java.text.*;
public class VideogameStoreUI2 extends JFrame
  implements ActionListener, ListSelectionListener{
  JList<Videogame> myList ;
  JList<Videogame> orderList;
  JList<Offer> offerList;
  JLabel totalSummaryLabel;
  JLabel totalAmountLabel;
  VideogameStore store;
  DefaultListModel<Videogame> offerListModel;
  Videogame selectedVideogame;

  Vector<Payment> payments;

  public VideogameStoreUI2(String title){
    super(title);

    payments = new Vector();
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
      rightTopPanel.setLayout(new GridLayout(1,2) );

      JPanel rightBottomPanel = new JPanel();
      rightBottomPanel.setLayout(new GridLayout(2,1) );

      JButton button = new JButton("Click");
      button.addActionListener(this);

      myList = new JList(store.getInventory());
      offerListModel = new DefaultListModel();
      orderList  = new JList( offerListModel );
      orderList.addListSelectionListener(this);
      offerList = new JList( store.getOffers()  );
      offerList.addListSelectionListener(this);
      totalSummaryLabel = new JLabel("Summary");
      totalAmountLabel = new JLabel("0.0");
      mainPanel.add(leftPanel);
      mainPanel.add(rightPanel);
      leftPanel.add(myList);
      leftPanel.add(button);
      rightPanel.add(rightTopPanel);
      rightPanel.add(rightBottomPanel);
      rightTopPanel.add(orderList);
      rightTopPanel.add(offerList);
      rightBottomPanel.add(totalSummaryLabel);
      rightBottomPanel.add(totalAmountLabel);


      getContentPane().add(mainPanel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800,600);
      setVisible(true);
  }

  public void updateTotalLabel(){
    String result = "";
    float finalPriceTotal = 0;
    for(int i=0; i< payments.size(); i++){
        Payment p = payments.get(i);
        OfferPayment po = (OfferPayment)p;
        float amount = po.getOffer().getOfferAmount();
        float finalPrice = p.getVideogame().getPrice()*(1-amount);
        finalPriceTotal += finalPrice;
        result += "<br/>"+ p.getVideogame().getName() + " | " + finalPrice + "<br/>" + po.getOffer().getDescription() ;
    }
    totalAmountLabel.setText("$" + finalPriceTotal);
    totalSummaryLabel.setText("<html>"+result+"</html>");
  }

  public void valueChanged(ListSelectionEvent listEvent){

    if( listEvent.getSource() == orderList ){
      if( !listEvent.getValueIsAdjusting() ){
        int sel = orderList.getSelectedIndex();
        if( sel > -1)
          selectedVideogame = (orderList.getModel()).getElementAt(sel);
      }
    }
    if( listEvent.getSource() == offerList){
      if( !listEvent.getValueIsAdjusting() ){
        int sel = offerList.getSelectedIndex() ;

        if( sel > -1){
          Offer thisOffer = offerList.getModel().getElementAt(sel);
          if( selectedVideogame != null){
            Payment p = new OfferPayment(
              selectedVideogame,
              "" + DateFormat.getDateInstance(DateFormat.SHORT, Locale.US).format(new Date()),
              selectedVideogame.getPrice(),
              thisOffer
            );
            payments.add(p);
            selectedVideogame = null;
            orderList.clearSelection();
            offerList.clearSelection();
            updateTotalLabel();
          }else{
            JOptionPane.showMessageDialog(null, "Selecciona un juego!");
            offerList.clearSelection();
          }
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
