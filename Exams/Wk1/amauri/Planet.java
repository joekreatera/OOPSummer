public class Planet{

private String planetname;
private float gold;

//constructor
public Planet (String pname, float g){
setPlanetName(pname);
setGold(g);
}

//?
public String getPlanetName(){return planetname;}
public void setPlanetName(String s){ planetname=s;}


public float getGold(){return gold;}
public void setGold(float s){gold=s;}


public boolean emptyplanet(){
  if(getGold()<=0){
    return true;
  }
  else{return false;}
}



//arreglo para planetas y usar el constructor

@Override
public String toString(){
    return planetname + ": " + "oro= " + ":("+gold+") ";
}

}
