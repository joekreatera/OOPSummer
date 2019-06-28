import java.io.*;
import java.util.*;

public class Season{

  private Match[] matches;
  private Team[] teams;
  private ArrayList<String> teamList = new ArrayList<>();

  public void loadMatches(String filename){
    String line = "";
    int matchAmount = 0;
    int i = 0;
    try{
      BufferedReader reader = new BufferedReader(new FileReader(filename));
      while((line = reader.readLine()) != null){
        matchAmount ++;
      }
      reader.close();
      matches = new Match[matchAmount];
      reader = new BufferedReader(new FileReader(filename));
      line = reader.readLine();
      while((line = reader.readLine()) != null){
        matches[i] = new Match(line);
        i++;
      }
    }
    catch(IOException ioe){
      System.out.println("Error: "+ioe);
    }
  }

  public void loadTeams(){
    int teamNum = 0;
    for(int i = 0; i < 380; i++){
      if(!(teamList.contains(matches[i].getHome()))){
        teamList.add(matches[i].getHome());
        teamNum++;
      }
    }
    teams = new Team[teamNum];
    for(int j = 0; j < teamNum; j++){
      teams[j] = new Team(teamList.get(j));
    }
    //int l;
    for(int k = 0; k < matches.length-1; k++){
      for(int l = 0; l < teams.length; l++){

        if(  teams[l].getName().equals(matches[k].getHome())  ){
          teams[l].setGames(teams[l].getGames()+1);
          teams[l].setGoals(teams[l].getGoals()+matches[k].getHomeGoals());
          if(  teams[l].getName().equals(matches[k].getWinner())  ){
            teams[l].setWins(teams[l].getWins()+1);
          }
          if(  !(teams[l].getName().equals(matches[k].getWinner())) && matches[k].getWinner().equals("DRAW") ){
            teams[l].setDraws(teams[l].getDraws()+1);
          }
          if(  !(teams[l].getName().equals(matches[k].getWinner())) && !(matches[k].getWinner().equals("DRAW")) ){
            teams[l].setLosses(teams[l].getLosses()+1);
          }

        }

        if(  teams[l].getName().equals(matches[k].getAway())  ){
          teams[l].setGames(teams[l].getGames()+1);
          teams[l].setGoals(teams[l].getGoals()+matches[k].getAwayGoals());
          if(  teams[l].getName().equals(matches[k].getWinner())  ){
            teams[l].setWins(teams[l].getWins()+1);
          }
          if(  !(teams[l].getName().equals(matches[k].getWinner())) && matches[k].getWinner().equals("DRAW") ){
            teams[l].setDraws(teams[l].getDraws()+1);
          }
          if(  !(teams[l].getName().equals(matches[k].getWinner())) && !(matches[k].getWinner().equals("DRAW")) ){
            teams[l].setLosses(teams[l].getLosses()+1);
          }

        }

      }
    }
  }

  public Match[] getMatches(){
    return matches;
  }

  public Team[] getTeams(){
    return teams;
  }

}
