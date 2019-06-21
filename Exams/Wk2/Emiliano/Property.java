public class Property{
 int type;
 int locationx;
 int locationy;
 float pollution=0;
 float population=0;

 public float getRandom(float min,float max){
  return (float) (Math.random() * ((max - min) )) + min;

 }
 public int getType(){
   return type;
 }
 public void setType(int t){
   type=t;
 }
 public int getx(){
   return locationx;
 }
 public int getY(){
   return locationy;
 }
 public float getPollution(){
   return pollution;
 }
 public void setPollution(float p){
   pollution=p;
 }
 public float getPopulation(){
   return population;
 }
 public void setPopulation(float p){
   population=p;
 }






}
