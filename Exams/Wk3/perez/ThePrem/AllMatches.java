import java.io.*;
public class AllMatches{
  Match[] matches;
  String dataFile= "season1819.csv";

  public AllMatches(String dataFile){
  this.dataFile= dataFile;
  //para tener una variable donde guardar todo el archivo
  }

  public void loadDataMatches(){
    Boolean first=true;
    try{
      FileReader reader= new FileReader(dataFile);
      BufferedReader datamatch= new BufferedReader(reader);
      int games= 0;
      while(datamatch.readLine()!=null){

        games++;
      }
      matches= new Match[games];
      datamatch.close();
      reader= new FileReader(dataFile);
      datamatch= new BufferedReader(reader);
      String str= "";
      games=0;
      while( (str = datamatch.readLine()) != null ){
        if(!first){
          matches[games] = new Match(str);
          games++;
        }
        else{first= false;}
      }
      datamatch.close();



    }catch(IOException ioe){
      System.out.println("Exception " + ioe);
    }
  }

  public String City(){
    int cont=0;
    int goalsHome=0;
    int goalsHomeRival=0;
    int goalsAwayRival=0;
    int goalsAway=0;
    int victories=0;
    int losses=0;
    int draws=0;
    String arbi= "";
    String str="";
    System.out.println("City 18-19");
    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Man City")){
      goalsAway = goalsAway+matches[i].getAwayGoals();
      goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("A")){victories++;}
      if(matches[i].getResult().equals("H")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      //System.out.println(matches[i].toTable());
      }

      if(matches[i].getHomeTeam().equals("Man City")){
      goalsHome = goalsHome+matches[i].getHomeGoals();
      goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("H")){victories++;}
      if(matches[i].getResult().equals("A")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      //System.out.println(matches[i].toTable());
      }

    }


    str +=("City 18-19 season" + "<br/>" + "Goals for City: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by City: "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
    return "<html>"+str+"<html/>";

  }

  public String CityArbis(){
    String arbi= "";
    String strr="";

    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Man City")){
      arbi += matches[i].getRefeere() + ",";
      }

      if(matches[i].getHomeTeam().equals("Man City")){
      arbi += matches[i].getRefeere() + ",";
      }

    }
    strr +=("City 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
    return "<html>"+strr+"<html/>";
  }

  public String CityHomePrueba(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5(){String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHomePruebaj2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j2(){String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHomePruebaj3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j3(){String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j4(){String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j5(){String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j6(){String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j7(){
    String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j7(){String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j8(){
    String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j8(){String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j9(){
    String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j9(){String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j10(){
    String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j10(){String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j11(){
    String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j11(){String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j12(){
    String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j12(){String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
  return str;
  }
  public String CityHomePrueba2j13(){
    String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j13(){String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j14(){
    String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j14(){String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j15(){
    String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j15(){String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j16(){
    String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j16(){String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j17(){
    String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j17(){String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j18(){
    String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j18(){String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j19(){
    String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j19(){String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
  return str;
  }
  public String CityHomePrueba2j20(){
    String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j20(){String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j21(){
    String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j21(){String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j22(){
    String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j22(){String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j23(){
    String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j23(){String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j24(){
    String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j24(){String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getResult();}}
    return str;
  }


  public String CityHomePruebaj25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str=matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j25(){
    String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j25(){String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getResult();}}
    return str;
  }
  public String CityHomePruebaj26(){
    String str="";
    for(int i=250; i<255; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str=matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHomePrueba2j26(){
    String str="";
  for(int i=250; i<255; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHomePrueba3j26(){
    String str="";
    for(int i=250; i<255; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHomePrueba4j26(){
    String str="";
    for(int i=250; i<255; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHomePrueba5j26(){String str="";
    for(int i=250; i<255; i++){if(matches[i].getAwayTeam().equals("Man City")||matches[i].getHomeTeam().equals("Man City")){str =matches[i].getResult();}}
    return str;
  }



/*---------------------------------------------------------------------------------*/

  public String Liverpool(){
    int cont=0;
    int goalsHome=0;
    int goalsHomeRival=0;
    int goalsAwayRival=0;
    int goalsAway=0;
    int victories=0;
    int losses=0;
    int draws=0;
    String arbi= "";
    String str="";
    System.out.println("Liverpool 18-19");
    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Liverpool")){
      goalsAway = goalsAway+matches[i].getAwayGoals();
      goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("A")){victories++;}
      if(matches[i].getResult().equals("H")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      //System.out.println(matches[i].toTable());
      }

      if(matches[i].getHomeTeam().equals("Liverpool")){
      goalsHome = goalsHome+matches[i].getHomeGoals();
      goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("H")){victories++;}
      if(matches[i].getResult().equals("A")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      //System.out.println(matches[i].toTable());
      }

    }
    str +=("Liverpool 18-19 season" + "<br/>" + "Goals for Liverpool: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Liverpool : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
    return "<html>"+str+"<html/>";
  }

  public String LiverpoolArbis(){
    String arbi= "";
    String strr="";

    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Liverpool")){
      arbi += matches[i].getRefeere() + ",";
      }

      if(matches[i].getHomeTeam().equals("Liverpool")){
      arbi += matches[i].getRefeere() + ",";
      }

    }
    strr +=("Liverpool 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
    return "<html>"+strr+"<html/>";
  }

  public String CityHome2Prueba(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5(){String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHome2Pruebaj2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j2(){String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHome2Pruebaj3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j3(){String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j4(){String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHome2Pruebaj5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeTeam();}}
    return str;
  }

  public String CityHome2Prueba2j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j5(){String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j6(){String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j7(){String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j8(){String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j9(){String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j10(){String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j11(){String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j12(){String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j13(){String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j14(){String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j15(){String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j16(){String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j17(){String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j18(){String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j19(){String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j20(){String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j21(){String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j22(){String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j23(){String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j24(){String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j25(){String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome2Pruebaj26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome2Prueba2j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome2Prueba3j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome2Prueba4j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome2Prueba5j26(){String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Liverpool")||matches[i].getHomeTeam().equals("Liverpool")){str +=matches[i].getResult();}}
    return str;
  }

/*---------------------------------------------------------------------------------*/
  public String Chelsea(){
    int cont=0;
    int goalsHome=0;
    int goalsHomeRival=0;
    int goalsAwayRival=0;
    int goalsAway=0;
    int victories=0;
    int losses=0;
    int draws=0;
    String arbi= "";
    String str="";
    System.out.println("Chelsea 18-19");
    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Chelsea")){
      goalsAway = goalsAway+matches[i].getAwayGoals();
      goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("A")){victories++;}
      if(matches[i].getResult().equals("H")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      }

      if(matches[i].getHomeTeam().equals("Chelsea")){
      goalsHome = goalsHome+matches[i].getHomeGoals();
      goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("H")){victories++;}
      if(matches[i].getResult().equals("A")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      }

    }
    str +=("Chelsea 18-19 season" + "<br/>" + "Goals for Chelsea: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Chelsea : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
    return "<html>"+str+"<html/>";
  }

  public String ChelseaArbis(){
    String arbi= "";
    String strr="";

    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Chelsea")){
      arbi += matches[i].getRefeere() + ",";
      }

      if(matches[i].getHomeTeam().equals("Chelsea")){
      arbi += matches[i].getRefeere() + ",";
      }

    }
    strr +=("Chelsea 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
    return "<html>"+strr+"<html/>";
  }

  public String CityHome3Prueba(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5(){String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHome3Pruebaj2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j2(){String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHome3Pruebaj3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j3(){String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j4(){String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }

  public String CityHome3Pruebaj5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeTeam();}}
    return str;
  }

  public String CityHome3Prueba2j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j5(){String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j6(){String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j7(){String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j8(){String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j9(){String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j10(){String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j11(){String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j12(){String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j13(){String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j14(){String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j15(){String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j16(){String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j17(){String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j18(){String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j19(){String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j20(){String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j21(){String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j22(){String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j23(){String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j24(){String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j25(){String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }
  public String CityHome3Pruebaj26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CityHome3Prueba2j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CityHome3Prueba3j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CityHome3Prueba4j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CityHome3Prueba5j26(){String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Chelsea")||matches[i].getHomeTeam().equals("Chelsea")){str +=matches[i].getResult();}}
    return str;
  }

  /*---------------------------------------------------------------------------------*/
    public String United(){
      int cont=0;
      int goalsHome=0;
      int goalsHomeRival=0;
      int goalsAwayRival=0;
      int goalsAway=0;
      int victories=0;
      int losses=0;
      int draws=0;
      String arbi= "";
      String str="";
      System.out.println("Man United 18-19");
      for(int i=0; i<matches.length-1; i++){
        if(matches[i].getAwayTeam().equals("Man United")){
        goalsAway = goalsAway+matches[i].getAwayGoals();
        goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
        arbi += matches[i].getRefeere() + "\n";
        if(matches[i].getResult().equals("A")){victories++;}
        if(matches[i].getResult().equals("H")){losses++;}
        if(matches[i].getResult().equals("D")){draws++;}
        }

        if(matches[i].getHomeTeam().equals("Man United")){
        goalsHome = goalsHome+matches[i].getHomeGoals();
        goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
        arbi += matches[i].getRefeere() + "\n";
        if(matches[i].getResult().equals("H")){victories++;}
        if(matches[i].getResult().equals("A")){losses++;}
        if(matches[i].getResult().equals("D")){draws++;}
        }

      }
      str +=("Alguien dijo los diablos rojos del poderosisimo tolu? xdxdxd" + "<br/>" + "Man United 18-19 season" + "<br/>" + "Goals for Man United: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Man United : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
      return "<html>"+str+"<html/>";
    }

    public String UnitedArbis(){
      String arbi= "";
      String strr="";

      for(int i=0; i<matches.length-1; i++){
        if(matches[i].getAwayTeam().equals("Man United")){
        arbi += matches[i].getRefeere() + ",";
        }

        if(matches[i].getHomeTeam().equals("Man United")){
        arbi += matches[i].getRefeere() + ",";
        }

      }
      strr +=("Man United 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
      return "<html>"+strr+"<html/>";
    }

    public String UnitedPrueba(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5(){String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }

    public String UnitedPruebaj2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j2(){String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }

    public String UnitedPruebaj3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j3(){String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j4(){String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }

    public String UnitedPruebaj5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeTeam();}}
      return str;
    }

    public String UnitedPrueba2j5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j5(){String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j6(){String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j7(){String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j8(){String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j9(){String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j10(){String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j11(){String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j12(){String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j13(){String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j14(){String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j15(){String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j16(){String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j17(){String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j18(){String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j19(){String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j20(){String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j21(){String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j22(){String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j23(){String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j24(){String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j25(){String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }
    public String UnitedPruebaj26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String UnitedPrueba2j26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String UnitedPrueba3j26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String UnitedPrueba4j26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String UnitedPrueba5j26(){String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Man United")||matches[i].getHomeTeam().equals("Man United")){str +=matches[i].getResult();}}
      return str;
    }

    /*---------------------------------------------------------------------------------*/
      public String Arsenal(){
        int cont=0;
        int goalsHome=0;
        int goalsHomeRival=0;
        int goalsAwayRival=0;
        int goalsAway=0;
        int victories=0;
        int losses=0;
        int draws=0;
        String arbi= "";
        String str="";
        System.out.println("Arsenal 18-19");
        for(int i=0; i<matches.length-1; i++){
          if(matches[i].getAwayTeam().equals("Arsenal")){
          goalsAway = goalsAway+matches[i].getAwayGoals();
          goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
          arbi += matches[i].getRefeere() + "\n";
          if(matches[i].getResult().equals("A")){victories++;}
          if(matches[i].getResult().equals("H")){losses++;}
          if(matches[i].getResult().equals("D")){draws++;}
          }

          if(matches[i].getHomeTeam().equals("Arsenal")){
          goalsHome = goalsHome+matches[i].getHomeGoals();
          goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
          arbi += matches[i].getRefeere() + "\n";
          if(matches[i].getResult().equals("H")){victories++;}
          if(matches[i].getResult().equals("A")){losses++;}
          if(matches[i].getResult().equals("D")){draws++;}
          }

        }
        str +=("Arsenal 18-19 season" + "<br/>" + "Goals for Arsenal: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Arsenal : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
        return "<html>"+str+"<html/>";
      }

public String ArsenalArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Arsenal")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Arsenal")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Arsenal 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String ArsenalPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}

public String ArsenalPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}

public String ArsenalPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}

public String ArsenalPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String ArsenalPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
public String ArsenalPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str =matches[i].getHomeTeam();}}
  return str;
}
public String ArsenalPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String ArsenalPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String ArsenalPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String ArsenalPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Arsenal")||matches[i].getHomeTeam().equals("Arsenal")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Spurs(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Tottenham 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Tottenham")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Tottenham")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Tottenham 18-19 season" + "<br/>" + "Goals for Tottenham: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Tottenham : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String TottenhamArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Tottenham")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Tottenham")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Tottenham 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}

public String TottenhamPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}

public String TottenhamPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}

public String TottenhamPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}

public String TottenhamPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String TottenhamPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}
public String TottenhamPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String TottenhamPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String TottenhamPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String TottenhamPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String TottenhamPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Tottenham")||matches[i].getHomeTeam().equals("Tottenham")){str +=matches[i].getResult();}}
  return str;
}

/*---------------------------------------------------------------------------------*/
public String Huddersfield(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Huddersfield 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Huddersfield")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Huddersfield")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Huddersfield 18-19 season" + "<br/>" + "Goals for Huddersfield: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Huddersfield : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String HuddersfieldArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Huddersfield")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Huddersfield")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Huddersfield 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String HuddersfieldPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}

public String HuddersfieldPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}

public String HuddersfieldPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}

public String HuddersfieldPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String HuddersfieldPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
public String HuddersfieldPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str =matches[i].getHomeTeam();}}
  return str;
}
public String HuddersfieldPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String HuddersfieldPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String HuddersfieldPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String HuddersfieldPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Huddersfield")||matches[i].getHomeTeam().equals("Huddersfield")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Newcastle(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Newcastle 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Newcastle")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Newcastle")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Newcastle 18-19 season" + "<br/>" + "Goals for Newcastle: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Newcastle : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String NewcastleArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Newcastle")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Newcastle")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Newcastle 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String NewcastlePrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}

public String NewcastlePruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}

public String NewcastlePruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}

public String NewcastlePruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String NewcastlePrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}
public String NewcastlePruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str =matches[i].getHomeTeam();}}
  return str;
}
public String NewcastlePrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String NewcastlePrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String NewcastlePrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String NewcastlePrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Newcastle")||matches[i].getHomeTeam().equals("Newcastle")){str +=matches[i].getResult();}}
  return str;
}

/*---------------------------------------------------------------------------------*/
public String CrystalPalace(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("CrystalPalace 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Crystal Palace")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Crystal Palace")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Crystal Palace 18-19 season" + "<br/>" + "Goals for Crystal Palace: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Crystal Palace : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String CrystalPalaceArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Crystal Palace")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Crystal Palace")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("CrystalPalace 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String  PalacePrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}

public String  PalacePruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}

public String  PalacePruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}

public String  PalacePruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String  PalacePrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
public String  PalacePruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  PalacePrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  PalacePrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  PalacePrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  PalacePrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Crystal Palace")||matches[i].getHomeTeam().equals("Crystal Palace")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Southampton(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Southampton 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Southampton")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Southampton")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Southampton 18-19 season" + "<br/>" + "Goals for Southampton: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Southampton : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String SouthamptonArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Southampton")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Southampton")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Southampton 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String SouthamptonPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}

public String SouthamptonPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}

public String SouthamptonPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}

public String SouthamptonPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String SouthamptonPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
public String SouthamptonPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String SouthamptonPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String SouthamptonPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String SouthamptonPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String SouthamptonPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Southampton")||matches[i].getHomeTeam().equals("Southampton")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String WestHam(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("WestHam 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("West Ham")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("West Ham")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("WestHam 18-19 season" + "<br/>" + "Goals for WestHam: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by WestHam: "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String WestHamArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("West Ham")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("West Ham")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("WestHam 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String  HamPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}

public String  HamPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}

public String  HamPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}

public String  HamPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String  HamPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
public String  HamPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str =matches[i].getHomeTeam();}}
  return str;
}
public String  HamPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String  HamPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String  HamPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String  HamPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("West Ham")||matches[i].getHomeTeam().equals("West Ham")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Brighton(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Brighton 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Brighton")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Brighton")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Brighton 18-19 season" + "<br/>" + "Goals for Brighton: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Brighton : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String BrightonArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Brighton")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Brighton")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Brighton 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String BrightonPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}

public String BrightonPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}

public String BrightonPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}

public String BrightonPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String BrightonPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
public String BrightonPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BrightonPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BrightonPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BrightonPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BrightonPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Brighton")||matches[i].getHomeTeam().equals("Brighton")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Watford(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Watford 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Watford")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Watford")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Watford 18-19 season" + "<br/>" + "Goals for Watford: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Watford : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String WatfordArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Watford")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Watford")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Watford 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String WatfordPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}

public String WatfordPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}

public String WatfordPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}

public String WatfordPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String WatfordPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
public String WatfordPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WatfordPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WatfordPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WatfordPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WatfordPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Watford")||matches[i].getHomeTeam().equals("Watford")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Everton(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Everton 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Everton")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Everton")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Everton 18-19 season" + "<br/>" + "Goals for Everton: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Everton : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String EvertonArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Everton")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Everton")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Everton 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String EvertonPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}

public String EvertonPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}

public String EvertonPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}

public String EvertonPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String EvertonPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
public String EvertonPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str =matches[i].getHomeTeam();}}
  return str;
}
public String EvertonPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String EvertonPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String EvertonPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String EvertonPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Everton")||matches[i].getHomeTeam().equals("Everton")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Leicester(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Leicester 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Leicester")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Leicester")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Leicester 18-19 season" + "<br/>" + "Goals for Leicester: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Leicester : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String LeicesterArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Leicester")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Leicester")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Leicester 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String LeicesterPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}

public String LeicesterPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}

public String LeicesterPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}

public String LeicesterPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String LeicesterPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
public String LeicesterPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str =matches[i].getHomeTeam();}}
  return str;
}
public String LeicesterPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String LeicesterPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String LeicesterPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String LeicesterPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Leicester")||matches[i].getHomeTeam().equals("Leicester")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Wolves(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Wolves 18-19");
for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Wolves")){
goalsAway = goalsAway+matches[i].getAwayGoals();
goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("A")){victories++;}
if(matches[i].getResult().equals("H")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

if(matches[i].getHomeTeam().equals("Wolves")){
goalsHome = goalsHome+matches[i].getHomeGoals();
goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
arbi += matches[i].getRefeere() + "\n";
if(matches[i].getResult().equals("H")){victories++;}
if(matches[i].getResult().equals("A")){losses++;}
if(matches[i].getResult().equals("D")){draws++;}
}

}
str +=("Wolves 18-19 season" + "<br/>" + "Goals for Wolves: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Wolves : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String WolvesArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
if(matches[i].getAwayTeam().equals("Wolves")){
arbi += matches[i].getRefeere() + ",";
}

if(matches[i].getHomeTeam().equals("Wolves")){
arbi += matches[i].getRefeere() + ",";
}

}
strr +=("Wolves 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String WolvesPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}

public String WolvesPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}

public String WolvesPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}

public String WolvesPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String WolvesPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
public String WolvesPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str =matches[i].getHomeTeam();}}
  return str;
}
public String WolvesPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String WolvesPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String WolvesPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String WolvesPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Wolves")||matches[i].getHomeTeam().equals("Wolves")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Bournemouth(){
int cont=0;
int goalsHome=0;
int goalsHomeRival=0;
int goalsAwayRival=0;
int goalsAway=0;
int victories=0;
int losses=0;
int draws=0;
String arbi= "";
String str="";
System.out.println("Bournemouth 18-19");
for(int i=0; i<matches.length-1; i++){
  if(matches[i].getAwayTeam().equals("Bournemouth")){
  goalsAway = goalsAway+matches[i].getAwayGoals();
  goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
  arbi += matches[i].getRefeere() + "\n";
  if(matches[i].getResult().equals("A")){victories++;}
  if(matches[i].getResult().equals("H")){losses++;}
  if(matches[i].getResult().equals("D")){draws++;}
  }

  if(matches[i].getHomeTeam().equals("Bournemouth")){
  goalsHome = goalsHome+matches[i].getHomeGoals();
  goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
  arbi += matches[i].getRefeere() + "\n";
  if(matches[i].getResult().equals("H")){victories++;}
  if(matches[i].getResult().equals("A")){losses++;}
  if(matches[i].getResult().equals("D")){draws++;}
  }

}
str +=("Bournemouth 18-19 season" + "<br/>" + "Goals for Bournemouth: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Bournemouth : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
return "<html>"+str+"<html/>";
}

public String BournemouthArbis(){
String arbi= "";
String strr="";

for(int i=0; i<matches.length-1; i++){
  if(matches[i].getAwayTeam().equals("Bournemouth")){
  arbi += matches[i].getRefeere() + ",";
  }

  if(matches[i].getHomeTeam().equals("Bournemouth")){
  arbi += matches[i].getRefeere() + ",";
  }

}
strr +=("Bournemouth 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
return "<html>"+strr+"<html/>";
}
public String BournemouthPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}

public String BournemouthPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}

public String BournemouthPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}

public String BournemouthPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String BournemouthPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
public String BournemouthPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BournemouthPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BournemouthPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BournemouthPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BournemouthPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Bournemouth")||matches[i].getHomeTeam().equals("Bournemouth")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
public String Burnley(){
  int cont=0;
  int goalsHome=0;
  int goalsHomeRival=0;
  int goalsAwayRival=0;
  int goalsAway=0;
  int victories=0;
  int losses=0;
  int draws=0;
  String arbi= "";
  String str="";
  System.out.println("Burnley 18-19");
  for(int i=0; i<matches.length-1; i++){
    if(matches[i].getAwayTeam().equals("Burnley")){
    goalsAway = goalsAway+matches[i].getAwayGoals();
    goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
    arbi += matches[i].getRefeere() + "\n";
    if(matches[i].getResult().equals("A")){victories++;}
    if(matches[i].getResult().equals("H")){losses++;}
    if(matches[i].getResult().equals("D")){draws++;}
    }

    if(matches[i].getHomeTeam().equals("Burnley")){
    goalsHome = goalsHome+matches[i].getHomeGoals();
    goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
    arbi += matches[i].getRefeere() + "\n";
    if(matches[i].getResult().equals("H")){victories++;}
    if(matches[i].getResult().equals("A")){losses++;}
    if(matches[i].getResult().equals("D")){draws++;}
    }

  }
  str +=("Burnley 18-19 season" + "<br/>" + "Goals for Burnley: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Burnley : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
  return "<html>"+str+"<html/>";
}

public String BurnleyArbis(){
  String arbi= "";
  String strr="";

  for(int i=0; i<matches.length-1; i++){
    if(matches[i].getAwayTeam().equals("Burnley")){
    arbi += matches[i].getRefeere() + ",";
    }

    if(matches[i].getHomeTeam().equals("Burnley")){
    arbi += matches[i].getRefeere() + ",";
    }

  }
  strr +=("Burnley 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
  return "<html>"+strr+"<html/>";
}
public String BurnleyPrueba(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4(){
  String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5(){String str="";
  for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}

public String BurnleyPruebaj2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j2(){
  String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j2(){String str="";
  for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}

public String BurnleyPruebaj3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j3(){
  String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j3(){String str="";
  for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j4(){
  String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j4(){String str="";
  for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}

public String BurnleyPruebaj5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeTeam();}}
  return str;
}

public String BurnleyPrueba2j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j5(){
  String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j5(){String str="";
  for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j6(){
  String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j6(){String str="";
  for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j7(){
  String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j7(){String str="";
  for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j8(){
  String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j8(){String str="";
  for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j9(){
  String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j9(){String str="";
  for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j10(){
  String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j10(){String str="";
  for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j11(){
  String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j11(){String str="";
  for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j12(){
  String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j12(){String str="";
  for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j13(){
  String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j13(){String str="";
  for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j14(){
  String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j14(){String str="";
  for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j15(){
  String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j15(){String str="";
  for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j16(){
  String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j16(){String str="";
  for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j17(){
  String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j17(){String str="";
  for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j18(){
  String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j18(){String str="";
  for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j19(){
  String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j19(){String str="";
  for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j20(){
  String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j20(){String str="";
  for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j21(){
  String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j21(){String str="";
  for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j22(){
  String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j22(){String str="";
  for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j23(){
  String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j23(){String str="";
  for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j24(){
  String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j24(){String str="";
  for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j25(){
  String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j25(){String str="";
  for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
public String BurnleyPruebaj26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str =matches[i].getHomeTeam();}}
  return str;
}
public String BurnleyPrueba2j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayTeam();}}
  return str;
}
public String BurnleyPrueba3j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getHomeGoals();}}
  return str;
}
public String BurnleyPrueba4j26(){
  String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getAwayGoals();}}
  return str;
}
public String BurnleyPrueba5j26(){String str="";
  for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Burnley")||matches[i].getHomeTeam().equals("Burnley")){str +=matches[i].getResult();}}
  return str;
}
/*---------------------------------------------------------------------------------*/
  public String Cardiff(){
    int cont=0;
    int goalsHome=0;
    int goalsHomeRival=0;
    int goalsAwayRival=0;
    int goalsAway=0;
    int victories=0;
    int losses=0;
    int draws=0;
    String arbi= "";
    String str="";
    System.out.println("Cardiff 18-19");
    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Cardiff")){
      goalsAway = goalsAway+matches[i].getAwayGoals();
      goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("A")){victories++;}
      if(matches[i].getResult().equals("H")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      }

      if(matches[i].getHomeTeam().equals("Cardiff")){
      goalsHome = goalsHome+matches[i].getHomeGoals();
      goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
      arbi += matches[i].getRefeere() + "\n";
      if(matches[i].getResult().equals("H")){victories++;}
      if(matches[i].getResult().equals("A")){losses++;}
      if(matches[i].getResult().equals("D")){draws++;}
      }

    }
    str +=("Cardiff 18-19 season" + "<br/>" + "Goals for Cardiff: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Cardiff : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
    return "<html>"+str+"<html/>";
  }

  public String CardiffArbis(){
    String arbi= "";
    String strr="";

    for(int i=0; i<matches.length-1; i++){
      if(matches[i].getAwayTeam().equals("Cardiff")){
      arbi += matches[i].getRefeere() + ",";
      }

      if(matches[i].getHomeTeam().equals("Cardiff")){
      arbi += matches[i].getRefeere() + ",";
      }

    }
    strr +=("Cardiff 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
    return "<html>"+strr+"<html/>";
  }
  public String CardiffPrueba(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4(){
    String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5(){String str="";
    for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }

  public String CardiffPruebaj2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j2(){
    String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j2(){String str="";
    for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }

  public String CardiffPruebaj3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j3(){
    String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j3(){String str="";
    for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j4(){
    String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j4(){String str="";
    for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }

  public String CardiffPruebaj5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeTeam();}}
    return str;
  }

  public String CardiffPrueba2j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j5(){
    String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j5(){String str="";
    for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j6(){
    String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j6(){String str="";
    for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j7(){
    String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j7(){String str="";
    for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j8(){
    String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j8(){String str="";
    for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j9(){
    String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j9(){String str="";
    for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j10(){
    String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j10(){String str="";
    for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j11(){
    String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j11(){String str="";
    for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j12(){
    String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j12(){String str="";
    for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j13(){
    String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j13(){String str="";
    for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j14(){
    String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j14(){String str="";
    for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j15(){
    String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j15(){String str="";
    for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j16(){
    String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j16(){String str="";
    for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j17(){
    String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j17(){String str="";
    for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j18(){
    String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j18(){String str="";
    for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j19(){
    String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j19(){String str="";
    for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j20(){
    String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j20(){String str="";
    for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j21(){
    String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j21(){String str="";
    for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j22(){
    String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j22(){String str="";
    for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j23(){
    String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j23(){String str="";
    for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j24(){
    String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j24(){String str="";
    for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j25(){
    String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j25(){String str="";
    for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  public String CardiffPruebaj26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str =matches[i].getHomeTeam();}}
    return str;
  }
  public String CardiffPrueba2j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayTeam();}}
    return str;
  }
  public String CardiffPrueba3j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getHomeGoals();}}
    return str;
  }
  public String CardiffPrueba4j26(){
    String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getAwayGoals();}}
    return str;
  }
  public String CardiffPrueba5j26(){String str="";
    for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Cardiff")||matches[i].getHomeTeam().equals("Cardiff")){str +=matches[i].getResult();}}
    return str;
  }
  /*---------------------------------------------------------------------------------*/
    public String Fulham(){
      int cont=0;
      int goalsHome=0;
      int goalsHomeRival=0;
      int goalsAwayRival=0;
      int goalsAway=0;
      int victories=0;
      int losses=0;
      int draws=0;
      String arbi= "";
      String str="";
      System.out.println("Fulham 18-19");
      for(int i=0; i<matches.length-1; i++){
        if(matches[i].getAwayTeam().equals("Fulham")){
        goalsAway = goalsAway+matches[i].getAwayGoals();
        goalsAwayRival= goalsAwayRival+matches[i].getHomeGoals();
        arbi += matches[i].getRefeere() + "\n";
        if(matches[i].getResult().equals("A")){victories++;}
        if(matches[i].getResult().equals("H")){losses++;}
        if(matches[i].getResult().equals("D")){draws++;}
        }

        if(matches[i].getHomeTeam().equals("Fulham")){
        goalsHome = goalsHome+matches[i].getHomeGoals();
        goalsHomeRival= goalsHomeRival+matches[i].getAwayGoals();
        arbi += matches[i].getRefeere() + "\n";
        if(matches[i].getResult().equals("H")){victories++;}
        if(matches[i].getResult().equals("A")){losses++;}
        if(matches[i].getResult().equals("D")){draws++;}
        }
      }

      str +=("Fulham 18-19 season" + "<br/>" + "Goals for Fulham: " + "" + (goalsAway + goalsHome) + "<br/>" + "Goals conceded by Fulham : "  +  (goalsAwayRival+goalsHomeRival) +  "<br/>" + "Victories: " + victories + "<br/>" + "Losses: " + losses + "<br/>" + "Draws: " +draws );
      return "<html>"+str+"<html/>";

    }

    public String FulhamArbis(){
      String arbi= "";
      String strr="";

      for(int i=0; i<matches.length-1; i++){
        if(matches[i].getAwayTeam().equals("Fulham")){
        arbi += matches[i].getRefeere() + ",";
        }

        if(matches[i].getHomeTeam().equals("Fulham")){
        arbi += matches[i].getRefeere() + ",";
        }

      }
      strr +=("Fulham 18-19 season arbis" + "<br/>" + arbi + "<br/>" );
      return "<html>"+strr+"<html/>";
    }
    public String FulhamPrueba(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4(){
      String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5(){String str="";
      for(int i=0; i<10; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }

    public String FulhamPruebaj2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j2(){
      String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j2(){String str="";
      for(int i=10; i<20; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }

    public String FulhamPruebaj3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j3(){
      String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j3(){String str="";
      for(int i=20; i<30; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j4(){
      String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j4(){String str="";
      for(int i=30; i<40; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }

    public String FulhamPruebaj5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeTeam();}}
      return str;
    }

    public String FulhamPrueba2j5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j5(){
      String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j5(){String str="";
      for(int i=40; i<50; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j6(){
      String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j6(){String str="";
      for(int i=50; i<60; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j7(){
      String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j7(){String str="";
      for(int i=60; i<70; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j8(){
      String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j8(){String str="";
      for(int i=70; i<80; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j9(){
      String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j9(){String str="";
      for(int i=80; i<90; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j10(){
      String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j10(){String str="";
      for(int i=90; i<100; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j11(){
      String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j11(){String str="";
      for(int i=100; i<110; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j12(){
      String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j12(){String str="";
      for(int i=110; i<120; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j13(){
      String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j13(){String str="";
      for(int i=120; i<130; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j14(){
      String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j14(){String str="";
      for(int i=130; i<140; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j15(){
      String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j15(){String str="";
      for(int i=140; i<150; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j16(){
      String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j16(){String str="";
      for(int i=150; i<160; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j17(){
      String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j17(){String str="";
      for(int i=160; i<170; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j18(){
      String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j18(){String str="";
      for(int i=170; i<180; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j19(){
      String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j19(){String str="";
      for(int i=180; i<190; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j20(){
      String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j20(){String str="";
      for(int i=190; i<200; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j21(){
      String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j21(){String str="";
      for(int i=200; i<210; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j22(){
      String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j22(){String str="";
      for(int i=210; i<220; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j23(){
      String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j23(){String str="";
      for(int i=220; i<230; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j24(){
      String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j24(){String str="";
      for(int i=230; i<240; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j25(){
      String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j25(){String str="";
      for(int i=240; i<250; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j26(){
      String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j26(){String str="";
      for(int i=250; i<260; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj27(){
      String str="";
      for(int i=260; i<270; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j27(){
      String str="";
      for(int i=260; i<270; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j27(){
      String str="";
      for(int i=260; i<270; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j27(){
      String str="";
      for(int i=260; i<270; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j27(){String str="";
      for(int i=260; i<270; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj28(){
      String str="";
      for(int i=270; i<280; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j28(){
      String str="";
      for(int i=270; i<280; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j28(){
      String str="";
      for(int i=270; i<280; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j28(){
      String str="";
      for(int i=270; i<280; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j28(){String str="";
      for(int i=270; i<280; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj29(){
      String str="";
      for(int i=280; i<290; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j29(){
      String str="";
      for(int i=280; i<290; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j29(){
      String str="";
      for(int i=280; i<290; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j29(){
      String str="";
      for(int i=280; i<290; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j29(){String str="";
      for(int i=280; i<290; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj30(){
      String str="";
      for(int i=290; i<300; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j30(){
      String str="";
      for(int i=290; i<300; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j30(){
      String str="";
      for(int i=290; i<300; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j30(){
      String str="";
      for(int i=290; i<300; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j30(){String str="";
      for(int i=290; i<300; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj31(){
      String str="";
      for(int i=300; i<310; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j31(){
      String str="";
      for(int i=300; i<310; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j31(){
      String str="";
      for(int i=300; i<310; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j31(){
      String str="";
      for(int i=300; i<310; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j31(){String str="";
      for(int i=300; i<310; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj32(){
      String str="";
      for(int i=310; i<320; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j32(){
      String str="";
      for(int i=310; i<320; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j32(){
      String str="";
      for(int i=310; i<320; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j32(){
      String str="";
      for(int i=310; i<320; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j32(){String str="";
      for(int i=310; i<320; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj33(){
      String str="";
      for(int i=320; i<330; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j33(){
      String str="";
      for(int i=320; i<330; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j33(){
      String str="";
      for(int i=320; i<330; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j33(){
      String str="";
      for(int i=320; i<330; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j33(){String str="";
      for(int i=320; i<330; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj34(){
      String str="";
      for(int i=330; i<340; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j34(){
      String str="";
      for(int i=330; i<340; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j34(){
      String str="";
      for(int i=330; i<340; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j34(){
      String str="";
      for(int i=330; i<340; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j34(){String str="";
      for(int i=330; i<340; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj35(){
      String str="";
      for(int i=340; i<350; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j35(){
      String str="";
      for(int i=340; i<350; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j35(){
      String str="";
      for(int i=340; i<350; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j35(){
      String str="";
      for(int i=340; i<350; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j35(){String str="";
      for(int i=340; i<350; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj36(){
      String str="";
      for(int i=350; i<360; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j36(){
      String str="";
      for(int i=350; i<360; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j36(){
      String str="";
      for(int i=350; i<360; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j36(){
      String str="";
      for(int i=350; i<360; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j36(){String str="";
      for(int i=350; i<360; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj37(){
      String str="";
      for(int i=360; i<370; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j37(){
      String str="";
      for(int i=360; i<370; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j37(){
      String str="";
      for(int i=360; i<370; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j37(){
      String str="";
      for(int i=360; i<370; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j37(){String str="";
      for(int i=360; i<370; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
    public String FulhamPruebaj38(){
      String str="";
      for(int i=370; i<380; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str =matches[i].getHomeTeam();}}
      return str;
    }
    public String FulhamPrueba2j38(){
      String str="";
      for(int i=370; i<380; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayTeam();}}
      return str;
    }
    public String FulhamPrueba3j38(){
      String str="";
      for(int i=370; i<380; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getHomeGoals();}}
      return str;
    }
    public String FulhamPrueba4j38(){
      String str="";
      for(int i=370; i<380; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getAwayGoals();}}
      return str;
    }
    public String FulhamPrueba5j38(){String str="";
      for(int i=370; i<380; i++){if(matches[i].getAwayTeam().equals("Fulham")||matches[i].getHomeTeam().equals("Fulham")){str +=matches[i].getResult();}}
      return str;
    }
  /*---------------------------------------------------------------------------------*/



}
