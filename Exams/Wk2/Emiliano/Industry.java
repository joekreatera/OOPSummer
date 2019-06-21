public class Industry extends Property{

public Industry(){
super();
}

public void setIndustryData(){
int t;
t=(int)getRandom(1.0f,3.9f);
this.setType(t);

if (this.getType()==1){
this.setPopulation(getRandom(40.0f,53.3f));
this.setPollution(getRandom(80.0f,103.3f));
}
if (this.getType()==2){
this.setPopulation(getRandom(53.4f,66.7f));
this.setPollution(getRandom(103.4f,126.7f));
}
if (this.getType()==3){
this.setPopulation(getRandom(66.8f,80.0f));
this.setPollution(getRandom(126.8f,150.0f));
}
}
}
