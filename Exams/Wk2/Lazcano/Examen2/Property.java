public class Property{
  public enum TYPE{NULL,HOUSE,STORE,INDUSTRY};
  public enum LEVEL{LOW,MEDIUM,HIGH};

  protected TYPE  type;
  protected LEVEL level;
  protected float pop;
  protected float pol;

  public Property(){
    int lev=(int)(Math.random()*2.99999+1);
    this.type=TYPE.NULL;
    if(lev==1){this.level=LEVEL.LOW;}
    if(lev==2){this.level=LEVEL.MEDIUM;}
    if(lev==3){this.level=LEVEL.HIGH;}
  }

  public String levelToStr(){
    if(this.level==LEVEL.LOW){   return "1";}
    if(this.level==LEVEL.MEDIUM){return "2";}
    if(this.level==LEVEL.HIGH){ return "3";}
    return "";
  }

  public float population(){return this.pop;}
  public float pollution(){return this.pol;}

  public TYPE getType (){return this.type;}
  public LEVEL getLevel(){return this.level;}

  @Override
  public String toString(){
    String str="";
    if(this.type==TYPE.HOUSE){str+= "H";}
    if(this.type==TYPE.STORE){str+= "S";}
    if(this.type==TYPE.INDUSTRY){str+= "I";}
    if(this.type==TYPE.NULL){return "//";}
    str+=this.levelToStr();
    return str;
  }
}
