import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class IndividualWindow extends JInternalFrame implements ActionListener, ListSelectionListener{

  IndividualWindow nextWindow;
  JList<String> internalList;
  DefaultListModel<String> listModel;
  public IndividualWindow(boolean size, boolean close, boolean maximize, boolean minimize){
    super("Individual Window", size, close, maximize, minimize);
    this.nextWindow = nextWindow;
    JPanel  mainPanel = new JPanel();
    mainPanel.setLayout( new GridLayout(2,1) );
    internalList = new JList<String>();
    listModel = new DefaultListModel<String>();
    internalList.setModel(listModel);
    mainPanel.add( internalList );

    JButton doBtn  = new JButton("Add");
    mainPanel.add( doBtn );
    doBtn.addActionListener(this);

    this.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    this.setLocation(80,80);
    this.getContentPane().add(mainPanel);
    this.setSize(300,300);
    this.setVisible(true);
  }

  public void actionPerformed(ActionEvent evt){

    if( internalList.getSelectedIndex() != -1){
        String str = internalList.getModel().getElementAt(internalList.getSelectedIndex());
        listModel.removeElementAt( internalList.getSelectedIndex() );
        if(nextWindow != null){
          nextWindow.addToList(str);
        }
    }
  }
  public void valueChanged(ListSelectionEvent listEvent){

  }


  public void addToList(String str){
      listModel.addElement(str);
  }

  public void setNextWindow(IndividualWindow win){
    nextWindow = win;
  }
}
