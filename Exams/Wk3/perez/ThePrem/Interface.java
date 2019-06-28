import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import javax.swing.table.*;


/*
Compile: 10
Run: 10
Job: 10

Excellent but the code was too much.
New algorithms are needed to deploy this easier
*/
public class Interface extends JFrame implements ListSelectionListener{
AllMatches partidos;
JList mcitylist;JList munitedlist;JList liverpoollist;JList chelsealist;
JList arsenallist;JList tottenhamlist;JList burnleylist;JList bournemouthlist;
JList leicesterlist;JList cardifflist;JList fulhamlist;JList evertonlist;
JList watfordlist;JList brightonlist;JList westhamlist;JList southamptonlist;
JList palacelist;JList newcastlelist;JList huddersfieldlist;JList wolveslist;
JLabel finalstats;
JLabel finalrefs;
JTable tabla;
DefaultTableModel defaulttable;
Match[] matches;




  public Interface(String title){
      super(title);
      partidos=new AllMatches("season1819.csv");
      partidos.loadDataMatches();


    JPanel mainPanel = new JPanel();
     mainPanel.setLayout(new GridLayout(1,2) );

     JPanel leftPanel = new JPanel();
     leftPanel.setLayout(new GridLayout(20,1) );

     JPanel rightPanel = new JPanel();
     rightPanel.setLayout(new GridLayout(2,1));

     JPanel toprightPanel= new JPanel();
     toprightPanel.setLayout(new GridLayout(1,1));

     JPanel bottomrightPanel= new JPanel();
     bottomrightPanel.setLayout(new GridLayout(1,2));
     finalstats= new JLabel("FinalStats");
     finalrefs= new JLabel("FinalRefs");

     defaulttable= new DefaultTableModel();
     defaulttable.addColumn("HomeTeam");
     defaulttable.addColumn("AwayTeam");
     defaulttable.addColumn("HomeGoals");
     defaulttable.addColumn("AwayGoals");
     defaulttable.addColumn("Result");
     defaulttable.setRowCount(38);


     tabla= new JTable(defaulttable);
     JScrollPane pane = new JScrollPane(tabla);


String[] city= {"ManCity"};mcitylist= new JList(city); mcitylist.addListSelectionListener(this);
String[] united= {"ManUnited"};munitedlist= new JList(united); munitedlist.addListSelectionListener(this);
String[] liverpool= {"Liverpool"};liverpoollist= new JList(liverpool);liverpoollist.addListSelectionListener(this);
String[] chelsea= {"Chelsea"};chelsealist= new JList(chelsea);chelsealist.addListSelectionListener(this);
String[] arsenal= {"Arsenal"};arsenallist= new JList(arsenal);arsenallist.addListSelectionListener(this);
String[] spurs= {"Tottenham"};tottenhamlist= new JList(spurs);tottenhamlist.addListSelectionListener(this);
String[] burnley= {"Burnley"};burnleylist= new JList(burnley);burnleylist.addListSelectionListener(this);
String[] bournemouth= {"Bournemouth"};bournemouthlist= new JList(bournemouth);bournemouthlist.addListSelectionListener(this);
String[] wolves= {"Wolves"};wolveslist= new JList(wolves);wolveslist.addListSelectionListener(this);
String[] leicester= {"Leicester"};leicesterlist= new JList(leicester);leicesterlist.addListSelectionListener(this);
String[] cardiff= {"Cardiff"};cardifflist= new JList(cardiff);cardifflist.addListSelectionListener(this);
String[] fulham= {"Fulham"};fulhamlist= new JList(fulham);fulhamlist.addListSelectionListener(this);
String[] everton= {"Everton"};evertonlist= new JList(everton);evertonlist.addListSelectionListener(this);
String[] watford= {"Watford"};watfordlist= new JList(watford);watfordlist.addListSelectionListener(this);
String[] brighton= {"Brighton"};brightonlist= new JList(brighton);brightonlist.addListSelectionListener(this);
String[] westham= {"WestHam"};westhamlist= new JList(westham);westhamlist.addListSelectionListener(this);
String[] southampton= {"Southampton"};southamptonlist= new JList(southampton);southamptonlist.addListSelectionListener(this);
String[] palace= {"Crystal Palace"};palacelist= new JList(palace);palacelist.addListSelectionListener(this);
String[] newcastle= {"Newcastle"};newcastlelist= new JList(newcastle);newcastlelist.addListSelectionListener(this);
String[] huddersfield= {"Huddersfield"};huddersfieldlist= new JList(huddersfield);huddersfieldlist.addListSelectionListener(this);

      mainPanel.add(leftPanel);
      mainPanel.add(rightPanel);
      rightPanel.add(toprightPanel);
      rightPanel.add(bottomrightPanel);


      leftPanel.add(mcitylist);leftPanel.add(munitedlist);leftPanel.add(chelsealist);
      leftPanel.add(liverpoollist);leftPanel.add(arsenallist);leftPanel.add(tottenhamlist);
      leftPanel.add(huddersfieldlist);leftPanel.add(newcastlelist);leftPanel.add(palacelist);
      leftPanel.add(southamptonlist);leftPanel.add(westhamlist);leftPanel.add(brightonlist);
      leftPanel.add(watfordlist);leftPanel.add(evertonlist);leftPanel.add(leicesterlist);
      leftPanel.add(wolveslist);leftPanel.add(bournemouthlist);leftPanel.add(burnleylist);leftPanel.add(cardifflist);
      leftPanel.add(fulhamlist);

      toprightPanel.add(pane);

      bottomrightPanel.add(finalstats);
      bottomrightPanel.add(finalrefs);




      getContentPane().add(mainPanel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800,800);
      setVisible(true);
  }



  public void valueChanged(ListSelectionEvent listEvent){

    if(listEvent.getSource()==mcitylist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.City());
        finalrefs.setText(partidos.CityArbis());


defaulttable.setValueAt(partidos.CityHomePrueba(), 0,0);defaulttable.setValueAt(partidos.CityHomePrueba2(),0,1);defaulttable.setValueAt(partidos.CityHomePrueba3(),0,2);defaulttable.setValueAt(partidos.CityHomePrueba4(),0,3);defaulttable.setValueAt(partidos.CityHomePrueba5(),0,4);
defaulttable.setValueAt(partidos.CityHomePruebaj2(), 1,0);defaulttable.setValueAt(partidos.CityHomePrueba2j2(),1,1);defaulttable.setValueAt(partidos.CityHomePrueba3j2(), 1,2);defaulttable.setValueAt(partidos.CityHomePrueba4j2(),1,3);defaulttable.setValueAt(partidos.CityHomePrueba5j2(), 1,4);
defaulttable.setValueAt(partidos.CityHomePruebaj3(), 2,0);defaulttable.setValueAt(partidos.CityHomePrueba2j3(),2,1);defaulttable.setValueAt(partidos.CityHomePrueba3j3(), 2,2);defaulttable.setValueAt(partidos.CityHomePrueba4j3(),2,3);defaulttable.setValueAt(partidos.CityHomePrueba5j3(), 2,4);
defaulttable.setValueAt(partidos.CityHomePruebaj4(), 3,0);defaulttable.setValueAt(partidos.CityHomePrueba2j4(),3,1);defaulttable.setValueAt(partidos.CityHomePrueba3j4(), 3,2);defaulttable.setValueAt(partidos.CityHomePrueba4j4(),3,3);defaulttable.setValueAt(partidos.CityHomePrueba5j4(), 3,4);
defaulttable.setValueAt(partidos.CityHomePruebaj5(), 4,0);defaulttable.setValueAt(partidos.CityHomePrueba2j5(),4,1);defaulttable.setValueAt(partidos.CityHomePrueba3j5(), 4,2);defaulttable.setValueAt(partidos.CityHomePrueba4j5(),4,3);defaulttable.setValueAt(partidos.CityHomePrueba5j5(), 4,4);
defaulttable.setValueAt(partidos.CityHomePruebaj6(), 5,0);defaulttable.setValueAt(partidos.CityHomePrueba2j6(),5,1);defaulttable.setValueAt(partidos.CityHomePrueba3j6(), 5,2);defaulttable.setValueAt(partidos.CityHomePrueba4j6(),5,3);defaulttable.setValueAt(partidos.CityHomePrueba5j6(), 5,4);
defaulttable.setValueAt(partidos.CityHomePruebaj7(), 6,0);defaulttable.setValueAt(partidos.CityHomePrueba2j7(),6,1);defaulttable.setValueAt(partidos.CityHomePrueba3j7(), 6,2);defaulttable.setValueAt(partidos.CityHomePrueba4j7(),6,3);defaulttable.setValueAt(partidos.CityHomePrueba5j7(), 6,4);
defaulttable.setValueAt(partidos.CityHomePruebaj8(), 7,0);defaulttable.setValueAt(partidos.CityHomePrueba2j8(),7,1);defaulttable.setValueAt(partidos.CityHomePrueba3j8(), 7,2);defaulttable.setValueAt(partidos.CityHomePrueba4j8(),7,3);defaulttable.setValueAt(partidos.CityHomePrueba5j8(), 7,4);
defaulttable.setValueAt(partidos.CityHomePruebaj9(), 8,0);defaulttable.setValueAt(partidos.CityHomePrueba2j9(),8,1);defaulttable.setValueAt(partidos.CityHomePrueba3j9(), 8,2);defaulttable.setValueAt(partidos.CityHomePrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
defaulttable.setValueAt(partidos.CityHomePruebaj10(),9,0);defaulttable.setValueAt(partidos.CityHomePrueba2j10(),9,1);defaulttable.setValueAt(partidos.CityHomePrueba3j10(), 9,2);defaulttable.setValueAt(partidos.CityHomePrueba4j10(),9,3);defaulttable.setValueAt(partidos.CityHomePrueba5j10(), 9,4);
defaulttable.setValueAt(partidos.CityHomePruebaj11(), 10,0);defaulttable.setValueAt(partidos.CityHomePrueba2j11(),10,1);defaulttable.setValueAt(partidos.CityHomePrueba3j11(), 10,2);defaulttable.setValueAt(partidos.CityHomePrueba4j11(),10,3);defaulttable.setValueAt(partidos.CityHomePrueba5j11(), 10,4);
defaulttable.setValueAt(partidos.CityHomePruebaj12(), 11,0);defaulttable.setValueAt(partidos.CityHomePrueba2j12(),11,1);defaulttable.setValueAt(partidos.CityHomePrueba3j12(), 11,2);defaulttable.setValueAt(partidos.CityHomePrueba4j12(),11,3);defaulttable.setValueAt(partidos.CityHomePrueba5j12(), 11,4);
defaulttable.setValueAt(partidos.CityHomePruebaj13(), 12,0);defaulttable.setValueAt(partidos.CityHomePrueba2j13(),12,1);defaulttable.setValueAt(partidos.CityHomePrueba3j13(), 12,2);defaulttable.setValueAt(partidos.CityHomePrueba4j13(),12,3);defaulttable.setValueAt(partidos.CityHomePrueba5j13(), 12,4);
defaulttable.setValueAt(partidos.CityHomePruebaj14(), 13,0);defaulttable.setValueAt(partidos.CityHomePrueba2j14(),13,1);defaulttable.setValueAt(partidos.CityHomePrueba3j14(), 13,2);defaulttable.setValueAt(partidos.CityHomePrueba4j14(),13,3);defaulttable.setValueAt(partidos.CityHomePrueba5j14(), 13,4);
defaulttable.setValueAt(partidos.CityHomePruebaj15(), 14,0);defaulttable.setValueAt(partidos.CityHomePrueba2j15(),14,1);defaulttable.setValueAt(partidos.CityHomePrueba3j15(), 14,2);defaulttable.setValueAt(partidos.CityHomePrueba4j15(),14,3);defaulttable.setValueAt(partidos.CityHomePrueba5j15(), 14,4);
defaulttable.setValueAt(partidos.CityHomePruebaj16(), 15,0);defaulttable.setValueAt(partidos.CityHomePrueba2j16(),15,1);defaulttable.setValueAt(partidos.CityHomePrueba3j16(), 15,2);defaulttable.setValueAt(partidos.CityHomePrueba4j16(),15,3);defaulttable.setValueAt(partidos.CityHomePrueba5j16(), 15,4);
defaulttable.setValueAt(partidos.CityHomePruebaj17(), 16,0);defaulttable.setValueAt(partidos.CityHomePrueba2j17(),16,1);defaulttable.setValueAt(partidos.CityHomePrueba3j17(), 16,2);defaulttable.setValueAt(partidos.CityHomePrueba4j17(),16,3);defaulttable.setValueAt(partidos.CityHomePrueba5j17(), 16,4);
defaulttable.setValueAt(partidos.CityHomePruebaj18(), 17,0);defaulttable.setValueAt(partidos.CityHomePrueba2j18(),17,1);defaulttable.setValueAt(partidos.CityHomePrueba3j18(), 17,2);defaulttable.setValueAt(partidos.CityHomePrueba4j18(),17,3);defaulttable.setValueAt(partidos.CityHomePrueba5j18(), 17,4);
defaulttable.setValueAt(partidos.CityHomePruebaj19(), 18,0);defaulttable.setValueAt(partidos.CityHomePrueba2j19(),18,1);defaulttable.setValueAt(partidos.CityHomePrueba3j19(), 18,2);defaulttable.setValueAt(partidos.CityHomePrueba4j19(),18,3);defaulttable.setValueAt(partidos.CityHomePrueba5j19(), 18,4);
defaulttable.setValueAt(partidos.CityHomePruebaj20(), 19,0);defaulttable.setValueAt(partidos.CityHomePrueba2j20(),19,1);defaulttable.setValueAt(partidos.CityHomePrueba3j20(), 19,2);defaulttable.setValueAt(partidos.CityHomePrueba4j20(),19,3);defaulttable.setValueAt(partidos.CityHomePrueba5j20(), 19,4);
defaulttable.setValueAt(partidos.CityHomePruebaj21(), 20,0);defaulttable.setValueAt(partidos.CityHomePrueba2j21(),20,1);defaulttable.setValueAt(partidos.CityHomePrueba3j21(), 20,2);defaulttable.setValueAt(partidos.CityHomePrueba4j21(),20,3);defaulttable.setValueAt(partidos.CityHomePrueba5j21(), 20,4);
defaulttable.setValueAt(partidos.CityHomePruebaj22(), 21,0);defaulttable.setValueAt(partidos.CityHomePrueba2j22(),21,1);defaulttable.setValueAt(partidos.CityHomePrueba3j22(), 21,2);defaulttable.setValueAt(partidos.CityHomePrueba4j22(),21,3);defaulttable.setValueAt(partidos.CityHomePrueba5j22(), 21,4);
defaulttable.setValueAt(partidos.CityHomePruebaj23(), 22,0);defaulttable.setValueAt(partidos.CityHomePrueba2j23(),22,1);defaulttable.setValueAt(partidos.CityHomePrueba3j23(), 22,2);defaulttable.setValueAt(partidos.CityHomePrueba4j23(),22,3);defaulttable.setValueAt(partidos.CityHomePrueba5j23(), 22,4);
defaulttable.setValueAt(partidos.CityHomePruebaj24(), 23,0);defaulttable.setValueAt(partidos.CityHomePrueba2j24(),23,1);defaulttable.setValueAt(partidos.CityHomePrueba3j24(), 23,2);defaulttable.setValueAt(partidos.CityHomePrueba4j24(),23,3);defaulttable.setValueAt(partidos.CityHomePrueba5j24(), 23,4);
defaulttable.setValueAt(partidos.CityHomePruebaj25(), 24,0);defaulttable.setValueAt(partidos.CityHomePrueba2j25(),24,1);defaulttable.setValueAt(partidos.CityHomePrueba3j25(), 24,2);defaulttable.setValueAt(partidos.CityHomePrueba4j25(),24,3);defaulttable.setValueAt(partidos.CityHomePrueba5j25(), 24,4);
defaulttable.setValueAt(partidos.CityHomePruebaj26(), 25,0);defaulttable.setValueAt(partidos.CityHomePrueba2j26(),25,1);defaulttable.setValueAt(partidos.CityHomePrueba3j26(), 25,2);defaulttable.setValueAt(partidos.CityHomePrueba4j26(),25,3);defaulttable.setValueAt(partidos.CityHomePrueba5j26(), 25,4);


mcitylist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==munitedlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.United());
        finalrefs.setText(partidos.UnitedArbis());
defaulttable.setValueAt(partidos.UnitedPrueba(), 0,0);defaulttable.setValueAt(partidos.UnitedPrueba2(),0,1);defaulttable.setValueAt(partidos.UnitedPrueba3(),0,2);defaulttable.setValueAt(partidos.UnitedPrueba4(),0,3);defaulttable.setValueAt(partidos.UnitedPrueba5(),0,4);
defaulttable.setValueAt(partidos.UnitedPruebaj2(), 1,0);defaulttable.setValueAt(partidos.UnitedPrueba2j2(),1,1);defaulttable.setValueAt(partidos.UnitedPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.UnitedPrueba4j2(),1,3);defaulttable.setValueAt(partidos.UnitedPrueba5j2(), 1,4);
defaulttable.setValueAt(partidos.UnitedPruebaj3(), 2,0);defaulttable.setValueAt(partidos.UnitedPrueba2j3(),2,1);defaulttable.setValueAt(partidos.UnitedPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.UnitedPrueba4j3(),2,3);defaulttable.setValueAt(partidos.UnitedPrueba5j3(), 2,4);
defaulttable.setValueAt(partidos.UnitedPruebaj4(), 3,0);defaulttable.setValueAt(partidos.UnitedPrueba2j4(),3,1);defaulttable.setValueAt(partidos.UnitedPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.UnitedPrueba4j4(),3,3);defaulttable.setValueAt(partidos.UnitedPrueba5j4(), 3,4);
defaulttable.setValueAt(partidos.UnitedPruebaj5(), 4,0);defaulttable.setValueAt(partidos.UnitedPrueba2j5(),4,1);defaulttable.setValueAt(partidos.UnitedPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.UnitedPrueba4j5(),4,3);defaulttable.setValueAt(partidos.UnitedPrueba5j5(), 4,4);
defaulttable.setValueAt(partidos.UnitedPruebaj6(), 5,0);defaulttable.setValueAt(partidos.UnitedPrueba2j6(),5,1);defaulttable.setValueAt(partidos.UnitedPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.UnitedPrueba4j6(),5,3);defaulttable.setValueAt(partidos.UnitedPrueba5j6(), 5,4);
defaulttable.setValueAt(partidos.UnitedPruebaj7(), 6,0);defaulttable.setValueAt(partidos.UnitedPrueba2j7(),6,1);defaulttable.setValueAt(partidos.UnitedPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.UnitedPrueba4j7(),6,3);defaulttable.setValueAt(partidos.UnitedPrueba5j7(), 6,4);
defaulttable.setValueAt(partidos.UnitedPruebaj8(), 7,0);defaulttable.setValueAt(partidos.UnitedPrueba2j8(),7,1);defaulttable.setValueAt(partidos.UnitedPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.UnitedPrueba4j8(),7,3);defaulttable.setValueAt(partidos.UnitedPrueba5j8(), 7,4);
defaulttable.setValueAt(partidos.UnitedPruebaj9(), 8,0);defaulttable.setValueAt(partidos.UnitedPrueba2j9(),8,1);defaulttable.setValueAt(partidos.UnitedPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.UnitedPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
defaulttable.setValueAt(partidos.UnitedPruebaj10(),9,0);defaulttable.setValueAt(partidos.UnitedPrueba2j10(),9,1);defaulttable.setValueAt(partidos.UnitedPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.UnitedPrueba4j10(),9,3);defaulttable.setValueAt(partidos.UnitedPrueba5j10(), 9,4);
defaulttable.setValueAt(partidos.UnitedPruebaj11(), 10,0);defaulttable.setValueAt(partidos.UnitedPrueba2j11(),10,1);defaulttable.setValueAt(partidos.UnitedPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.UnitedPrueba4j11(),10,3);defaulttable.setValueAt(partidos.UnitedPrueba5j11(), 10,4);
defaulttable.setValueAt(partidos.UnitedPruebaj12(), 11,0);defaulttable.setValueAt(partidos.UnitedPrueba2j12(),11,1);defaulttable.setValueAt(partidos.UnitedPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.UnitedPrueba4j12(),11,3);defaulttable.setValueAt(partidos.UnitedPrueba5j12(), 11,4);
defaulttable.setValueAt(partidos.UnitedPruebaj13(), 12,0);defaulttable.setValueAt(partidos.UnitedPrueba2j13(),12,1);defaulttable.setValueAt(partidos.UnitedPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.UnitedPrueba4j13(),12,3);defaulttable.setValueAt(partidos.UnitedPrueba5j13(), 12,4);
defaulttable.setValueAt(partidos.UnitedPruebaj14(), 13,0);defaulttable.setValueAt(partidos.UnitedPrueba2j14(),13,1);defaulttable.setValueAt(partidos.UnitedPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.UnitedPrueba4j14(),13,3);defaulttable.setValueAt(partidos.UnitedPrueba5j14(), 13,4);
defaulttable.setValueAt(partidos.UnitedPruebaj15(), 14,0);defaulttable.setValueAt(partidos.UnitedPrueba2j15(),14,1);defaulttable.setValueAt(partidos.UnitedPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.UnitedPrueba4j15(),14,3);defaulttable.setValueAt(partidos.UnitedPrueba5j15(), 14,4);
defaulttable.setValueAt(partidos.UnitedPruebaj17(), 16,0);defaulttable.setValueAt(partidos.UnitedPrueba2j17(),16,1);defaulttable.setValueAt(partidos.UnitedPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.UnitedPrueba4j17(),16,3);defaulttable.setValueAt(partidos.UnitedPrueba5j17(), 16,4);
defaulttable.setValueAt(partidos.UnitedPruebaj16(), 15,0);defaulttable.setValueAt(partidos.UnitedPrueba2j16(),15,1);defaulttable.setValueAt(partidos.UnitedPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.UnitedPrueba4j16(),15,3);defaulttable.setValueAt(partidos.UnitedPrueba5j16(), 15,4);
defaulttable.setValueAt(partidos.UnitedPruebaj18(), 17,0);defaulttable.setValueAt(partidos.UnitedPrueba2j18(),17,1);defaulttable.setValueAt(partidos.UnitedPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.UnitedPrueba4j18(),17,3);defaulttable.setValueAt(partidos.UnitedPrueba5j18(), 17,4);
defaulttable.setValueAt(partidos.UnitedPruebaj19(), 18,0);defaulttable.setValueAt(partidos.UnitedPrueba2j19(),18,1);defaulttable.setValueAt(partidos.UnitedPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.UnitedPrueba4j19(),18,3);defaulttable.setValueAt(partidos.UnitedPrueba5j19(), 18,4);
defaulttable.setValueAt(partidos.UnitedPruebaj20(), 19,0);defaulttable.setValueAt(partidos.UnitedPrueba2j20(),19,1);defaulttable.setValueAt(partidos.UnitedPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.UnitedPrueba4j20(),19,3);defaulttable.setValueAt(partidos.UnitedPrueba5j20(), 19,4);
defaulttable.setValueAt(partidos.UnitedPruebaj21(), 20,0);defaulttable.setValueAt(partidos.UnitedPrueba2j21(),20,1);defaulttable.setValueAt(partidos.UnitedPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.UnitedPrueba4j21(),20,3);defaulttable.setValueAt(partidos.UnitedPrueba5j21(), 20,4);
defaulttable.setValueAt(partidos.UnitedPruebaj22(), 21,0);defaulttable.setValueAt(partidos.UnitedPrueba2j22(),21,1);defaulttable.setValueAt(partidos.UnitedPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.UnitedPrueba4j22(),21,3);defaulttable.setValueAt(partidos.UnitedPrueba5j22(), 21,4);
defaulttable.setValueAt(partidos.UnitedPruebaj23(), 22,0);defaulttable.setValueAt(partidos.UnitedPrueba2j23(),22,1);defaulttable.setValueAt(partidos.UnitedPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.UnitedPrueba4j23(),22,3);defaulttable.setValueAt(partidos.UnitedPrueba5j23(), 22,4);
defaulttable.setValueAt(partidos.UnitedPruebaj24(), 23,0);defaulttable.setValueAt(partidos.UnitedPrueba2j24(),23,1);defaulttable.setValueAt(partidos.UnitedPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.UnitedPrueba4j24(),23,3);defaulttable.setValueAt(partidos.UnitedPrueba5j24(), 23,4);
defaulttable.setValueAt(partidos.UnitedPruebaj25(), 24,0);defaulttable.setValueAt(partidos.UnitedPrueba2j25(),24,1);defaulttable.setValueAt(partidos.UnitedPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.UnitedPrueba4j25(),24,3);defaulttable.setValueAt(partidos.UnitedPrueba5j25(), 24,4);
defaulttable.setValueAt(partidos.UnitedPruebaj26(), 25,0);defaulttable.setValueAt(partidos.UnitedPrueba2j26(),25,1);defaulttable.setValueAt(partidos.UnitedPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.UnitedPrueba4j26(),25,3);defaulttable.setValueAt(partidos.UnitedPrueba5j26(), 25,4);
        munitedlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==chelsealist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Chelsea());
        finalrefs.setText(partidos.ChelseaArbis());
defaulttable.setValueAt(partidos.CityHome3Prueba(), 0,0);defaulttable.setValueAt(partidos.CityHome3Prueba2(),0,1);defaulttable.setValueAt(partidos.CityHome3Prueba3(),0,2);defaulttable.setValueAt(partidos.CityHome3Prueba4(),0,3);defaulttable.setValueAt(partidos.CityHome3Prueba5(),0,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj2(), 1,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j2(),1,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j2(), 1,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j2(),1,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j2(), 1,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj3(), 2,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j3(),2,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j3(), 2,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j3(),2,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j3(), 2,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj4(), 3,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j4(),3,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j4(), 3,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j4(),3,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j4(), 3,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj5(), 4,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j5(),4,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j5(), 4,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j5(),4,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j5(), 4,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj6(), 5,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j6(),5,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j6(), 5,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j6(),5,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j6(), 5,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj7(), 6,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j7(),6,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j7(), 6,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j7(),6,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j7(), 6,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj8(), 7,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j8(),7,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j8(), 7,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j8(),7,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j8(), 7,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj9(), 8,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j9(),8,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j9(), 8,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj10(),9,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j10(),9,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j10(), 9,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j10(),9,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j10(), 9,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj11(), 10,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j11(),10,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j11(), 10,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j11(),10,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j11(), 10,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj12(), 11,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j12(),11,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j12(), 11,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j12(),11,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j12(), 11,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj13(), 12,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j13(),12,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j13(), 12,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j13(),12,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j13(), 12,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj14(), 13,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j14(),13,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j14(), 13,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j14(),13,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j14(), 13,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj15(), 14,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j15(),14,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j15(), 14,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j15(),14,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j15(), 14,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj17(), 16,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j17(),16,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j17(), 16,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j17(),16,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j17(), 16,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj16(), 15,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j16(),15,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j16(), 15,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j16(),15,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j16(), 15,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj18(), 17,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j18(),17,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j18(), 17,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j18(),17,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j18(), 17,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj19(), 18,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j19(),18,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j19(), 18,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j19(),18,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j19(), 18,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj20(), 19,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j20(),19,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j20(), 19,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j20(),19,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j20(), 19,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj21(), 20,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j21(),20,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j21(), 20,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j21(),20,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j21(), 20,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj22(), 21,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j22(),21,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j22(), 21,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j22(),21,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j22(), 21,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj23(), 22,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j23(),22,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j23(), 22,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j23(),22,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j23(), 22,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj24(), 23,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j24(),23,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j24(), 23,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j24(),23,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j24(), 23,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj25(), 24,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j25(),24,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j25(), 24,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j25(),24,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j25(), 24,4);
defaulttable.setValueAt(partidos.CityHome3Pruebaj26(), 25,0);defaulttable.setValueAt(partidos.CityHome3Prueba2j26(),25,1);defaulttable.setValueAt(partidos.CityHome3Prueba3j26(), 25,2);defaulttable.setValueAt(partidos.CityHome3Prueba4j26(),25,3);defaulttable.setValueAt(partidos.CityHome3Prueba5j26(), 25,4);
        chelsealist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==liverpoollist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Liverpool());
        finalrefs.setText(partidos.LiverpoolArbis());
        for(int i=0; i<2; i++){
defaulttable.setValueAt(partidos.CityHome2Prueba(), 0,0);defaulttable.setValueAt(partidos.CityHome2Prueba2(),0,1);defaulttable.setValueAt(partidos.CityHome2Prueba3(),0,2);defaulttable.setValueAt(partidos.CityHome2Prueba4(),0,3);defaulttable.setValueAt(partidos.CityHome2Prueba5(),0,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj2(), 1,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j2(),1,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j2(), 1,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j2(),1,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j2(), 1,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj3(), 2,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j3(),2,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j3(), 2,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j3(),2,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j3(), 2,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj4(), 3,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j4(),3,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j4(), 3,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j4(),3,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j4(), 3,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj5(), 4,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j5(),4,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j5(), 4,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j5(),4,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j5(), 4,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj6(), 5,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j6(),5,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j6(), 5,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j6(),5,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j6(), 5,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj7(), 6,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j7(),6,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j7(), 6,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j7(),6,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j7(), 6,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj8(), 7,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j8(),7,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j8(), 7,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j8(),7,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j8(), 7,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj9(), 8,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j9(),8,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j9(), 8,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj10(),9,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j10(),9,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j10(), 9,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j10(),9,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j10(), 9,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj11(), 10,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j11(),10,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j11(), 10,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j11(),10,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j11(), 10,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj12(), 11,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j12(),11,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j12(), 11,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j12(),11,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j12(), 11,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj13(), 12,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j13(),12,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j13(), 12,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j13(),12,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j13(), 12,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj14(), 13,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j14(),13,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j14(), 13,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j14(),13,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j14(), 13,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj15(), 14,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j15(),14,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j15(), 14,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j15(),14,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j15(), 14,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj17(), 16,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j17(),16,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j17(), 16,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j17(),16,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j17(), 16,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj16(), 15,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j16(),15,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j16(), 15,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j16(),15,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j16(), 15,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj18(), 17,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j18(),17,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j18(), 17,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j18(),17,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j18(), 17,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj19(), 18,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j19(),18,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j19(), 18,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j19(),18,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j19(), 18,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj20(), 19,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j20(),19,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j20(), 19,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j20(),19,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j20(), 19,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj21(), 20,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j21(),20,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j21(), 20,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j21(),20,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j21(), 20,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj22(), 21,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j22(),21,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j22(), 21,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j22(),21,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j22(), 21,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj23(), 22,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j23(),22,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j23(), 22,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j23(),22,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j23(), 22,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj24(), 23,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j24(),23,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j24(), 23,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j24(),23,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j24(), 23,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj25(), 24,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j25(),24,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j25(), 24,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j25(),24,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j25(), 24,4);
defaulttable.setValueAt(partidos.CityHome2Pruebaj26(), 25,0);defaulttable.setValueAt(partidos.CityHome2Prueba2j26(),25,1);defaulttable.setValueAt(partidos.CityHome2Prueba3j26(), 25,2);defaulttable.setValueAt(partidos.CityHome2Prueba4j26(),25,3);defaulttable.setValueAt(partidos.CityHome2Prueba5j26(), 25,4);


        }
        liverpoollist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==arsenallist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Arsenal());
        finalrefs.setText(partidos.ArsenalArbis());
        defaulttable.setValueAt(partidos.ArsenalPrueba(), 0,0);defaulttable.setValueAt(partidos.ArsenalPrueba2(),0,1);defaulttable.setValueAt(partidos.ArsenalPrueba3(),0,2);defaulttable.setValueAt(partidos.ArsenalPrueba4(),0,3);defaulttable.setValueAt(partidos.ArsenalPrueba5(),0,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj2(), 1,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j2(),1,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j2(),1,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj3(), 2,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j3(),2,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j3(),2,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj4(), 3,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j4(),3,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j4(),3,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj5(), 4,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j5(),4,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j5(),4,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj6(), 5,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j6(),5,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j6(),5,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj7(), 6,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j7(),6,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j7(),6,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj8(), 7,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j8(),7,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j8(),7,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj9(), 8,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j9(),8,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj10(),9,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j10(),9,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j10(),9,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj11(), 10,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j11(),10,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j11(),10,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj12(), 11,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j12(),11,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j12(),11,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj13(), 12,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j13(),12,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j13(),12,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj14(), 13,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j14(),13,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j14(),13,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj15(), 14,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j15(),14,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j15(),14,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj17(), 16,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j17(),16,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j17(),16,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj16(), 15,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j16(),15,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j16(),15,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj18(), 17,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j18(),17,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j18(),17,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj19(), 18,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j19(),18,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j19(),18,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj20(), 19,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j20(),19,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j20(),19,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj21(), 20,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j21(),20,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j21(),20,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj22(), 21,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j22(),21,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j22(),21,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj23(), 22,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j23(),22,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j23(),22,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj24(), 23,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j24(),23,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j24(),23,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj25(), 24,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j25(),24,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j25(),24,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.ArsenalPruebaj26(), 25,0);defaulttable.setValueAt(partidos.ArsenalPrueba2j26(),25,1);defaulttable.setValueAt(partidos.ArsenalPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.ArsenalPrueba4j26(),25,3);defaulttable.setValueAt(partidos.ArsenalPrueba5j26(), 25,4);
        arsenallist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==tottenhamlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Spurs());
        finalrefs.setText(partidos.TottenhamArbis());
        defaulttable.setValueAt(partidos.TottenhamPrueba(), 0,0);defaulttable.setValueAt(partidos.TottenhamPrueba2(),0,1);defaulttable.setValueAt(partidos.TottenhamPrueba3(),0,2);defaulttable.setValueAt(partidos.TottenhamPrueba4(),0,3);defaulttable.setValueAt(partidos.TottenhamPrueba5(),0,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj2(), 1,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j2(),1,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j2(),1,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj3(), 2,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j3(),2,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j3(),2,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj4(), 3,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j4(),3,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j4(),3,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj5(), 4,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j5(),4,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j5(),4,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj6(), 5,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j6(),5,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j6(),5,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj7(), 6,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j7(),6,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j7(),6,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj8(), 7,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j8(),7,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j8(),7,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj9(), 8,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j9(),8,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj10(),9,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j10(),9,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j10(),9,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj11(), 10,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j11(),10,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j11(),10,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj12(), 11,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j12(),11,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j12(),11,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj13(), 12,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j13(),12,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j13(),12,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj14(), 13,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j14(),13,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j14(),13,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj15(), 14,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j15(),14,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j15(),14,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj17(), 16,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j17(),16,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j17(),16,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj16(), 15,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j16(),15,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j16(),15,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj18(), 17,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j18(),17,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j18(),17,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj19(), 18,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j19(),18,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j19(),18,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj20(), 19,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j20(),19,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j20(),19,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj21(), 20,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j21(),20,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j21(),20,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj22(), 21,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j22(),21,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j22(),21,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj23(), 22,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j23(),22,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j23(),22,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj24(), 23,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j24(),23,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j24(),23,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj25(), 24,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j25(),24,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j25(),24,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.TottenhamPruebaj26(), 25,0);defaulttable.setValueAt(partidos.TottenhamPrueba2j26(),25,1);defaulttable.setValueAt(partidos.TottenhamPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.TottenhamPrueba4j26(),25,3);defaulttable.setValueAt(partidos.TottenhamPrueba5j26(), 25,4);

        tottenhamlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==wolveslist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Wolves());
        finalrefs.setText(partidos.WolvesArbis());
        defaulttable.setValueAt(partidos.WolvesPrueba(), 0,0);defaulttable.setValueAt(partidos.WolvesPrueba2(),0,1);defaulttable.setValueAt(partidos.WolvesPrueba3(),0,2);defaulttable.setValueAt(partidos.WolvesPrueba4(),0,3);defaulttable.setValueAt(partidos.WolvesPrueba5(),0,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj2(), 1,0);defaulttable.setValueAt(partidos.WolvesPrueba2j2(),1,1);defaulttable.setValueAt(partidos.WolvesPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.WolvesPrueba4j2(),1,3);defaulttable.setValueAt(partidos.WolvesPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj3(), 2,0);defaulttable.setValueAt(partidos.WolvesPrueba2j3(),2,1);defaulttable.setValueAt(partidos.WolvesPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.WolvesPrueba4j3(),2,3);defaulttable.setValueAt(partidos.WolvesPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj4(), 3,0);defaulttable.setValueAt(partidos.WolvesPrueba2j4(),3,1);defaulttable.setValueAt(partidos.WolvesPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.WolvesPrueba4j4(),3,3);defaulttable.setValueAt(partidos.WolvesPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj5(), 4,0);defaulttable.setValueAt(partidos.WolvesPrueba2j5(),4,1);defaulttable.setValueAt(partidos.WolvesPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.WolvesPrueba4j5(),4,3);defaulttable.setValueAt(partidos.WolvesPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj6(), 5,0);defaulttable.setValueAt(partidos.WolvesPrueba2j6(),5,1);defaulttable.setValueAt(partidos.WolvesPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.WolvesPrueba4j6(),5,3);defaulttable.setValueAt(partidos.WolvesPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj7(), 6,0);defaulttable.setValueAt(partidos.WolvesPrueba2j7(),6,1);defaulttable.setValueAt(partidos.WolvesPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.WolvesPrueba4j7(),6,3);defaulttable.setValueAt(partidos.WolvesPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj8(), 7,0);defaulttable.setValueAt(partidos.WolvesPrueba2j8(),7,1);defaulttable.setValueAt(partidos.WolvesPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.WolvesPrueba4j8(),7,3);defaulttable.setValueAt(partidos.WolvesPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj9(), 8,0);defaulttable.setValueAt(partidos.WolvesPrueba2j9(),8,1);defaulttable.setValueAt(partidos.WolvesPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.WolvesPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj10(),9,0);defaulttable.setValueAt(partidos.WolvesPrueba2j10(),9,1);defaulttable.setValueAt(partidos.WolvesPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.WolvesPrueba4j10(),9,3);defaulttable.setValueAt(partidos.WolvesPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj11(), 10,0);defaulttable.setValueAt(partidos.WolvesPrueba2j11(),10,1);defaulttable.setValueAt(partidos.WolvesPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.WolvesPrueba4j11(),10,3);defaulttable.setValueAt(partidos.WolvesPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj12(), 11,0);defaulttable.setValueAt(partidos.WolvesPrueba2j12(),11,1);defaulttable.setValueAt(partidos.WolvesPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.WolvesPrueba4j12(),11,3);defaulttable.setValueAt(partidos.WolvesPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj13(), 12,0);defaulttable.setValueAt(partidos.WolvesPrueba2j13(),12,1);defaulttable.setValueAt(partidos.WolvesPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.WolvesPrueba4j13(),12,3);defaulttable.setValueAt(partidos.WolvesPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj14(), 13,0);defaulttable.setValueAt(partidos.WolvesPrueba2j14(),13,1);defaulttable.setValueAt(partidos.WolvesPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.WolvesPrueba4j14(),13,3);defaulttable.setValueAt(partidos.WolvesPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj15(), 14,0);defaulttable.setValueAt(partidos.WolvesPrueba2j15(),14,1);defaulttable.setValueAt(partidos.WolvesPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.WolvesPrueba4j15(),14,3);defaulttable.setValueAt(partidos.WolvesPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj17(), 16,0);defaulttable.setValueAt(partidos.WolvesPrueba2j17(),16,1);defaulttable.setValueAt(partidos.WolvesPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.WolvesPrueba4j17(),16,3);defaulttable.setValueAt(partidos.WolvesPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj16(), 15,0);defaulttable.setValueAt(partidos.WolvesPrueba2j16(),15,1);defaulttable.setValueAt(partidos.WolvesPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.WolvesPrueba4j16(),15,3);defaulttable.setValueAt(partidos.WolvesPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj18(), 17,0);defaulttable.setValueAt(partidos.WolvesPrueba2j18(),17,1);defaulttable.setValueAt(partidos.WolvesPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.WolvesPrueba4j18(),17,3);defaulttable.setValueAt(partidos.WolvesPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj19(), 18,0);defaulttable.setValueAt(partidos.WolvesPrueba2j19(),18,1);defaulttable.setValueAt(partidos.WolvesPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.WolvesPrueba4j19(),18,3);defaulttable.setValueAt(partidos.WolvesPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj20(), 19,0);defaulttable.setValueAt(partidos.WolvesPrueba2j20(),19,1);defaulttable.setValueAt(partidos.WolvesPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.WolvesPrueba4j20(),19,3);defaulttable.setValueAt(partidos.WolvesPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj21(), 20,0);defaulttable.setValueAt(partidos.WolvesPrueba2j21(),20,1);defaulttable.setValueAt(partidos.WolvesPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.WolvesPrueba4j21(),20,3);defaulttable.setValueAt(partidos.WolvesPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj22(), 21,0);defaulttable.setValueAt(partidos.WolvesPrueba2j22(),21,1);defaulttable.setValueAt(partidos.WolvesPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.WolvesPrueba4j22(),21,3);defaulttable.setValueAt(partidos.WolvesPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj23(), 22,0);defaulttable.setValueAt(partidos.WolvesPrueba2j23(),22,1);defaulttable.setValueAt(partidos.WolvesPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.WolvesPrueba4j23(),22,3);defaulttable.setValueAt(partidos.WolvesPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj24(), 23,0);defaulttable.setValueAt(partidos.WolvesPrueba2j24(),23,1);defaulttable.setValueAt(partidos.WolvesPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.WolvesPrueba4j24(),23,3);defaulttable.setValueAt(partidos.WolvesPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj25(), 24,0);defaulttable.setValueAt(partidos.WolvesPrueba2j25(),24,1);defaulttable.setValueAt(partidos.WolvesPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.WolvesPrueba4j25(),24,3);defaulttable.setValueAt(partidos.WolvesPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.WolvesPruebaj26(), 25,0);defaulttable.setValueAt(partidos.WolvesPrueba2j26(),25,1);defaulttable.setValueAt(partidos.WolvesPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.WolvesPrueba4j26(),25,3);defaulttable.setValueAt(partidos.WolvesPrueba5j26(), 25,4);

        wolveslist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==evertonlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Everton());
        finalrefs.setText(partidos.EvertonArbis());
        defaulttable.setValueAt(partidos.EvertonPrueba(), 0,0);defaulttable.setValueAt(partidos.EvertonPrueba2(),0,1);defaulttable.setValueAt(partidos.EvertonPrueba3(),0,2);defaulttable.setValueAt(partidos.EvertonPrueba4(),0,3);defaulttable.setValueAt(partidos.EvertonPrueba5(),0,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj2(), 1,0);defaulttable.setValueAt(partidos.EvertonPrueba2j2(),1,1);defaulttable.setValueAt(partidos.EvertonPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.EvertonPrueba4j2(),1,3);defaulttable.setValueAt(partidos.EvertonPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj3(), 2,0);defaulttable.setValueAt(partidos.EvertonPrueba2j3(),2,1);defaulttable.setValueAt(partidos.EvertonPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.EvertonPrueba4j3(),2,3);defaulttable.setValueAt(partidos.EvertonPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj4(), 3,0);defaulttable.setValueAt(partidos.EvertonPrueba2j4(),3,1);defaulttable.setValueAt(partidos.EvertonPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.EvertonPrueba4j4(),3,3);defaulttable.setValueAt(partidos.EvertonPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj5(), 4,0);defaulttable.setValueAt(partidos.EvertonPrueba2j5(),4,1);defaulttable.setValueAt(partidos.EvertonPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.EvertonPrueba4j5(),4,3);defaulttable.setValueAt(partidos.EvertonPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj6(), 5,0);defaulttable.setValueAt(partidos.EvertonPrueba2j6(),5,1);defaulttable.setValueAt(partidos.EvertonPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.EvertonPrueba4j6(),5,3);defaulttable.setValueAt(partidos.EvertonPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj7(), 6,0);defaulttable.setValueAt(partidos.EvertonPrueba2j7(),6,1);defaulttable.setValueAt(partidos.EvertonPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.EvertonPrueba4j7(),6,3);defaulttable.setValueAt(partidos.EvertonPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj8(), 7,0);defaulttable.setValueAt(partidos.EvertonPrueba2j8(),7,1);defaulttable.setValueAt(partidos.EvertonPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.EvertonPrueba4j8(),7,3);defaulttable.setValueAt(partidos.EvertonPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj9(), 8,0);defaulttable.setValueAt(partidos.EvertonPrueba2j9(),8,1);defaulttable.setValueAt(partidos.EvertonPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.EvertonPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj10(),9,0);defaulttable.setValueAt(partidos.EvertonPrueba2j10(),9,1);defaulttable.setValueAt(partidos.EvertonPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.EvertonPrueba4j10(),9,3);defaulttable.setValueAt(partidos.EvertonPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj11(), 10,0);defaulttable.setValueAt(partidos.EvertonPrueba2j11(),10,1);defaulttable.setValueAt(partidos.EvertonPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.EvertonPrueba4j11(),10,3);defaulttable.setValueAt(partidos.EvertonPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj12(), 11,0);defaulttable.setValueAt(partidos.EvertonPrueba2j12(),11,1);defaulttable.setValueAt(partidos.EvertonPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.EvertonPrueba4j12(),11,3);defaulttable.setValueAt(partidos.EvertonPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj13(), 12,0);defaulttable.setValueAt(partidos.EvertonPrueba2j13(),12,1);defaulttable.setValueAt(partidos.EvertonPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.EvertonPrueba4j13(),12,3);defaulttable.setValueAt(partidos.EvertonPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj14(), 13,0);defaulttable.setValueAt(partidos.EvertonPrueba2j14(),13,1);defaulttable.setValueAt(partidos.EvertonPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.EvertonPrueba4j14(),13,3);defaulttable.setValueAt(partidos.EvertonPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj15(), 14,0);defaulttable.setValueAt(partidos.EvertonPrueba2j15(),14,1);defaulttable.setValueAt(partidos.EvertonPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.EvertonPrueba4j15(),14,3);defaulttable.setValueAt(partidos.EvertonPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj17(), 16,0);defaulttable.setValueAt(partidos.EvertonPrueba2j17(),16,1);defaulttable.setValueAt(partidos.EvertonPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.EvertonPrueba4j17(),16,3);defaulttable.setValueAt(partidos.EvertonPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj16(), 15,0);defaulttable.setValueAt(partidos.EvertonPrueba2j16(),15,1);defaulttable.setValueAt(partidos.EvertonPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.EvertonPrueba4j16(),15,3);defaulttable.setValueAt(partidos.EvertonPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj18(), 17,0);defaulttable.setValueAt(partidos.EvertonPrueba2j18(),17,1);defaulttable.setValueAt(partidos.EvertonPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.EvertonPrueba4j18(),17,3);defaulttable.setValueAt(partidos.EvertonPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj19(), 18,0);defaulttable.setValueAt(partidos.EvertonPrueba2j19(),18,1);defaulttable.setValueAt(partidos.EvertonPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.EvertonPrueba4j19(),18,3);defaulttable.setValueAt(partidos.EvertonPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj20(), 19,0);defaulttable.setValueAt(partidos.EvertonPrueba2j20(),19,1);defaulttable.setValueAt(partidos.EvertonPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.EvertonPrueba4j20(),19,3);defaulttable.setValueAt(partidos.EvertonPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj21(), 20,0);defaulttable.setValueAt(partidos.EvertonPrueba2j21(),20,1);defaulttable.setValueAt(partidos.EvertonPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.EvertonPrueba4j21(),20,3);defaulttable.setValueAt(partidos.EvertonPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj22(), 21,0);defaulttable.setValueAt(partidos.EvertonPrueba2j22(),21,1);defaulttable.setValueAt(partidos.EvertonPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.EvertonPrueba4j22(),21,3);defaulttable.setValueAt(partidos.EvertonPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj23(), 22,0);defaulttable.setValueAt(partidos.EvertonPrueba2j23(),22,1);defaulttable.setValueAt(partidos.EvertonPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.EvertonPrueba4j23(),22,3);defaulttable.setValueAt(partidos.EvertonPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj24(), 23,0);defaulttable.setValueAt(partidos.EvertonPrueba2j24(),23,1);defaulttable.setValueAt(partidos.EvertonPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.EvertonPrueba4j24(),23,3);defaulttable.setValueAt(partidos.EvertonPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj25(), 24,0);defaulttable.setValueAt(partidos.EvertonPrueba2j25(),24,1);defaulttable.setValueAt(partidos.EvertonPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.EvertonPrueba4j25(),24,3);defaulttable.setValueAt(partidos.EvertonPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.EvertonPruebaj26(), 25,0);defaulttable.setValueAt(partidos.EvertonPrueba2j26(),25,1);defaulttable.setValueAt(partidos.EvertonPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.EvertonPrueba4j26(),25,3);defaulttable.setValueAt(partidos.EvertonPrueba5j26(), 25,4);

        evertonlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==leicesterlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Leicester());
        finalrefs.setText(partidos.LeicesterArbis());
        defaulttable.setValueAt(partidos.LeicesterPrueba(), 0,0);defaulttable.setValueAt(partidos.LeicesterPrueba2(),0,1);defaulttable.setValueAt(partidos.LeicesterPrueba3(),0,2);defaulttable.setValueAt(partidos.LeicesterPrueba4(),0,3);defaulttable.setValueAt(partidos.LeicesterPrueba5(),0,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj2(), 1,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j2(),1,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j2(),1,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj3(), 2,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j3(),2,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j3(),2,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj4(), 3,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j4(),3,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j4(),3,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj5(), 4,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j5(),4,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j5(),4,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj6(), 5,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j6(),5,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j6(),5,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj7(), 6,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j7(),6,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j7(),6,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj8(), 7,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j8(),7,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j8(),7,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj9(), 8,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j9(),8,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj10(),9,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j10(),9,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j10(),9,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj11(), 10,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j11(),10,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j11(),10,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj12(), 11,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j12(),11,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j12(),11,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj13(), 12,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j13(),12,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j13(),12,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj14(), 13,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j14(),13,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j14(),13,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj15(), 14,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j15(),14,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j15(),14,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj17(), 16,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j17(),16,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j17(),16,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj16(), 15,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j16(),15,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j16(),15,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj18(), 17,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j18(),17,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j18(),17,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj19(), 18,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j19(),18,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j19(),18,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj20(), 19,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j20(),19,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j20(),19,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj21(), 20,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j21(),20,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j21(),20,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj22(), 21,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j22(),21,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j22(),21,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj23(), 22,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j23(),22,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j23(),22,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj24(), 23,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j24(),23,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j24(),23,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj25(), 24,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j25(),24,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j25(),24,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.LeicesterPruebaj26(), 25,0);defaulttable.setValueAt(partidos.LeicesterPrueba2j26(),25,1);defaulttable.setValueAt(partidos.LeicesterPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.LeicesterPrueba4j26(),25,3);defaulttable.setValueAt(partidos.LeicesterPrueba5j26(), 25,4);

        leicesterlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==westhamlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.WestHam());
        finalrefs.setText(partidos.WestHamArbis());
        defaulttable.setValueAt(partidos.HamPrueba(), 0,0);defaulttable.setValueAt(partidos.HamPrueba2(),0,1);defaulttable.setValueAt(partidos.HamPrueba3(),0,2);defaulttable.setValueAt(partidos.HamPrueba4(),0,3);defaulttable.setValueAt(partidos.HamPrueba5(),0,4);
        defaulttable.setValueAt(partidos.HamPruebaj2(), 1,0);defaulttable.setValueAt(partidos.HamPrueba2j2(),1,1);defaulttable.setValueAt(partidos.HamPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.HamPrueba4j2(),1,3);defaulttable.setValueAt(partidos.HamPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.HamPruebaj3(), 2,0);defaulttable.setValueAt(partidos.HamPrueba2j3(),2,1);defaulttable.setValueAt(partidos.HamPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.HamPrueba4j3(),2,3);defaulttable.setValueAt(partidos.HamPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.HamPruebaj4(), 3,0);defaulttable.setValueAt(partidos.HamPrueba2j4(),3,1);defaulttable.setValueAt(partidos.HamPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.HamPrueba4j4(),3,3);defaulttable.setValueAt(partidos.HamPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.HamPruebaj5(), 4,0);defaulttable.setValueAt(partidos.HamPrueba2j5(),4,1);defaulttable.setValueAt(partidos.HamPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.HamPrueba4j5(),4,3);defaulttable.setValueAt(partidos.HamPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.HamPruebaj6(), 5,0);defaulttable.setValueAt(partidos.HamPrueba2j6(),5,1);defaulttable.setValueAt(partidos.HamPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.HamPrueba4j6(),5,3);defaulttable.setValueAt(partidos.HamPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.HamPruebaj7(), 6,0);defaulttable.setValueAt(partidos.HamPrueba2j7(),6,1);defaulttable.setValueAt(partidos.HamPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.HamPrueba4j7(),6,3);defaulttable.setValueAt(partidos.HamPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.HamPruebaj8(), 7,0);defaulttable.setValueAt(partidos.HamPrueba2j8(),7,1);defaulttable.setValueAt(partidos.HamPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.HamPrueba4j8(),7,3);defaulttable.setValueAt(partidos.HamPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.HamPruebaj9(), 8,0);defaulttable.setValueAt(partidos.HamPrueba2j9(),8,1);defaulttable.setValueAt(partidos.HamPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.HamPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.HamPruebaj10(),9,0);defaulttable.setValueAt(partidos.HamPrueba2j10(),9,1);defaulttable.setValueAt(partidos.HamPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.HamPrueba4j10(),9,3);defaulttable.setValueAt(partidos.HamPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.HamPruebaj11(), 10,0);defaulttable.setValueAt(partidos.HamPrueba2j11(),10,1);defaulttable.setValueAt(partidos.HamPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.HamPrueba4j11(),10,3);defaulttable.setValueAt(partidos.HamPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.HamPruebaj12(), 11,0);defaulttable.setValueAt(partidos.HamPrueba2j12(),11,1);defaulttable.setValueAt(partidos.HamPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.HamPrueba4j12(),11,3);defaulttable.setValueAt(partidos.HamPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.HamPruebaj13(), 12,0);defaulttable.setValueAt(partidos.HamPrueba2j13(),12,1);defaulttable.setValueAt(partidos.HamPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.HamPrueba4j13(),12,3);defaulttable.setValueAt(partidos.HamPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.HamPruebaj14(), 13,0);defaulttable.setValueAt(partidos.HamPrueba2j14(),13,1);defaulttable.setValueAt(partidos.HamPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.HamPrueba4j14(),13,3);defaulttable.setValueAt(partidos.HamPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.HamPruebaj15(), 14,0);defaulttable.setValueAt(partidos.HamPrueba2j15(),14,1);defaulttable.setValueAt(partidos.HamPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.HamPrueba4j15(),14,3);defaulttable.setValueAt(partidos.HamPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.HamPruebaj17(), 16,0);defaulttable.setValueAt(partidos.HamPrueba2j17(),16,1);defaulttable.setValueAt(partidos.HamPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.HamPrueba4j17(),16,3);defaulttable.setValueAt(partidos.HamPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.HamPruebaj16(), 15,0);defaulttable.setValueAt(partidos.HamPrueba2j16(),15,1);defaulttable.setValueAt(partidos.HamPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.HamPrueba4j16(),15,3);defaulttable.setValueAt(partidos.HamPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.HamPruebaj18(), 17,0);defaulttable.setValueAt(partidos.HamPrueba2j18(),17,1);defaulttable.setValueAt(partidos.HamPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.HamPrueba4j18(),17,3);defaulttable.setValueAt(partidos.HamPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.HamPruebaj19(), 18,0);defaulttable.setValueAt(partidos.HamPrueba2j19(),18,1);defaulttable.setValueAt(partidos.HamPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.HamPrueba4j19(),18,3);defaulttable.setValueAt(partidos.HamPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.HamPruebaj20(), 19,0);defaulttable.setValueAt(partidos.HamPrueba2j20(),19,1);defaulttable.setValueAt(partidos.HamPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.HamPrueba4j20(),19,3);defaulttable.setValueAt(partidos.HamPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.HamPruebaj21(), 20,0);defaulttable.setValueAt(partidos.HamPrueba2j21(),20,1);defaulttable.setValueAt(partidos.HamPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.HamPrueba4j21(),20,3);defaulttable.setValueAt(partidos.HamPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.HamPruebaj22(), 21,0);defaulttable.setValueAt(partidos.HamPrueba2j22(),21,1);defaulttable.setValueAt(partidos.HamPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.HamPrueba4j22(),21,3);defaulttable.setValueAt(partidos.HamPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.HamPruebaj23(), 22,0);defaulttable.setValueAt(partidos.HamPrueba2j23(),22,1);defaulttable.setValueAt(partidos.HamPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.HamPrueba4j23(),22,3);defaulttable.setValueAt(partidos.HamPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.HamPruebaj24(), 23,0);defaulttable.setValueAt(partidos.HamPrueba2j24(),23,1);defaulttable.setValueAt(partidos.HamPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.HamPrueba4j24(),23,3);defaulttable.setValueAt(partidos.HamPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.HamPruebaj25(), 24,0);defaulttable.setValueAt(partidos.HamPrueba2j25(),24,1);defaulttable.setValueAt(partidos.HamPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.HamPrueba4j25(),24,3);defaulttable.setValueAt(partidos.HamPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.HamPruebaj26(), 25,0);defaulttable.setValueAt(partidos.HamPrueba2j26(),25,1);defaulttable.setValueAt(partidos.HamPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.HamPrueba4j26(),25,3);defaulttable.setValueAt(partidos.HamPrueba5j26(), 25,4);

        westhamlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==watfordlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Watford());
        finalrefs.setText(partidos.WatfordArbis());
        defaulttable.setValueAt(partidos.WatfordPrueba(), 0,0);defaulttable.setValueAt(partidos.WatfordPrueba2(),0,1);defaulttable.setValueAt(partidos.WatfordPrueba3(),0,2);defaulttable.setValueAt(partidos.WatfordPrueba4(),0,3);defaulttable.setValueAt(partidos.WatfordPrueba5(),0,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj2(), 1,0);defaulttable.setValueAt(partidos.WatfordPrueba2j2(),1,1);defaulttable.setValueAt(partidos.WatfordPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.WatfordPrueba4j2(),1,3);defaulttable.setValueAt(partidos.WatfordPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj3(), 2,0);defaulttable.setValueAt(partidos.WatfordPrueba2j3(),2,1);defaulttable.setValueAt(partidos.WatfordPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.WatfordPrueba4j3(),2,3);defaulttable.setValueAt(partidos.WatfordPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj4(), 3,0);defaulttable.setValueAt(partidos.WatfordPrueba2j4(),3,1);defaulttable.setValueAt(partidos.WatfordPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.WatfordPrueba4j4(),3,3);defaulttable.setValueAt(partidos.WatfordPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj5(), 4,0);defaulttable.setValueAt(partidos.WatfordPrueba2j5(),4,1);defaulttable.setValueAt(partidos.WatfordPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.WatfordPrueba4j5(),4,3);defaulttable.setValueAt(partidos.WatfordPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj6(), 5,0);defaulttable.setValueAt(partidos.WatfordPrueba2j6(),5,1);defaulttable.setValueAt(partidos.WatfordPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.WatfordPrueba4j6(),5,3);defaulttable.setValueAt(partidos.WatfordPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj7(), 6,0);defaulttable.setValueAt(partidos.WatfordPrueba2j7(),6,1);defaulttable.setValueAt(partidos.WatfordPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.WatfordPrueba4j7(),6,3);defaulttable.setValueAt(partidos.WatfordPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj8(), 7,0);defaulttable.setValueAt(partidos.WatfordPrueba2j8(),7,1);defaulttable.setValueAt(partidos.WatfordPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.WatfordPrueba4j8(),7,3);defaulttable.setValueAt(partidos.WatfordPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj9(), 8,0);defaulttable.setValueAt(partidos.WatfordPrueba2j9(),8,1);defaulttable.setValueAt(partidos.WatfordPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.WatfordPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj10(),9,0);defaulttable.setValueAt(partidos.WatfordPrueba2j10(),9,1);defaulttable.setValueAt(partidos.WatfordPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.WatfordPrueba4j10(),9,3);defaulttable.setValueAt(partidos.WatfordPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj11(), 10,0);defaulttable.setValueAt(partidos.WatfordPrueba2j11(),10,1);defaulttable.setValueAt(partidos.WatfordPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.WatfordPrueba4j11(),10,3);defaulttable.setValueAt(partidos.WatfordPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj12(), 11,0);defaulttable.setValueAt(partidos.WatfordPrueba2j12(),11,1);defaulttable.setValueAt(partidos.WatfordPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.WatfordPrueba4j12(),11,3);defaulttable.setValueAt(partidos.WatfordPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj13(), 12,0);defaulttable.setValueAt(partidos.WatfordPrueba2j13(),12,1);defaulttable.setValueAt(partidos.WatfordPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.WatfordPrueba4j13(),12,3);defaulttable.setValueAt(partidos.WatfordPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj14(), 13,0);defaulttable.setValueAt(partidos.WatfordPrueba2j14(),13,1);defaulttable.setValueAt(partidos.WatfordPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.WatfordPrueba4j14(),13,3);defaulttable.setValueAt(partidos.WatfordPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj15(), 14,0);defaulttable.setValueAt(partidos.WatfordPrueba2j15(),14,1);defaulttable.setValueAt(partidos.WatfordPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.WatfordPrueba4j15(),14,3);defaulttable.setValueAt(partidos.WatfordPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj17(), 16,0);defaulttable.setValueAt(partidos.WatfordPrueba2j17(),16,1);defaulttable.setValueAt(partidos.WatfordPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.WatfordPrueba4j17(),16,3);defaulttable.setValueAt(partidos.WatfordPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj16(), 15,0);defaulttable.setValueAt(partidos.WatfordPrueba2j16(),15,1);defaulttable.setValueAt(partidos.WatfordPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.WatfordPrueba4j16(),15,3);defaulttable.setValueAt(partidos.WatfordPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj18(), 17,0);defaulttable.setValueAt(partidos.WatfordPrueba2j18(),17,1);defaulttable.setValueAt(partidos.WatfordPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.WatfordPrueba4j18(),17,3);defaulttable.setValueAt(partidos.WatfordPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj19(), 18,0);defaulttable.setValueAt(partidos.WatfordPrueba2j19(),18,1);defaulttable.setValueAt(partidos.WatfordPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.WatfordPrueba4j19(),18,3);defaulttable.setValueAt(partidos.WatfordPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj20(), 19,0);defaulttable.setValueAt(partidos.WatfordPrueba2j20(),19,1);defaulttable.setValueAt(partidos.WatfordPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.WatfordPrueba4j20(),19,3);defaulttable.setValueAt(partidos.WatfordPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj21(), 20,0);defaulttable.setValueAt(partidos.WatfordPrueba2j21(),20,1);defaulttable.setValueAt(partidos.WatfordPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.WatfordPrueba4j21(),20,3);defaulttable.setValueAt(partidos.WatfordPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj22(), 21,0);defaulttable.setValueAt(partidos.WatfordPrueba2j22(),21,1);defaulttable.setValueAt(partidos.WatfordPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.WatfordPrueba4j22(),21,3);defaulttable.setValueAt(partidos.WatfordPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj23(), 22,0);defaulttable.setValueAt(partidos.WatfordPrueba2j23(),22,1);defaulttable.setValueAt(partidos.WatfordPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.WatfordPrueba4j23(),22,3);defaulttable.setValueAt(partidos.WatfordPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj24(), 23,0);defaulttable.setValueAt(partidos.WatfordPrueba2j24(),23,1);defaulttable.setValueAt(partidos.WatfordPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.WatfordPrueba4j24(),23,3);defaulttable.setValueAt(partidos.WatfordPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj25(), 24,0);defaulttable.setValueAt(partidos.WatfordPrueba2j25(),24,1);defaulttable.setValueAt(partidos.WatfordPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.WatfordPrueba4j25(),24,3);defaulttable.setValueAt(partidos.WatfordPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.WatfordPruebaj26(), 25,0);defaulttable.setValueAt(partidos.WatfordPrueba2j26(),25,1);defaulttable.setValueAt(partidos.WatfordPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.WatfordPrueba4j26(),25,3);defaulttable.setValueAt(partidos.WatfordPrueba5j26(), 25,4);

        watfordlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==palacelist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.CrystalPalace());
        finalrefs.setText(partidos.CrystalPalaceArbis());
        defaulttable.setValueAt(partidos.PalacePrueba(), 0,0);defaulttable.setValueAt(partidos.PalacePrueba2(),0,1);defaulttable.setValueAt(partidos.PalacePrueba3(),0,2);defaulttable.setValueAt(partidos.PalacePrueba4(),0,3);defaulttable.setValueAt(partidos.PalacePrueba5(),0,4);
        defaulttable.setValueAt(partidos.PalacePruebaj2(), 1,0);defaulttable.setValueAt(partidos.PalacePrueba2j2(),1,1);defaulttable.setValueAt(partidos.PalacePrueba3j2(), 1,2);defaulttable.setValueAt(partidos.PalacePrueba4j2(),1,3);defaulttable.setValueAt(partidos.PalacePrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.PalacePruebaj3(), 2,0);defaulttable.setValueAt(partidos.PalacePrueba2j3(),2,1);defaulttable.setValueAt(partidos.PalacePrueba3j3(), 2,2);defaulttable.setValueAt(partidos.PalacePrueba4j3(),2,3);defaulttable.setValueAt(partidos.PalacePrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.PalacePruebaj4(), 3,0);defaulttable.setValueAt(partidos.PalacePrueba2j4(),3,1);defaulttable.setValueAt(partidos.PalacePrueba3j4(), 3,2);defaulttable.setValueAt(partidos.PalacePrueba4j4(),3,3);defaulttable.setValueAt(partidos.PalacePrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.PalacePruebaj5(), 4,0);defaulttable.setValueAt(partidos.PalacePrueba2j5(),4,1);defaulttable.setValueAt(partidos.PalacePrueba3j5(), 4,2);defaulttable.setValueAt(partidos.PalacePrueba4j5(),4,3);defaulttable.setValueAt(partidos.PalacePrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.PalacePruebaj6(), 5,0);defaulttable.setValueAt(partidos.PalacePrueba2j6(),5,1);defaulttable.setValueAt(partidos.PalacePrueba3j6(), 5,2);defaulttable.setValueAt(partidos.PalacePrueba4j6(),5,3);defaulttable.setValueAt(partidos.PalacePrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.PalacePruebaj7(), 6,0);defaulttable.setValueAt(partidos.PalacePrueba2j7(),6,1);defaulttable.setValueAt(partidos.PalacePrueba3j7(), 6,2);defaulttable.setValueAt(partidos.PalacePrueba4j7(),6,3);defaulttable.setValueAt(partidos.PalacePrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.PalacePruebaj8(), 7,0);defaulttable.setValueAt(partidos.PalacePrueba2j8(),7,1);defaulttable.setValueAt(partidos.PalacePrueba3j8(), 7,2);defaulttable.setValueAt(partidos.PalacePrueba4j8(),7,3);defaulttable.setValueAt(partidos.PalacePrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.PalacePruebaj9(), 8,0);defaulttable.setValueAt(partidos.PalacePrueba2j9(),8,1);defaulttable.setValueAt(partidos.PalacePrueba3j9(), 8,2);defaulttable.setValueAt(partidos.PalacePrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.PalacePruebaj10(),9,0);defaulttable.setValueAt(partidos.PalacePrueba2j10(),9,1);defaulttable.setValueAt(partidos.PalacePrueba3j10(), 9,2);defaulttable.setValueAt(partidos.PalacePrueba4j10(),9,3);defaulttable.setValueAt(partidos.PalacePrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.PalacePruebaj11(), 10,0);defaulttable.setValueAt(partidos.PalacePrueba2j11(),10,1);defaulttable.setValueAt(partidos.PalacePrueba3j11(), 10,2);defaulttable.setValueAt(partidos.PalacePrueba4j11(),10,3);defaulttable.setValueAt(partidos.PalacePrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.PalacePruebaj12(), 11,0);defaulttable.setValueAt(partidos.PalacePrueba2j12(),11,1);defaulttable.setValueAt(partidos.PalacePrueba3j12(), 11,2);defaulttable.setValueAt(partidos.PalacePrueba4j12(),11,3);defaulttable.setValueAt(partidos.PalacePrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.PalacePruebaj13(), 12,0);defaulttable.setValueAt(partidos.PalacePrueba2j13(),12,1);defaulttable.setValueAt(partidos.PalacePrueba3j13(), 12,2);defaulttable.setValueAt(partidos.PalacePrueba4j13(),12,3);defaulttable.setValueAt(partidos.PalacePrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.PalacePruebaj14(), 13,0);defaulttable.setValueAt(partidos.PalacePrueba2j14(),13,1);defaulttable.setValueAt(partidos.PalacePrueba3j14(), 13,2);defaulttable.setValueAt(partidos.PalacePrueba4j14(),13,3);defaulttable.setValueAt(partidos.PalacePrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.PalacePruebaj15(), 14,0);defaulttable.setValueAt(partidos.PalacePrueba2j15(),14,1);defaulttable.setValueAt(partidos.PalacePrueba3j15(), 14,2);defaulttable.setValueAt(partidos.PalacePrueba4j15(),14,3);defaulttable.setValueAt(partidos.PalacePrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.PalacePruebaj17(), 16,0);defaulttable.setValueAt(partidos.PalacePrueba2j17(),16,1);defaulttable.setValueAt(partidos.PalacePrueba3j17(), 16,2);defaulttable.setValueAt(partidos.PalacePrueba4j17(),16,3);defaulttable.setValueAt(partidos.PalacePrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.PalacePruebaj16(), 15,0);defaulttable.setValueAt(partidos.PalacePrueba2j16(),15,1);defaulttable.setValueAt(partidos.PalacePrueba3j16(), 15,2);defaulttable.setValueAt(partidos.PalacePrueba4j16(),15,3);defaulttable.setValueAt(partidos.PalacePrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.PalacePruebaj18(), 17,0);defaulttable.setValueAt(partidos.PalacePrueba2j18(),17,1);defaulttable.setValueAt(partidos.PalacePrueba3j18(), 17,2);defaulttable.setValueAt(partidos.PalacePrueba4j18(),17,3);defaulttable.setValueAt(partidos.PalacePrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.PalacePruebaj19(), 18,0);defaulttable.setValueAt(partidos.PalacePrueba2j19(),18,1);defaulttable.setValueAt(partidos.PalacePrueba3j19(), 18,2);defaulttable.setValueAt(partidos.PalacePrueba4j19(),18,3);defaulttable.setValueAt(partidos.PalacePrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.PalacePruebaj20(), 19,0);defaulttable.setValueAt(partidos.PalacePrueba2j20(),19,1);defaulttable.setValueAt(partidos.PalacePrueba3j20(), 19,2);defaulttable.setValueAt(partidos.PalacePrueba4j20(),19,3);defaulttable.setValueAt(partidos.PalacePrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.PalacePruebaj21(), 20,0);defaulttable.setValueAt(partidos.PalacePrueba2j21(),20,1);defaulttable.setValueAt(partidos.PalacePrueba3j21(), 20,2);defaulttable.setValueAt(partidos.PalacePrueba4j21(),20,3);defaulttable.setValueAt(partidos.PalacePrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.PalacePruebaj22(), 21,0);defaulttable.setValueAt(partidos.PalacePrueba2j22(),21,1);defaulttable.setValueAt(partidos.PalacePrueba3j22(), 21,2);defaulttable.setValueAt(partidos.PalacePrueba4j22(),21,3);defaulttable.setValueAt(partidos.PalacePrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.PalacePruebaj23(), 22,0);defaulttable.setValueAt(partidos.PalacePrueba2j23(),22,1);defaulttable.setValueAt(partidos.PalacePrueba3j23(), 22,2);defaulttable.setValueAt(partidos.PalacePrueba4j23(),22,3);defaulttable.setValueAt(partidos.PalacePrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.PalacePruebaj24(), 23,0);defaulttable.setValueAt(partidos.PalacePrueba2j24(),23,1);defaulttable.setValueAt(partidos.PalacePrueba3j24(), 23,2);defaulttable.setValueAt(partidos.PalacePrueba4j24(),23,3);defaulttable.setValueAt(partidos.PalacePrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.PalacePruebaj25(), 24,0);defaulttable.setValueAt(partidos.PalacePrueba2j25(),24,1);defaulttable.setValueAt(partidos.PalacePrueba3j25(), 24,2);defaulttable.setValueAt(partidos.PalacePrueba4j25(),24,3);defaulttable.setValueAt(partidos.PalacePrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.PalacePruebaj26(), 25,0);defaulttable.setValueAt(partidos.PalacePrueba2j26(),25,1);defaulttable.setValueAt(partidos.PalacePrueba3j26(), 25,2);defaulttable.setValueAt(partidos.PalacePrueba4j26(),25,3);defaulttable.setValueAt(partidos.PalacePrueba5j26(), 25,4);

        palacelist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==newcastlelist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Newcastle());
        finalrefs.setText(partidos.NewcastleArbis());
        defaulttable.setValueAt(partidos.NewcastlePrueba(), 0,0);defaulttable.setValueAt(partidos.NewcastlePrueba2(),0,1);defaulttable.setValueAt(partidos.NewcastlePrueba3(),0,2);defaulttable.setValueAt(partidos.NewcastlePrueba4(),0,3);defaulttable.setValueAt(partidos.NewcastlePrueba5(),0,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj2(), 1,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j2(),1,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j2(), 1,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j2(),1,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj3(), 2,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j3(),2,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j3(), 2,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j3(),2,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj4(), 3,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j4(),3,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j4(), 3,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j4(),3,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj5(), 4,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j5(),4,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j5(), 4,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j5(),4,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj6(), 5,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j6(),5,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j6(), 5,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j6(),5,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj7(), 6,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j7(),6,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j7(), 6,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j7(),6,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj8(), 7,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j8(),7,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j8(), 7,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j8(),7,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj9(), 8,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j9(),8,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j9(), 8,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj10(),9,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j10(),9,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j10(), 9,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j10(),9,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj11(), 10,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j11(),10,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j11(), 10,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j11(),10,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj12(), 11,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j12(),11,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j12(), 11,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j12(),11,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj13(), 12,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j13(),12,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j13(), 12,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j13(),12,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj14(), 13,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j14(),13,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j14(), 13,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j14(),13,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj15(), 14,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j15(),14,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j15(), 14,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j15(),14,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj17(), 16,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j17(),16,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j17(), 16,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j17(),16,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj16(), 15,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j16(),15,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j16(), 15,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j16(),15,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj18(), 17,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j18(),17,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j18(), 17,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j18(),17,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj19(), 18,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j19(),18,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j19(), 18,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j19(),18,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj20(), 19,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j20(),19,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j20(), 19,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j20(),19,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj21(), 20,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j21(),20,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j21(), 20,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j21(),20,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj22(), 21,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j22(),21,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j22(), 21,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j22(),21,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj23(), 22,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j23(),22,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j23(), 22,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j23(),22,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj24(), 23,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j24(),23,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j24(), 23,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j24(),23,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj25(), 24,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j25(),24,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j25(), 24,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j25(),24,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.NewcastlePruebaj26(), 25,0);defaulttable.setValueAt(partidos.NewcastlePrueba2j26(),25,1);defaulttable.setValueAt(partidos.NewcastlePrueba3j26(), 25,2);defaulttable.setValueAt(partidos.NewcastlePrueba4j26(),25,3);defaulttable.setValueAt(partidos.NewcastlePrueba5j26(), 25,4);

        newcastlelist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==bournemouthlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Bournemouth());
        finalrefs.setText(partidos.BournemouthArbis());
        defaulttable.setValueAt(partidos.BournemouthPrueba(), 0,0);defaulttable.setValueAt(partidos.BournemouthPrueba2(),0,1);defaulttable.setValueAt(partidos.BournemouthPrueba3(),0,2);defaulttable.setValueAt(partidos.BournemouthPrueba4(),0,3);defaulttable.setValueAt(partidos.BournemouthPrueba5(),0,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj2(), 1,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j2(),1,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j2(),1,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj3(), 2,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j3(),2,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j3(),2,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj4(), 3,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j4(),3,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j4(),3,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj5(), 4,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j5(),4,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j5(),4,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj6(), 5,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j6(),5,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j6(),5,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj7(), 6,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j7(),6,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j7(),6,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj8(), 7,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j8(),7,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j8(),7,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj9(), 8,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j9(),8,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj10(),9,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j10(),9,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j10(),9,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj11(), 10,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j11(),10,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j11(),10,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj12(), 11,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j12(),11,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j12(),11,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj13(), 12,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j13(),12,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j13(),12,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj14(), 13,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j14(),13,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j14(),13,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj15(), 14,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j15(),14,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j15(),14,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj17(), 16,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j17(),16,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j17(),16,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj16(), 15,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j16(),15,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j16(),15,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj18(), 17,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j18(),17,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j18(),17,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj19(), 18,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j19(),18,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j19(),18,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj20(), 19,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j20(),19,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j20(),19,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj21(), 20,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j21(),20,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j21(),20,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj22(), 21,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j22(),21,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j22(),21,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj23(), 22,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j23(),22,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j23(),22,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj24(), 23,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j24(),23,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j24(),23,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj25(), 24,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j25(),24,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j25(),24,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.BournemouthPruebaj26(), 25,0);defaulttable.setValueAt(partidos.BournemouthPrueba2j26(),25,1);defaulttable.setValueAt(partidos.BournemouthPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.BournemouthPrueba4j26(),25,3);defaulttable.setValueAt(partidos.BournemouthPrueba5j26(), 25,4);

        bournemouthlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==burnleylist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Burnley());
        finalrefs.setText(partidos.BurnleyArbis());
        defaulttable.setValueAt(partidos.BurnleyPrueba(), 0,0);defaulttable.setValueAt(partidos.BurnleyPrueba2(),0,1);defaulttable.setValueAt(partidos.BurnleyPrueba3(),0,2);defaulttable.setValueAt(partidos.BurnleyPrueba4(),0,3);defaulttable.setValueAt(partidos.BurnleyPrueba5(),0,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj2(), 1,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j2(),1,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j2(),1,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj3(), 2,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j3(),2,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j3(),2,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj4(), 3,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j4(),3,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j4(),3,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj5(), 4,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j5(),4,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j5(),4,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj6(), 5,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j6(),5,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j6(),5,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj7(), 6,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j7(),6,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j7(),6,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj8(), 7,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j8(),7,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j8(),7,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj9(), 8,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j9(),8,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj10(),9,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j10(),9,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j10(),9,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj11(), 10,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j11(),10,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j11(),10,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj12(), 11,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j12(),11,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j12(),11,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj13(), 12,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j13(),12,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j13(),12,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj14(), 13,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j14(),13,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j14(),13,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj15(), 14,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j15(),14,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j15(),14,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj17(), 16,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j17(),16,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j17(),16,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj16(), 15,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j16(),15,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j16(),15,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj18(), 17,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j18(),17,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j18(),17,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj19(), 18,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j19(),18,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j19(),18,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj20(), 19,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j20(),19,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j20(),19,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj21(), 20,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j21(),20,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j21(),20,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj22(), 21,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j22(),21,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j22(),21,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj23(), 22,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j23(),22,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j23(),22,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj24(), 23,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j24(),23,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j24(),23,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj25(), 24,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j25(),24,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j25(),24,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.BurnleyPruebaj26(), 25,0);defaulttable.setValueAt(partidos.BurnleyPrueba2j26(),25,1);defaulttable.setValueAt(partidos.BurnleyPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.BurnleyPrueba4j26(),25,3);defaulttable.setValueAt(partidos.BurnleyPrueba5j26(), 25,4);

        burnleylist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==southamptonlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Southampton());
        finalrefs.setText(partidos.SouthamptonArbis());
        defaulttable.setValueAt(partidos.SouthamptonPrueba(), 0,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2(),0,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3(),0,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4(),0,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5(),0,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj2(), 1,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j2(),1,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j2(),1,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj3(), 2,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j3(),2,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j3(),2,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj4(), 3,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j4(),3,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j4(),3,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj5(), 4,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j5(),4,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j5(),4,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj6(), 5,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j6(),5,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j6(),5,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj7(), 6,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j7(),6,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j7(),6,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj8(), 7,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j8(),7,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j8(),7,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj9(), 8,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j9(),8,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj10(),9,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j10(),9,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j10(),9,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj11(), 10,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j11(),10,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j11(),10,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj12(), 11,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j12(),11,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j12(),11,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj13(), 12,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j13(),12,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j13(),12,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj14(), 13,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j14(),13,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j14(),13,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj15(), 14,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j15(),14,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j15(),14,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj17(), 16,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j17(),16,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j17(),16,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj16(), 15,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j16(),15,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j16(),15,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj18(), 17,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j18(),17,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j18(),17,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj19(), 18,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j19(),18,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j19(),18,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj20(), 19,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j20(),19,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j20(),19,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj21(), 20,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j21(),20,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j21(),20,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj22(), 21,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j22(),21,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j22(),21,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj23(), 22,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j23(),22,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j23(),22,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj24(), 23,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j24(),23,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j24(),23,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj25(), 24,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j25(),24,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j25(),24,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.SouthamptonPruebaj26(), 25,0);defaulttable.setValueAt(partidos.SouthamptonPrueba2j26(),25,1);defaulttable.setValueAt(partidos.SouthamptonPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.SouthamptonPrueba4j26(),25,3);defaulttable.setValueAt(partidos.SouthamptonPrueba5j26(), 25,4);

        southamptonlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==brightonlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Brighton());
        finalrefs.setText(partidos.BrightonArbis());
        defaulttable.setValueAt(partidos.BrightonPrueba(), 0,0);defaulttable.setValueAt(partidos.BrightonPrueba2(),0,1);defaulttable.setValueAt(partidos.BrightonPrueba3(),0,2);defaulttable.setValueAt(partidos.BrightonPrueba4(),0,3);defaulttable.setValueAt(partidos.BrightonPrueba5(),0,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj2(), 1,0);defaulttable.setValueAt(partidos.BrightonPrueba2j2(),1,1);defaulttable.setValueAt(partidos.BrightonPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.BrightonPrueba4j2(),1,3);defaulttable.setValueAt(partidos.BrightonPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj3(), 2,0);defaulttable.setValueAt(partidos.BrightonPrueba2j3(),2,1);defaulttable.setValueAt(partidos.BrightonPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.BrightonPrueba4j3(),2,3);defaulttable.setValueAt(partidos.BrightonPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj4(), 3,0);defaulttable.setValueAt(partidos.BrightonPrueba2j4(),3,1);defaulttable.setValueAt(partidos.BrightonPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.BrightonPrueba4j4(),3,3);defaulttable.setValueAt(partidos.BrightonPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj5(), 4,0);defaulttable.setValueAt(partidos.BrightonPrueba2j5(),4,1);defaulttable.setValueAt(partidos.BrightonPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.BrightonPrueba4j5(),4,3);defaulttable.setValueAt(partidos.BrightonPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj6(), 5,0);defaulttable.setValueAt(partidos.BrightonPrueba2j6(),5,1);defaulttable.setValueAt(partidos.BrightonPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.BrightonPrueba4j6(),5,3);defaulttable.setValueAt(partidos.BrightonPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj7(), 6,0);defaulttable.setValueAt(partidos.BrightonPrueba2j7(),6,1);defaulttable.setValueAt(partidos.BrightonPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.BrightonPrueba4j7(),6,3);defaulttable.setValueAt(partidos.BrightonPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj8(), 7,0);defaulttable.setValueAt(partidos.BrightonPrueba2j8(),7,1);defaulttable.setValueAt(partidos.BrightonPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.BrightonPrueba4j8(),7,3);defaulttable.setValueAt(partidos.BrightonPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj9(), 8,0);defaulttable.setValueAt(partidos.BrightonPrueba2j9(),8,1);defaulttable.setValueAt(partidos.BrightonPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.BrightonPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj10(),9,0);defaulttable.setValueAt(partidos.BrightonPrueba2j10(),9,1);defaulttable.setValueAt(partidos.BrightonPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.BrightonPrueba4j10(),9,3);defaulttable.setValueAt(partidos.BrightonPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj11(), 10,0);defaulttable.setValueAt(partidos.BrightonPrueba2j11(),10,1);defaulttable.setValueAt(partidos.BrightonPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.BrightonPrueba4j11(),10,3);defaulttable.setValueAt(partidos.BrightonPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj12(), 11,0);defaulttable.setValueAt(partidos.BrightonPrueba2j12(),11,1);defaulttable.setValueAt(partidos.BrightonPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.BrightonPrueba4j12(),11,3);defaulttable.setValueAt(partidos.BrightonPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj13(), 12,0);defaulttable.setValueAt(partidos.BrightonPrueba2j13(),12,1);defaulttable.setValueAt(partidos.BrightonPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.BrightonPrueba4j13(),12,3);defaulttable.setValueAt(partidos.BrightonPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj14(), 13,0);defaulttable.setValueAt(partidos.BrightonPrueba2j14(),13,1);defaulttable.setValueAt(partidos.BrightonPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.BrightonPrueba4j14(),13,3);defaulttable.setValueAt(partidos.BrightonPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj15(), 14,0);defaulttable.setValueAt(partidos.BrightonPrueba2j15(),14,1);defaulttable.setValueAt(partidos.BrightonPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.BrightonPrueba4j15(),14,3);defaulttable.setValueAt(partidos.BrightonPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj17(), 16,0);defaulttable.setValueAt(partidos.BrightonPrueba2j17(),16,1);defaulttable.setValueAt(partidos.BrightonPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.BrightonPrueba4j17(),16,3);defaulttable.setValueAt(partidos.BrightonPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj16(), 15,0);defaulttable.setValueAt(partidos.BrightonPrueba2j16(),15,1);defaulttable.setValueAt(partidos.BrightonPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.BrightonPrueba4j16(),15,3);defaulttable.setValueAt(partidos.BrightonPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj18(), 17,0);defaulttable.setValueAt(partidos.BrightonPrueba2j18(),17,1);defaulttable.setValueAt(partidos.BrightonPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.BrightonPrueba4j18(),17,3);defaulttable.setValueAt(partidos.BrightonPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj19(), 18,0);defaulttable.setValueAt(partidos.BrightonPrueba2j19(),18,1);defaulttable.setValueAt(partidos.BrightonPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.BrightonPrueba4j19(),18,3);defaulttable.setValueAt(partidos.BrightonPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj20(), 19,0);defaulttable.setValueAt(partidos.BrightonPrueba2j20(),19,1);defaulttable.setValueAt(partidos.BrightonPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.BrightonPrueba4j20(),19,3);defaulttable.setValueAt(partidos.BrightonPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj21(), 20,0);defaulttable.setValueAt(partidos.BrightonPrueba2j21(),20,1);defaulttable.setValueAt(partidos.BrightonPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.BrightonPrueba4j21(),20,3);defaulttable.setValueAt(partidos.BrightonPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj22(), 21,0);defaulttable.setValueAt(partidos.BrightonPrueba2j22(),21,1);defaulttable.setValueAt(partidos.BrightonPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.BrightonPrueba4j22(),21,3);defaulttable.setValueAt(partidos.BrightonPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj23(), 22,0);defaulttable.setValueAt(partidos.BrightonPrueba2j23(),22,1);defaulttable.setValueAt(partidos.BrightonPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.BrightonPrueba4j23(),22,3);defaulttable.setValueAt(partidos.BrightonPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj24(), 23,0);defaulttable.setValueAt(partidos.BrightonPrueba2j24(),23,1);defaulttable.setValueAt(partidos.BrightonPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.BrightonPrueba4j24(),23,3);defaulttable.setValueAt(partidos.BrightonPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj25(), 24,0);defaulttable.setValueAt(partidos.BrightonPrueba2j25(),24,1);defaulttable.setValueAt(partidos.BrightonPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.BrightonPrueba4j25(),24,3);defaulttable.setValueAt(partidos.BrightonPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.BrightonPruebaj26(), 25,0);defaulttable.setValueAt(partidos.BrightonPrueba2j26(),25,1);defaulttable.setValueAt(partidos.BrightonPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.BrightonPrueba4j26(),25,3);defaulttable.setValueAt(partidos.BrightonPrueba5j26(), 25,4);

        brightonlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==cardifflist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Cardiff());
        finalrefs.setText(partidos.CardiffArbis());
        defaulttable.setValueAt(partidos.CardiffPrueba(), 0,0);defaulttable.setValueAt(partidos.CardiffPrueba2(),0,1);defaulttable.setValueAt(partidos.CardiffPrueba3(),0,2);defaulttable.setValueAt(partidos.CardiffPrueba4(),0,3);defaulttable.setValueAt(partidos.CardiffPrueba5(),0,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj2(), 1,0);defaulttable.setValueAt(partidos.CardiffPrueba2j2(),1,1);defaulttable.setValueAt(partidos.CardiffPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.CardiffPrueba4j2(),1,3);defaulttable.setValueAt(partidos.CardiffPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj3(), 2,0);defaulttable.setValueAt(partidos.CardiffPrueba2j3(),2,1);defaulttable.setValueAt(partidos.CardiffPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.CardiffPrueba4j3(),2,3);defaulttable.setValueAt(partidos.CardiffPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj4(), 3,0);defaulttable.setValueAt(partidos.CardiffPrueba2j4(),3,1);defaulttable.setValueAt(partidos.CardiffPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.CardiffPrueba4j4(),3,3);defaulttable.setValueAt(partidos.CardiffPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj5(), 4,0);defaulttable.setValueAt(partidos.CardiffPrueba2j5(),4,1);defaulttable.setValueAt(partidos.CardiffPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.CardiffPrueba4j5(),4,3);defaulttable.setValueAt(partidos.CardiffPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj6(), 5,0);defaulttable.setValueAt(partidos.CardiffPrueba2j6(),5,1);defaulttable.setValueAt(partidos.CardiffPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.CardiffPrueba4j6(),5,3);defaulttable.setValueAt(partidos.CardiffPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj7(), 6,0);defaulttable.setValueAt(partidos.CardiffPrueba2j7(),6,1);defaulttable.setValueAt(partidos.CardiffPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.CardiffPrueba4j7(),6,3);defaulttable.setValueAt(partidos.CardiffPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj8(), 7,0);defaulttable.setValueAt(partidos.CardiffPrueba2j8(),7,1);defaulttable.setValueAt(partidos.CardiffPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.CardiffPrueba4j8(),7,3);defaulttable.setValueAt(partidos.CardiffPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj9(), 8,0);defaulttable.setValueAt(partidos.CardiffPrueba2j9(),8,1);defaulttable.setValueAt(partidos.CardiffPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.CardiffPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj10(),9,0);defaulttable.setValueAt(partidos.CardiffPrueba2j10(),9,1);defaulttable.setValueAt(partidos.CardiffPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.CardiffPrueba4j10(),9,3);defaulttable.setValueAt(partidos.CardiffPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj11(), 10,0);defaulttable.setValueAt(partidos.CardiffPrueba2j11(),10,1);defaulttable.setValueAt(partidos.CardiffPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.CardiffPrueba4j11(),10,3);defaulttable.setValueAt(partidos.CardiffPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj12(), 11,0);defaulttable.setValueAt(partidos.CardiffPrueba2j12(),11,1);defaulttable.setValueAt(partidos.CardiffPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.CardiffPrueba4j12(),11,3);defaulttable.setValueAt(partidos.CardiffPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj13(), 12,0);defaulttable.setValueAt(partidos.CardiffPrueba2j13(),12,1);defaulttable.setValueAt(partidos.CardiffPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.CardiffPrueba4j13(),12,3);defaulttable.setValueAt(partidos.CardiffPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj14(), 13,0);defaulttable.setValueAt(partidos.CardiffPrueba2j14(),13,1);defaulttable.setValueAt(partidos.CardiffPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.CardiffPrueba4j14(),13,3);defaulttable.setValueAt(partidos.CardiffPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj15(), 14,0);defaulttable.setValueAt(partidos.CardiffPrueba2j15(),14,1);defaulttable.setValueAt(partidos.CardiffPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.CardiffPrueba4j15(),14,3);defaulttable.setValueAt(partidos.CardiffPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj17(), 16,0);defaulttable.setValueAt(partidos.CardiffPrueba2j17(),16,1);defaulttable.setValueAt(partidos.CardiffPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.CardiffPrueba4j17(),16,3);defaulttable.setValueAt(partidos.CardiffPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj16(), 15,0);defaulttable.setValueAt(partidos.CardiffPrueba2j16(),15,1);defaulttable.setValueAt(partidos.CardiffPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.CardiffPrueba4j16(),15,3);defaulttable.setValueAt(partidos.CardiffPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj18(), 17,0);defaulttable.setValueAt(partidos.CardiffPrueba2j18(),17,1);defaulttable.setValueAt(partidos.CardiffPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.CardiffPrueba4j18(),17,3);defaulttable.setValueAt(partidos.CardiffPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj19(), 18,0);defaulttable.setValueAt(partidos.CardiffPrueba2j19(),18,1);defaulttable.setValueAt(partidos.CardiffPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.CardiffPrueba4j19(),18,3);defaulttable.setValueAt(partidos.CardiffPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj20(), 19,0);defaulttable.setValueAt(partidos.CardiffPrueba2j20(),19,1);defaulttable.setValueAt(partidos.CardiffPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.CardiffPrueba4j20(),19,3);defaulttable.setValueAt(partidos.CardiffPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj21(), 20,0);defaulttable.setValueAt(partidos.CardiffPrueba2j21(),20,1);defaulttable.setValueAt(partidos.CardiffPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.CardiffPrueba4j21(),20,3);defaulttable.setValueAt(partidos.CardiffPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj22(), 21,0);defaulttable.setValueAt(partidos.CardiffPrueba2j22(),21,1);defaulttable.setValueAt(partidos.CardiffPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.CardiffPrueba4j22(),21,3);defaulttable.setValueAt(partidos.CardiffPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj23(), 22,0);defaulttable.setValueAt(partidos.CardiffPrueba2j23(),22,1);defaulttable.setValueAt(partidos.CardiffPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.CardiffPrueba4j23(),22,3);defaulttable.setValueAt(partidos.CardiffPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj24(), 23,0);defaulttable.setValueAt(partidos.CardiffPrueba2j24(),23,1);defaulttable.setValueAt(partidos.CardiffPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.CardiffPrueba4j24(),23,3);defaulttable.setValueAt(partidos.CardiffPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj25(), 24,0);defaulttable.setValueAt(partidos.CardiffPrueba2j25(),24,1);defaulttable.setValueAt(partidos.CardiffPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.CardiffPrueba4j25(),24,3);defaulttable.setValueAt(partidos.CardiffPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.CardiffPruebaj26(), 25,0);defaulttable.setValueAt(partidos.CardiffPrueba2j26(),25,1);defaulttable.setValueAt(partidos.CardiffPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.CardiffPrueba4j26(),25,3);defaulttable.setValueAt(partidos.CardiffPrueba5j26(), 25,4);

        cardifflist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==fulhamlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Fulham());
        finalrefs.setText(partidos.FulhamArbis());
defaulttable.setValueAt(partidos.FulhamPrueba(), 0,0);defaulttable.setValueAt(partidos.FulhamPrueba2(),0,1);defaulttable.setValueAt(partidos.FulhamPrueba3(),0,2);defaulttable.setValueAt(partidos.FulhamPrueba4(),0,3);defaulttable.setValueAt(partidos.FulhamPrueba5(),0,4);
defaulttable.setValueAt(partidos.FulhamPruebaj2(), 1,0);defaulttable.setValueAt(partidos.FulhamPrueba2j2(),1,1);defaulttable.setValueAt(partidos.FulhamPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.FulhamPrueba4j2(),1,3);defaulttable.setValueAt(partidos.FulhamPrueba5j2(), 1,4);
defaulttable.setValueAt(partidos.FulhamPruebaj3(), 2,0);defaulttable.setValueAt(partidos.FulhamPrueba2j3(),2,1);defaulttable.setValueAt(partidos.FulhamPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.FulhamPrueba4j3(),2,3);defaulttable.setValueAt(partidos.FulhamPrueba5j3(), 2,4);
defaulttable.setValueAt(partidos.FulhamPruebaj4(), 3,0);defaulttable.setValueAt(partidos.FulhamPrueba2j4(),3,1);defaulttable.setValueAt(partidos.FulhamPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.FulhamPrueba4j4(),3,3);defaulttable.setValueAt(partidos.FulhamPrueba5j4(), 3,4);
defaulttable.setValueAt(partidos.FulhamPruebaj5(), 4,0);defaulttable.setValueAt(partidos.FulhamPrueba2j5(),4,1);defaulttable.setValueAt(partidos.FulhamPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.FulhamPrueba4j5(),4,3);defaulttable.setValueAt(partidos.FulhamPrueba5j5(), 4,4);
defaulttable.setValueAt(partidos.FulhamPruebaj6(), 5,0);defaulttable.setValueAt(partidos.FulhamPrueba2j6(),5,1);defaulttable.setValueAt(partidos.FulhamPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.FulhamPrueba4j6(),5,3);defaulttable.setValueAt(partidos.FulhamPrueba5j6(), 5,4);
defaulttable.setValueAt(partidos.FulhamPruebaj7(), 6,0);defaulttable.setValueAt(partidos.FulhamPrueba2j7(),6,1);defaulttable.setValueAt(partidos.FulhamPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.FulhamPrueba4j7(),6,3);defaulttable.setValueAt(partidos.FulhamPrueba5j7(), 6,4);
defaulttable.setValueAt(partidos.FulhamPruebaj8(), 7,0);defaulttable.setValueAt(partidos.FulhamPrueba2j8(),7,1);defaulttable.setValueAt(partidos.FulhamPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.FulhamPrueba4j8(),7,3);defaulttable.setValueAt(partidos.FulhamPrueba5j8(), 7,4);
defaulttable.setValueAt(partidos.FulhamPruebaj9(), 8,0);defaulttable.setValueAt(partidos.FulhamPrueba2j9(),8,1);defaulttable.setValueAt(partidos.FulhamPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.FulhamPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
defaulttable.setValueAt(partidos.FulhamPruebaj10(),9,0);defaulttable.setValueAt(partidos.FulhamPrueba2j10(),9,1);defaulttable.setValueAt(partidos.FulhamPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.FulhamPrueba4j10(),9,3);defaulttable.setValueAt(partidos.FulhamPrueba5j10(), 9,4);
defaulttable.setValueAt(partidos.FulhamPruebaj11(), 10,0);defaulttable.setValueAt(partidos.FulhamPrueba2j11(),10,1);defaulttable.setValueAt(partidos.FulhamPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.FulhamPrueba4j11(),10,3);defaulttable.setValueAt(partidos.FulhamPrueba5j11(), 10,4);
defaulttable.setValueAt(partidos.FulhamPruebaj12(), 11,0);defaulttable.setValueAt(partidos.FulhamPrueba2j12(),11,1);defaulttable.setValueAt(partidos.FulhamPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.FulhamPrueba4j12(),11,3);defaulttable.setValueAt(partidos.FulhamPrueba5j12(), 11,4);
defaulttable.setValueAt(partidos.FulhamPruebaj13(), 12,0);defaulttable.setValueAt(partidos.FulhamPrueba2j13(),12,1);defaulttable.setValueAt(partidos.FulhamPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.FulhamPrueba4j13(),12,3);defaulttable.setValueAt(partidos.FulhamPrueba5j13(), 12,4);
defaulttable.setValueAt(partidos.FulhamPruebaj14(), 13,0);defaulttable.setValueAt(partidos.FulhamPrueba2j14(),13,1);defaulttable.setValueAt(partidos.FulhamPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.FulhamPrueba4j14(),13,3);defaulttable.setValueAt(partidos.FulhamPrueba5j14(), 13,4);
defaulttable.setValueAt(partidos.FulhamPruebaj15(), 14,0);defaulttable.setValueAt(partidos.FulhamPrueba2j15(),14,1);defaulttable.setValueAt(partidos.FulhamPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.FulhamPrueba4j15(),14,3);defaulttable.setValueAt(partidos.FulhamPrueba5j15(), 14,4);
defaulttable.setValueAt(partidos.FulhamPruebaj17(), 16,0);defaulttable.setValueAt(partidos.FulhamPrueba2j17(),16,1);defaulttable.setValueAt(partidos.FulhamPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.FulhamPrueba4j17(),16,3);defaulttable.setValueAt(partidos.FulhamPrueba5j17(), 16,4);
defaulttable.setValueAt(partidos.FulhamPruebaj16(), 15,0);defaulttable.setValueAt(partidos.FulhamPrueba2j16(),15,1);defaulttable.setValueAt(partidos.FulhamPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.FulhamPrueba4j16(),15,3);defaulttable.setValueAt(partidos.FulhamPrueba5j16(), 15,4);
defaulttable.setValueAt(partidos.FulhamPruebaj18(), 17,0);defaulttable.setValueAt(partidos.FulhamPrueba2j18(),17,1);defaulttable.setValueAt(partidos.FulhamPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.FulhamPrueba4j18(),17,3);defaulttable.setValueAt(partidos.FulhamPrueba5j18(), 17,4);
defaulttable.setValueAt(partidos.FulhamPruebaj19(), 18,0);defaulttable.setValueAt(partidos.FulhamPrueba2j19(),18,1);defaulttable.setValueAt(partidos.FulhamPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.FulhamPrueba4j19(),18,3);defaulttable.setValueAt(partidos.FulhamPrueba5j19(), 18,4);
defaulttable.setValueAt(partidos.FulhamPruebaj20(), 19,0);defaulttable.setValueAt(partidos.FulhamPrueba2j20(),19,1);defaulttable.setValueAt(partidos.FulhamPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.FulhamPrueba4j20(),19,3);defaulttable.setValueAt(partidos.FulhamPrueba5j20(), 19,4);
defaulttable.setValueAt(partidos.FulhamPruebaj21(), 20,0);defaulttable.setValueAt(partidos.FulhamPrueba2j21(),20,1);defaulttable.setValueAt(partidos.FulhamPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.FulhamPrueba4j21(),20,3);defaulttable.setValueAt(partidos.FulhamPrueba5j21(), 20,4);
defaulttable.setValueAt(partidos.FulhamPruebaj22(), 21,0);defaulttable.setValueAt(partidos.FulhamPrueba2j22(),21,1);defaulttable.setValueAt(partidos.FulhamPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.FulhamPrueba4j22(),21,3);defaulttable.setValueAt(partidos.FulhamPrueba5j22(), 21,4);
defaulttable.setValueAt(partidos.FulhamPruebaj23(), 22,0);defaulttable.setValueAt(partidos.FulhamPrueba2j23(),22,1);defaulttable.setValueAt(partidos.FulhamPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.FulhamPrueba4j23(),22,3);defaulttable.setValueAt(partidos.FulhamPrueba5j23(), 22,4);
defaulttable.setValueAt(partidos.FulhamPruebaj24(), 23,0);defaulttable.setValueAt(partidos.FulhamPrueba2j24(),23,1);defaulttable.setValueAt(partidos.FulhamPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.FulhamPrueba4j24(),23,3);defaulttable.setValueAt(partidos.FulhamPrueba5j24(), 23,4);
defaulttable.setValueAt(partidos.FulhamPruebaj25(), 24,0);defaulttable.setValueAt(partidos.FulhamPrueba2j25(),24,1);defaulttable.setValueAt(partidos.FulhamPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.FulhamPrueba4j25(),24,3);defaulttable.setValueAt(partidos.FulhamPrueba5j25(), 24,4);
defaulttable.setValueAt(partidos.FulhamPruebaj26(), 25,0);defaulttable.setValueAt(partidos.FulhamPrueba2j26(),25,1);defaulttable.setValueAt(partidos.FulhamPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.FulhamPrueba4j26(),25,3);defaulttable.setValueAt(partidos.FulhamPrueba5j26(), 25,4);
/*defaulttable.setValueAt(partidos.FulhamPruebaj27(), 26,0);defaulttable.setValueAt(partidos.FulhamPrueba2j27(),26,1);defaulttable.setValueAt(partidos.FulhamPrueba3j27(), 26,2);defaulttable.setValueAt(partidos.FulhamPrueba4j27(),26,3);defaulttable.setValueAt(partidos.FulhamPrueba5j27(), 26,4);
defaulttable.setValueAt(partidos.FulhamPruebaj28(), 27,0);defaulttable.setValueAt(partidos.FulhamPrueba2j28(),27,1);defaulttable.setValueAt(partidos.FulhamPrueba3j28(), 27,2);defaulttable.setValueAt(partidos.FulhamPrueba4j28(),27,3);defaulttable.setValueAt(partidos.FulhamPrueba5j28(), 27,4);
defaulttable.setValueAt(partidos.FulhamPruebaj29(), 28,0);defaulttable.setValueAt(partidos.FulhamPrueba2j29(),28,1);defaulttable.setValueAt(partidos.FulhamPrueba3j29(), 28,2);defaulttable.setValueAt(partidos.FulhamPrueba4j29(),28,3);defaulttable.setValueAt(partidos.FulhamPrueba5j29(), 28,4);
defaulttable.setValueAt(partidos.FulhamPruebaj30(), 29,0);defaulttable.setValueAt(partidos.FulhamPrueba2j30(),29,1);defaulttable.setValueAt(partidos.FulhamPrueba3j30(), 29,2);defaulttable.setValueAt(partidos.FulhamPrueba4j30(),29,3);defaulttable.setValueAt(partidos.FulhamPrueba5j30(), 29,4);
defaulttable.setValueAt(partidos.FulhamPruebaj31(), 30,0);defaulttable.setValueAt(partidos.FulhamPrueba2j31(),30,1);defaulttable.setValueAt(partidos.FulhamPrueba3j31(), 30,2);defaulttable.setValueAt(partidos.FulhamPrueba4j31(),30,3);defaulttable.setValueAt(partidos.FulhamPrueba5j31(), 30,4);
defaulttable.setValueAt(partidos.FulhamPruebaj32(), 31,0);defaulttable.setValueAt(partidos.FulhamPrueba2j32(),31,1);defaulttable.setValueAt(partidos.FulhamPrueba3j32(), 31,2);defaulttable.setValueAt(partidos.FulhamPrueba4j32(),31,3);defaulttable.setValueAt(partidos.FulhamPrueba5j32(), 31,4);
defaulttable.setValueAt(partidos.FulhamPruebaj33(), 32,0);defaulttable.setValueAt(partidos.FulhamPrueba2j33(),32,1);defaulttable.setValueAt(partidos.FulhamPrueba3j33(), 32,2);defaulttable.setValueAt(partidos.FulhamPrueba4j33(),32,3);defaulttable.setValueAt(partidos.FulhamPrueba5j33(), 32,4);
defaulttable.setValueAt(partidos.FulhamPruebaj34(), 33,0);defaulttable.setValueAt(partidos.FulhamPrueba2j34(),33,1);defaulttable.setValueAt(partidos.FulhamPrueba3j34(), 33,2);defaulttable.setValueAt(partidos.FulhamPrueba4j34(),33,3);defaulttable.setValueAt(partidos.FulhamPrueba5j34(), 33,4);
defaulttable.setValueAt(partidos.FulhamPruebaj35(), 34,0);defaulttable.setValueAt(partidos.FulhamPrueba2j35(),34,1);defaulttable.setValueAt(partidos.FulhamPrueba3j35(), 34,2);defaulttable.setValueAt(partidos.FulhamPrueba4j35(),34,3);defaulttable.setValueAt(partidos.FulhamPrueba5j35(), 34,4);
defaulttable.setValueAt(partidos.FulhamPruebaj36(), 35,0);defaulttable.setValueAt(partidos.FulhamPrueba2j36(),35,1);defaulttable.setValueAt(partidos.FulhamPrueba3j36(), 35,2);defaulttable.setValueAt(partidos.FulhamPrueba4j36(),35,3);defaulttable.setValueAt(partidos.FulhamPrueba5j36(), 35,4);
defaulttable.setValueAt(partidos.FulhamPruebaj37(), 36,0);defaulttable.setValueAt(partidos.FulhamPrueba2j37(),36,1);defaulttable.setValueAt(partidos.FulhamPrueba3j37(), 36,2);defaulttable.setValueAt(partidos.FulhamPrueba4j37(),36,3);defaulttable.setValueAt(partidos.FulhamPrueba5j37(), 36,4);
defaulttable.setValueAt(partidos.FulhamPruebaj38(), 37,0);defaulttable.setValueAt(partidos.FulhamPrueba2j38(),37,1);defaulttable.setValueAt(partidos.FulhamPrueba3j38(), 37,2);defaulttable.setValueAt(partidos.FulhamPrueba4j38(),37,3);defaulttable.setValueAt(partidos.FulhamPrueba5j38(), 37,4);*/
        fulhamlist.clearSelection();
      }

        }
    }

    if(listEvent.getSource()==huddersfieldlist){
      if(listEvent.getValueIsAdjusting()){
      int sel= (((JList)listEvent.getSource()).getSelectedIndex());
      if(sel>-1){
        finalstats.setText(partidos.Huddersfield());
        finalrefs.setText(partidos.HuddersfieldArbis());
        defaulttable.setValueAt(partidos.HuddersfieldPrueba(), 0,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2(),0,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3(),0,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4(),0,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5(),0,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj2(), 1,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j2(),1,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j2(), 1,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j2(),1,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j2(), 1,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj3(), 2,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j3(),2,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j3(), 2,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j3(),2,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j3(), 2,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj4(), 3,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j4(),3,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j4(), 3,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j4(),3,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j4(), 3,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj5(), 4,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j5(),4,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j5(), 4,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j5(),4,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j5(), 4,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj6(), 5,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j6(),5,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j6(), 5,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j6(),5,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j6(), 5,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj7(), 6,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j7(),6,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j7(), 6,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j7(),6,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j7(), 6,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj8(), 7,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j8(),7,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j8(), 7,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j8(),7,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j8(), 7,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj9(), 8,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j9(),8,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j9(), 8,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j9(),8,3);defaulttable.setValueAt(partidos.CityHomePrueba5j9(), 8,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj10(),9,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j10(),9,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j10(), 9,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j10(),9,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j10(), 9,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj11(), 10,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j11(),10,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j11(), 10,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j11(),10,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j11(), 10,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj12(), 11,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j12(),11,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j12(), 11,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j12(),11,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j12(), 11,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj13(), 12,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j13(),12,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j13(), 12,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j13(),12,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j13(), 12,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj14(), 13,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j14(),13,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j14(), 13,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j14(),13,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j14(), 13,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj15(), 14,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j15(),14,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j15(), 14,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j15(),14,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j15(), 14,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj17(), 16,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j17(),16,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j17(), 16,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j17(),16,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j17(), 16,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj16(), 15,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j16(),15,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j16(), 15,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j16(),15,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j16(), 15,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj18(), 17,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j18(),17,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j18(), 17,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j18(),17,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j18(), 17,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj19(), 18,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j19(),18,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j19(), 18,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j19(),18,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j19(), 18,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj20(), 19,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j20(),19,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j20(), 19,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j20(),19,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j20(), 19,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj21(), 20,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j21(),20,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j21(), 20,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j21(),20,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j21(), 20,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj22(), 21,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j22(),21,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j22(), 21,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j22(),21,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j22(), 21,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj23(), 22,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j23(),22,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j23(), 22,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j23(),22,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j23(), 22,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj24(), 23,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j24(),23,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j24(), 23,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j24(),23,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j24(), 23,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj25(), 24,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j25(),24,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j25(), 24,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j25(),24,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j25(), 24,4);
        defaulttable.setValueAt(partidos.HuddersfieldPruebaj26(), 25,0);defaulttable.setValueAt(partidos.HuddersfieldPrueba2j26(),25,1);defaulttable.setValueAt(partidos.HuddersfieldPrueba3j26(), 25,2);defaulttable.setValueAt(partidos.HuddersfieldPrueba4j26(),25,3);defaulttable.setValueAt(partidos.HuddersfieldPrueba5j26(), 25,4);
        huddersfieldlist.clearSelection();
      }

        }
    }
  }
  public static void main(String args[]){
    new Interface("Prem");
  }

}
