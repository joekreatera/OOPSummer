import java.util.*;
import javax.swing.table.*;

public class Equipo{
  private String nombre;
  private int goalsFor;
  private int goalsAg;
  private int wins;
  private int loss;
  private int draw;
  private Vector<String> referees;
  private Vector<Match> home;
  private Vector<Match> away;

  public String getName(){return this.nombre;}
  public int getWins(){return this.wins;}
  public int getLosses(){return this.loss;}
  public int getDraws(){return this.draw;}

  public Equipo(String name){
    nombre=name;
    goalsFor=0;
    goalsAg=0;
    referees=new Vector();
    home=new Vector();
    away=new Vector();
  }

  public void addMatch(String str){
    Match match=new Match(str);
    if(match.getHome().equals(this.nombre)){
      home.add(match);
    }
    if(match.getAway().equals(this.nombre)){
      away.add(match);
    }
  }

  public void setStats(){
    for (int i=0;i<home.size() ;i++ ) {
      goalsFor+=home.elementAt(i).getHg();
      goalsAg+=home.elementAt(i).getAg();
      if(home.elementAt(i).getResult()==Match.RESULT.HOME)wins++;
      if(home.elementAt(i).getResult()==Match.RESULT.AWAY)loss++;
      if(home.elementAt(i).getResult()==Match.RESULT.DRAW)draw++;
    }
    for (int i=0;i<away.size() ;i++ ) {
      goalsAg+=away.elementAt(i).getHg();
      goalsFor+=away.elementAt(i).getAg();
      if(away.elementAt(i).getResult()==Match.RESULT.HOME)loss++;
      if(away.elementAt(i).getResult()==Match.RESULT.AWAY)wins++;
      if(away.elementAt(i).getResult()==Match.RESULT.DRAW)draw++;
    }
    setRefs();
  }

  public void setRefs(){
    for (int i=0;i<home.size() ;i++ ) {
      if(!checkRefs(home.elementAt(i).getRef())){
        referees.add(home.elementAt(i).getRef());
      }
    }
    for (int i=0;i<away.size() ;i++ ) {
      if(!checkRefs(away.elementAt(i).getRef())){
        referees.add(away.elementAt(i).getRef());
      }
    }
  }

  public Boolean checkRefs(String ref){
    for(int i=0; i<referees.size(); i++){
      if(referees.elementAt(i).equals(ref))return true;
    }
    return false;
  }


  public DefaultTableModel clearModel(DefaultTableModel model){
    while (model.getRowCount()>1) {
      model.removeRow(1);
    }
    return model;
  }

  public DefaultTableModel newModel(DefaultTableModel model){
    model=clearModel(model);
    model.setRowCount(home.size()+away.size()+1);
    int j=0;
    for(int i=0; i<home.size();i++){
      model.setValueAt(home.elementAt(i).getHome(),(i+1),0);
      model.setValueAt(home.elementAt(i).getAway(),(i+1),1);
      model.setValueAt(home.elementAt(i).getHg(),(i+1),2);
      model.setValueAt(home.elementAt(i).getAg(),(i+1),3);
      model.setValueAt(home.elementAt(i).getRef(),(i+1),4);
      if(home.elementAt(i).getResult()==Match.RESULT.HOME)model.setValueAt("WIN",(i+1),5);
      if(home.elementAt(i).getResult()==Match.RESULT.AWAY)model.setValueAt("LOSS",(i+1),5);
      if(home.elementAt(i).getResult()==Match.RESULT.DRAW)model.setValueAt("DRAW",(i+1),5);
      j=i+2;
    }
    for(int i=0; i<away.size();i++){
      model.setValueAt(away.elementAt(i).getHome(),(i+j),0);
      model.setValueAt(away.elementAt(i).getAway(),(i+j),1);
      model.setValueAt(away.elementAt(i).getHg(),(i+j),2);
      model.setValueAt(away.elementAt(i).getAg(),(i+j),3);
      model.setValueAt(away.elementAt(i).getRef(),(i+j),4);
      if(away.elementAt(i).getResult()==Match.RESULT.HOME)model.setValueAt("LOSS",(i+j),5);
      if(away.elementAt(i).getResult()==Match.RESULT.AWAY)model.setValueAt("WIN",(i+j),5);
      if(away.elementAt(i).getResult()==Match.RESULT.DRAW)model.setValueAt("DRAW",(i+j),5);
    }
    return model;
  }

  public String stats(){
    String str="";
    str+="Goals For: "+ goalsFor + "<br/>";
    str+="Goals Against: " + goalsAg + "<br/>";
    str+="Wins: " +wins + "<br/>";
    str+="Losses: "+loss + "<br/>";
    str+="Draws: " + draw + "<br/>";
    return str;
  }

  public String refStr(){
    String str="";
    str+="Referees: <br/>";
    for (int i=0;i<referees.size() ;i++ ) {
      str+=referees.elementAt(i) + "<br/>";
    }
    return str;
  }

  @Override
  public String toString(){
    return this.nombre;
  }
}
