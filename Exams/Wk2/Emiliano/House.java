public class House extends Property{

public House(){
super();
}
public void setRandomType(){

}
public void setHouseData(){
int t;
t=(int)getRandom(1.0f,3.9f);
this.setType(t);

if (this.getType()==1){
this.setPopulation(getRandom(2.0f,3.3f));
this.setPollution(getRandom(5.0f,6.6f));
}
if (this.getType()==2){
this.setPopulation(getRandom(3.4f,4.7f));
this.setPollution(getRandom(6.7f,8.3f));
}
if (this.getType()==3){
this.setPopulation(getRandom(4.8f,6.0f));
this.setPollution(getRandom(8.4f,10.0f));
}
}
}
