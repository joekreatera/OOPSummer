import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;


/*
Compile : 10
Run: 10
Job:  10

Excellent!

*/
public class Examen3 extends JFrame implements ListSelectionListener{
  JList lista;
  JTable matches;
  JPanel panel1;
  JPanel panel2;
  DefaultTableModel model;
  DefaultListModel<Equipo> equipos;
  League premier;
  JScrollPane scroll;
  JLabel stats;
  JLabel refs;

  public Examen3(){
    super();
    premier=new League();
    this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    scroll=new JScrollPane();
    equipos=premier.toList();
    lista=new JList(equipos);
    panel1=new JPanel();
    panel2=new JPanel();
    setColumnnames();
    matches=new JTable(model);
    scroll=new JScrollPane(matches);
    stats=new JLabel();
    refs=new JLabel();
    matches.setDefaultEditor(Object.class, null);

    panel1.setLayout(new GridLayout(2,1));
    panel1.add(scroll);
    panel2.setLayout(new GridLayout(1,2));
    panel2.add(stats);
    panel2.add(refs);
    panel1.add(panel2);

    lista.addListSelectionListener(this);
    this.setLayout(new GridLayout(1,2));
    this.add(lista);
    this.add(panel1);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void valueChanged(ListSelectionEvent listEvent){
    if(listEvent.getSource()==lista){
      if(!listEvent.getValueIsAdjusting()){
        matches=new JTable(equipos.elementAt(lista.getSelectedIndex()).newModel(model));
        stats.setText("<html>"+ equipos.elementAt(lista.getSelectedIndex()).stats() + "</html>");
        refs.setText("<html>"+ equipos.elementAt(lista.getSelectedIndex()).refStr() + "</html>");
      }
    }
  }

  public void setColumnnames(){
    model=new DefaultTableModel(1,6);
    model.setValueAt("HOME",0,0);
    model.setValueAt("VISITOR",0,1);
    model.setValueAt("HOME GOALS",0,2);
    model.setValueAt("VISITOR GOALS",0,3);
    model.setValueAt("REFEREE",0,4);
    model.setValueAt("RESULT",0,5);
  }

  public static void main(String[] args) {
    Examen3 examen=new Examen3();
  }
}
