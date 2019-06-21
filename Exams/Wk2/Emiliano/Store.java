public class Store extends Property{

public Store(){
super();
}

public void setStoreData(){
int t;
t=(int)getRandom(1.0f,3.9f);
this.setType(t);

if (this.getType()==1){
this.setPopulation(getRandom(20.0f,23.3f));
this.setPollution(getRandom(20.0f,33.3f));
}
if (this.getType()==2){
this.setPopulation(getRandom(23.4f,26.7f));
this.setPollution(getRandom(33.4f,46.7f));
}
if (this.getType()==3){
this.setPopulation(getRandom(26.8f,30.0f));
this.setPollution(getRandom(46.8f,60.0f));
}
}
}
