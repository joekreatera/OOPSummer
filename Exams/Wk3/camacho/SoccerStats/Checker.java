import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.io.*;

/*
Compile: 10
Run: 10
Job: 5

Although all was done great, part of the problem
was to display a TABLE that had the 1 on Win, 1 on Tie, or 1 on draw
and had the goals in favour and goals against.


*/

public class Checker extends JFrame implements ActionListener, ListSelectionListener{
  Season mySeason = new Season();
  JList<Team> listTeams;
  JList<Match> listMatches;
  Team[] teams;
  Match[] teamMatches;

  Team selTeam;

  JTextField tfName = new JTextField();
  JTextField tfGames = new JTextField();
  JTextField tfWins = new JTextField();
  JTextField tfLosses = new JTextField();
  JTextField tfDraws = new JTextField();
  JTextField tfGoals = new JTextField();

  JTextArea taResults = new JTextArea();

  public Checker(String title){
    super(title);

    mySeason.loadMatches("SoccerData.csv");
    mySeason.loadTeams();

    JPanel teamListPanel = new JPanel();
    teamListPanel.setLayout(new GridLayout(2,1));
    JPanel matchesPanel = new JPanel();
    matchesPanel.setLayout(new GridLayout(2,1));
    JPanel teamInfoPanel = new JPanel();
    teamInfoPanel.setLayout(new GridLayout(6,2));
    JPanel matchResultsPanel = new JPanel();
    matchResultsPanel.setLayout(new GridLayout(2,1));
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new GridLayout(2,2));

    JLabel lbName = new JLabel("Team name:");
    JLabel lbGames = new JLabel("Games played this season:");
    JLabel lbWins = new JLabel("Season wins:");
    JLabel lbLosses = new JLabel("Season losses:");
    JLabel lbDraws = new JLabel("Season draws:");
    JLabel lbGoals = new JLabel("Total season goals:");

    JLabel lbSelectTeam = new JLabel("Select a team");
    JLabel lbSelectMatch = new JLabel("Select a Match");
    JLabel lbResult = new JLabel("Match Results");

    listTeams = new JList(mySeason.getTeams());
    listTeams.addListSelectionListener(this);
    JScrollPane scrollTeams = new JScrollPane(listTeams);

    listMatches = new JList(mySeason.getMatches());
    listMatches.addListSelectionListener(this);
    JScrollPane scrollMatches = new JScrollPane(listMatches);

    mainPanel.add(teamListPanel);
    mainPanel.add(matchesPanel);
    mainPanel.add(teamInfoPanel);
    mainPanel.add(matchResultsPanel);

    teamListPanel.add(lbSelectTeam);
    teamListPanel.add(scrollTeams);

    matchesPanel.add(lbSelectMatch);
    matchesPanel.add(scrollMatches);

    matchResultsPanel.add(lbResult);
    matchResultsPanel.add(taResults);

    teamInfoPanel.add(lbName); teamInfoPanel.add(tfName);
    teamInfoPanel.add(lbGames); teamInfoPanel.add(tfGames);
    teamInfoPanel.add(lbWins); teamInfoPanel.add(tfWins);
    teamInfoPanel.add(lbLosses); teamInfoPanel.add(tfLosses);
    teamInfoPanel.add(lbDraws); teamInfoPanel.add(tfDraws);
    teamInfoPanel.add(lbGoals); teamInfoPanel.add(tfGoals);


    getContentPane().add(mainPanel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(600,700);
    setVisible(true);


  }


  public void valueChanged(ListSelectionEvent listEvent){
    if(listEvent.getSource() == listTeams && !(listEvent.getValueIsAdjusting())){
      int selection = listTeams.getSelectedIndex();
      if(selection > -1){
        selTeam = (listTeams.getModel()).getElementAt(selection);
        tfName.setText(selTeam.getName()); tfGames.setText(""+selTeam.getGames());
        tfWins.setText(""+selTeam.getWins()); tfLosses.setText(""+selTeam.getLosses());
        tfDraws.setText(""+selTeam.getDraws()); tfGoals.setText(""+selTeam.getGoals());
      }
      generateMatches(selTeam);
      listMatches.setListData(teamMatches);
    }

    if( listEvent.getSource() == listMatches){
      if( !listEvent.getValueIsAdjusting() ){
        int selection = listMatches.getSelectedIndex() ;
        if( selection > -1){
          Match thisMatch = listMatches.getModel().getElementAt(selection);
          if( selTeam != null){
            String results = "    Match played on "+thisMatch.getDate()+"\n\nHome Team: "+thisMatch.getHome()+"    Goals: "+thisMatch.getHomeGoals()+"\nAway Team: "+thisMatch.getAway()+"    Goals: "+thisMatch.getAwayGoals()+"\n\nFinal result: "+thisMatch.getHomeGoals()+":"+thisMatch.getAwayGoals()+"\n";
            if(thisMatch.getHomeGoals() > thisMatch.getAwayGoals()){ results += thisMatch.getHome()+" is the victor!\n\n"; }
            if(thisMatch.getHomeGoals() < thisMatch.getAwayGoals()){ results += thisMatch.getAway()+" is the victor!\n\n"; }
            if(thisMatch.getHomeGoals() == thisMatch.getAwayGoals()){ results += "Match ended in a draw!\n\n"; }
            results += "Match supervised by the referee "+thisMatch.getReferee();
            taResults.setText(results);
          }
        }
      }
    }
  }

  public void generateMatches(Team t){
    int n = 0;
    int m = 0;
    int x = 0;
    int teamMatchesTotal = 0;
    while((mySeason.getMatches())[m] != null){
      teamMatchesTotal++;
      m++;
    }
    teamMatches = new Match[teamMatchesTotal];
    while((mySeason.getMatches())[n] != null){
      if( t.getName().equals( (mySeason.getMatches())[n].getHome() ) || t.getName().equals( (mySeason.getMatches())[n].getAway() ) ){
        teamMatches[x] = (mySeason.getMatches())[n];
        x++;
      }
      n++;
    }
  }

  public void actionPerformed(ActionEvent evt){

  }


  public static void main(String args[]){
    Checker seasonChecker = new Checker("Champions League Seasonal Stats Checker");
  }

}
