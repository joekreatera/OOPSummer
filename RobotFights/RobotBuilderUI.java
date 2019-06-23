import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;

public class RobotBuilderUI extends JFrame
  implements ActionListener, ListSelectionListener {

  JList defensesList;
  JList weaponsList;
  JList selectedList;
  JButton addButton;
  JButton saveButton;
  DefaultListModel<Artifact> selectedModel;
  public RobotBuilderUI(){
    super("Robot Builder");
    selectedModel = new DefaultListModel<Artifact>();
    JPanel main = new JPanel();
    main.setLayout(new GridLayout(4,1));
    JPanel topSelection = new JPanel();
    topSelection.setLayout(new GridLayout(1,2) );

    defensesList = new JList( buildDefenseCatalogue() );
    weaponsList = new JList( buildWeaponCatalogue() );
    selectedList = new JList();
    defensesList.addListSelectionListener(this);
    weaponsList.addListSelectionListener(this);
    selectedList.addListSelectionListener(this);

    selectedList.setModel(selectedModel);
    addButton = new JButton("Add");
    addButton.addActionListener(this);
    saveButton = new JButton("Save");
    saveButton.addActionListener(this);
    topSelection.add(defensesList);
    topSelection.add(weaponsList);
    main.add(topSelection);
    main.add(addButton);
    main.add(selectedList);
    main.add(saveButton);

    this.getContentPane().add(main);
    this.setSize(400,600);
    this.setVisible(true);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public Artifact[] buildDefenseCatalogue(){
    Artifact[] art = new Artifact[6];
    art[0] = new ElectricalDefense(10);
    art[1] = new ElectricalDefense(6);
    art[2] = new ClashDefense(8);
    art[3] = new ClashDefense(5);
    art[4] = new FireDefense(2);
    art[5] = new FireDefense(4);

    return art;
  }
  public Artifact[] buildWeaponCatalogue(){
    Artifact[] art = new Artifact[6];
    art[0] = new ElectricalWeapon(7);
    art[1] = new ElectricalWeapon(8);
    art[2] = new ClashWeapon(5);
    art[3] = new ClashWeapon(3);
    art[4] = new FireWeapon(7);
    art[5] = new FireWeapon(3);

    return art;
  }

  public void addSelected(JList<Artifact> list){

    Artifact art = list.getModel().getElementAt(list.getSelectedIndex());
    selectedModel.addElement(art);
    selectedList.updateUI();
  }

  int defenseListCounter = 0;
  int weaponsListCounter = 0;
  public void actionPerformed(ActionEvent evt){

    if(evt.getSource() == addButton){
      if( defensesList.getSelectedIndex() != -1){
        addSelected(defensesList);
        defensesList.clearSelection();
        defenseListCounter++;
      }else if( weaponsList.getSelectedIndex() != -1){
        addSelected(weaponsList);
        weaponsList.clearSelection();
        weaponsListCounter++;
      }
    }else{
      // do generate robot
      Robot newRobot = new Robot(0,0,200,3,3);
      newRobot.setAttackSlots(4);
      newRobot.setDefenseSlots(2);

      for(int i = 0; i< selectedModel.size();i++){
        Artifact art = selectedModel.getElementAt(i);
        if(art instanceof Defense){
          newRobot.addDefense((Defense)art);
        }else{
          newRobot.addAttack((Weapon)art);
        }
      }
      RobotFightHelper.saveDatabase("newRobot.txt", newRobot, true);
      selectedList.clearSelection();
      while(selectedModel.size()>0){
        selectedModel.removeElementAt(0);
      }
    }
  }

  public void valueChanged(ListSelectionEvent lse){
    if(lse.getSource() == selectedList){
      if( !lse.getValueIsAdjusting() ){
          if( selectedModel.size() > 0 && selectedList.getSelectedIndex() != -1){
            selectedModel.removeElementAt(selectedList.getSelectedIndex());
            selectedList.clearSelection();
          }
      }
    }

  }

  public static void main(String args[]){

    new RobotBuilderUI();

  }

}
