import java.io.*;
import java.util.*;

public class Match{
  public enum RESULT {DRAW,HOME,AWAY};

  private int hg;
  private int ag;
  private String home;
  private String away;
  private String referee;
  public RESULT result;

  public String getHome(){return this.home;}
  public String getAway(){return this.away;}
  public String getRef(){return this.referee;}
  public int getHg(){return this.hg;}
  public int getAg(){return this.ag;}
  public RESULT getResult(){return this.result;}

  public Match(String data){
    StringTokenizer tokens= new StringTokenizer(data, ",");
    int datanum=0;
    while(tokens.hasMoreTokens()){
      String val=tokens.nextToken();
      if(datanum==2){home=val;}
      if(datanum==3){away=val;}
      if(datanum==4){hg=Integer.parseInt(val);}
      if(datanum==5){ag=Integer.parseInt(val);}
      if(datanum==6){
        if(val.equals("H"))result=RESULT.HOME;
        if(val.equals("A"))result=RESULT.AWAY;
        if(val.equals("D"))result=RESULT.DRAW;
      }
      if(datanum==10){referee=val;}
      //System.out.println(referee);
      datanum++;
    }
  }

  @Override
  public  String toString(){
    return this.home +" "+this.away;
  }
}
