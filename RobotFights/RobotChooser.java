import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class RobotChooser extends JInternalFrame implements ListSelectionListener{

  JList<Robot> topRobot;
  JList<Robot> bottomRobot;
  ImageIcon topImage;
  ImageIcon bottomImage;

  JLabel topImageLabel;
  JLabel bottomImageLabel;

  DefaultListModel topRobotModel;
  DefaultListModel bottomRobotModel;

  public RobotChooser(){
    super("Chooser" , true,true,true,true);
    JPanel mainPanel =new JPanel();
    mainPanel.setLayout(new GridLayout(4,1));
    JPanel topSelectionPanel = new JPanel();
    topSelectionPanel.setLayout(new GridLayout(1,2));
    JPanel vsPanel = new JPanel();
    vsPanel.setLayout(new GridLayout(1,1));
    vsPanel.add( new JLabel("Vs") );
    JPanel bottomSelectionPanel = new JPanel();
    bottomSelectionPanel.setLayout(new GridLayout(1,2));
    JPanel goButtonPanel = new JPanel();
    goButtonPanel.setLayout(new GridLayout(1,1));
    JButton goButton = new JButton("Go");
    goButtonPanel.add(goButton);

    topRobotModel = new DefaultListModel();
    bottomRobotModel = new DefaultListModel();
    topRobot = new JList<Robot>();
    bottomRobot = new JList<Robot>();
    topRobot.setModel(topRobotModel);
    bottomRobot.setModel(bottomRobotModel);

    addRobots(topRobotModel);
    addRobots(bottomRobotModel);

    topImage = new ImageIcon("images/robot0.png");
    bottomImage = new ImageIcon("images/robot0.png");
    topImageLabel = new JLabel(topImage);
    bottomImageLabel = new JLabel(bottomImage);

    topSelectionPanel.add(topRobot);
    topSelectionPanel.add(topImageLabel);
    bottomSelectionPanel.add(bottomRobot);
    bottomSelectionPanel.add(bottomImageLabel);

    mainPanel.add(topSelectionPanel);
    mainPanel.add(vsPanel);
    mainPanel.add(bottomSelectionPanel);
    mainPanel.add(goButtonPanel);
    this.add(mainPanel);
    this.setSize(400,400);
    this.setVisible(true);

    topRobot.addListSelectionListener(this);
    bottomRobot.addListSelectionListener(this);
  }

  public void valueChanged(ListSelectionEvent evt){
    JList<Robot> list = (JList<Robot>)evt.getSource();
    boolean changing = list.getValueIsAdjusting();
    if( !changing ){
      Robot selectedRobot = (Robot)topRobotModel.getElementAt(list.getSelectedIndex());
      String img = selectedRobot.getImage();
      ImageIcon icon = RobotUITools.getResizedImageIcon(
                                      new ImageIcon(img), 100,100
                                    );
      if( list == topRobot)
        topImageLabel.setIcon( icon );
      if(list == bottomRobot)
        bottomImageLabel.setIcon( icon );
    }
  }

  public void addRobots(DefaultListModel<Robot> model){
      Robot myInstance = new J03(0,0);
      myInstance.setImage("images/robot1.png");
      model.addElement( myInstance);

       myInstance = new CH4CH0(0,0) ;
      myInstance.setImage("images/robot2.png");
      model.addElement( myInstance);

       myInstance = new AB3L4RD0(0,0);
      myInstance.setImage("images/robot3.png");
      model.addElement( myInstance);

       myInstance = new M4N0N(0,0);
      myInstance.setImage("images/robot4.png");
      model.addElement( myInstance);
  }
}
