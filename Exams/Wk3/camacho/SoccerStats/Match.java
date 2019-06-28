import java.util.*;

public class Match{

  private String home;
  private String away;
  private int homeGoals;
  private int awayGoals;
  private String referee;
  private String date;
  private String winner;

  public Match(String data){
    int i = 0;
    StringTokenizer token = new StringTokenizer(data, ",");
    token.nextToken();
    date = token.nextToken();
    home = token.nextToken();
    away = token.nextToken();
    homeGoals = Integer.parseInt(token.nextToken());
    awayGoals = Integer.parseInt(token.nextToken());
    token.nextToken();
    token.nextToken();
    token.nextToken();
    token.nextToken();
    referee = token.nextToken();
    if(homeGoals > awayGoals){ winner = home; }
    if(homeGoals < awayGoals){ winner = away; }
    if(homeGoals == awayGoals){ winner = "DRAW"; }

  }

  public void setHome(String h){ home = h; }
  public void setAway(String a){ away = a; }
  public void setHomeGoals(int hg){ homeGoals = hg; }
  public void setAwayGoals(int ag){ awayGoals = ag; }
  public void setReferee(String r){ referee = r; }
  public void setDate(String d){ date = d; }
  public void setWinner(String w){ winner = w; }

  public String getHome(){ return home; }
  public String getAway(){ return away; }
  public int getHomeGoals(){ return homeGoals; }
  public int getAwayGoals(){ return awayGoals; }
  public String getReferee(){ return referee; }
  public String getDate(){ return date; }
  public String getWinner(){ return winner; }

@Override
  public String toString(){
    return ""+home+" vs. "+away+" ("+date+")";
  }


}
