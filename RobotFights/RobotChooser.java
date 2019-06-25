import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RobotChooser extends JInternalFrame{

  JList<Robot> topRobot;
  JList<Robot> bottomRobot;
  ImageIcon topImage;
  ImageIcon bottomImage;

  JLabel topImageLabel;
  JLabel bottomImageLabel;

  DefaultListModel topRobotModel;
  DefaultListModel bottomRobotModel;

  public RobotChooser(){
    super("Chooser" , false,true,true,true);
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

    topImage = new ImageIcon();
    bottomImage = new ImageIcon();
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
  }
}
