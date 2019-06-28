import java.util.*;
import javax.swing.*;
import java.lang.Math.*;
import java.io.*;
public class Match{

  String HomeTeam;
  String AwayTeam;
  int HomeGoals;
  int AwayGoals;
  String Result;
  String Refeere;

  public Match(String data){
    StringTokenizer tokens = new StringTokenizer(data,",");
    int dataNum = 0;
    while(tokens.hasMoreTokens()){
        String val = tokens.nextToken();
        if( dataNum == 2) HomeTeam=val;
        if( dataNum == 3) AwayTeam=val;
        if( dataNum == 4) HomeGoals= Integer.parseInt(val);
        if( dataNum == 5) AwayGoals= Integer.parseInt(val);
        if( dataNum == 6) Result = val;
        if( dataNum == 10)Refeere= val;
        dataNum++;
    }
  }


  public String getHomeTeam(){return HomeTeam;}
  public void setHomeTeam(String s){s= HomeTeam;}

  public String getAwayTeam(){return AwayTeam;}
  public void setAwayTeam(String s){s= AwayTeam;}

  public int getHomeGoals(){return HomeGoals;}
  public void setHomeGoals(int s){s= HomeGoals;}

  public int getAwayGoals(){return AwayGoals;}
  public void setAwayGoals(int s){s= AwayGoals;}

  public String getResult(){return Result;}
  public void setResult(String s){s= Result;}

  public String getRefeere(){return Refeere;}
  public void setRefeere(String s){s= Refeere;}


  @Override
  public String toString(){

      return HomeTeam + " " +  "vs " + AwayTeam + " " + " HG: " + HomeGoals + " " + "AG: " + AwayGoals + " " + Result + " " +  "Wins " + "Ref by: " + Refeere;
  }

  public String toTable(){

      return HomeTeam + " " +  AwayTeam + " " +  HomeGoals + " " +   AwayGoals + " " + Result;
  }



}
