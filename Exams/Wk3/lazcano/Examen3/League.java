import java.util.*;
import java.io.*;
import javax.swing.*;

public class League {

  Vector<Equipo> equipos;

  public void createLeague(){
    Boolean first=true;
    String str;
    try{
      FileReader lector= new FileReader("season-1819_csv.csv");
      BufferedReader basededatos= new BufferedReader(lector);
      while((str=basededatos.readLine()) != null){
        if(!first){
          addTeam(str);
        }else{
          first = false;
        }
      }
      basededatos.close();
    }catch(IOException ioe){
      System.out.println("Exception "+ ioe);
    }
  }

  public void addTeam(String data){
    StringTokenizer tokens= new StringTokenizer(data, ",");
    int datanum=0;
    while(tokens.hasMoreTokens()){
      String val=tokens.nextToken();
      if(datanum==2){
        if(equipos.size()==0 || !checkLeague(val)){
          equipos.add(new Equipo(val));
        }
      }
      datanum++;
    }
  }

  public Boolean checkLeague(String str){
    for(int i=0; i<equipos.size(); i++){
      if(equipos.elementAt(i).getName().equals(str)){
        return true;
      }
    }
    return false;
  }

  public void setLeagueMatches(){
    for(int i=0; i<equipos.size(); i++){
      setMatches(equipos.elementAt(i));
    }
  }

  public void setMatches(Equipo team){
    Boolean first=true;
    String str;
    try{
      FileReader lector= new FileReader("season-1819_csv.csv");
      BufferedReader basededatos= new BufferedReader(lector);
      while((str=basededatos.readLine()) != null){
        if(!first){
          team.addMatch(str);
        }else{
          first = false;
        }
      }
      basededatos.close();
    }catch(IOException ioe){
      System.out.println("Exception "+ ioe);
    }
  }

  public DefaultListModel toList(){
    DefaultListModel<Equipo> list=new DefaultListModel();
    for(int i=0; i<equipos.size(); i++){
      list.addElement(equipos.elementAt(i));
    }
    return list;
  }

  public void setLeagueStats(){
    for(int i=0; i<equipos.size(); i++){
      equipos.elementAt(i).setStats();
    }
  }
  
  public League(){
    equipos=new Vector();
    createLeague();
    setLeagueMatches();
    setLeagueStats();
  }
}
