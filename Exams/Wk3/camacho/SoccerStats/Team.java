public class Team{
  private String name;
  private int wins;
  private int losses;
  private int draws;
  private int games;
  private int goals;

  public Team(String n){
    setName(n);
    setWins(0);
    setLosses(0);
    setDraws(0);
    setGames(0);
    setGoals(0);
  }

  public void setName(String p){ name = p; }
  public void setWins(int p){ wins = p; }
  public void setLosses(int p){ losses = p; }
  public void setDraws(int p){ draws = p; }
  public void setGames(int p){ games = p; }
  public void setGoals(int p){ goals = p; }

  public String getName(){ return name; }
  public int getWins(){ return wins; }
  public int getLosses(){ return losses; }
  public int getDraws(){ return draws; }
  public int getGames(){ return games; }
  public int getGoals(){ return goals; }

@Override
  public String toString(){
    return name;
  }


}
