public class ValueTable{
  public static final float hpopmin=2;
  public static final float hpopmax=6;
  public static final float hpolmin=5;
  public static final float hpolmax=10;
  public static final float difpoph=(hpopmax-hpopmin)/3;
  public static final float difpolh=(hpolmax-hpolmin)/3;

  public static final float spopmin=20;
  public static final float spopmax=30;
  public static final float spolmin=20;
  public static final float spolmax=60;
  public static final float difpops=(spopmax-spopmin)/3;
  public static final float difpols=(spolmax-spolmin)/3;

  public static final float ipopmin=40;
  public static final float ipopmax=80;
  public static final float ipolmin=80;
  public static final float ipolmax=150;
  public static final float difpopi=(ipopmax-ipopmin)/3;
  public static final float difpoli=(ipolmax-ipolmin)/3;

  static float getpop(Property p){
      if(p.getType()==Property.TYPE.HOUSE){
        if(p.getLevel()==Property.LEVEL.LOW)return (float)Math.random()*difpoph+hpopmin;
        if(p.getLevel()==Property.LEVEL.MEDIUM)return (float)Math.random()*difpoph+difpoph+hpopmin;
        if(p.getLevel()==Property.LEVEL.HIGH)return (float)Math.random()*difpoph+difpoph*2+hpopmin;
      }
      if(p.getType()==Property.TYPE.STORE){
        if(p.getLevel()==Property.LEVEL.LOW)return (float)Math.random()*difpops+spopmin;
        if(p.getLevel()==Property.LEVEL.MEDIUM)return (float)Math.random()*difpops+difpops+spopmin;
        if(p.getLevel()==Property.LEVEL.HIGH)return (float)Math.random()*difpops+difpops*2+spopmin;
      }
      if(p.getType()==Property.TYPE.INDUSTRY){
        if(p.getLevel()==Property.LEVEL.LOW)return (float)Math.random()*difpopi+ipopmin;
        if(p.getLevel()==Property.LEVEL.MEDIUM)return (float)Math.random()*difpopi+difpopi+ipopmin;
        if(p.getLevel()==Property.LEVEL.HIGH)return (float)Math.random()*difpopi+difpopi*2+ipopmin;
      }
      return 0;
  }

  static float getpol(Property p){
    if(p.getType()==Property.TYPE.HOUSE){
      if(p.getLevel()==Property.LEVEL.LOW)return (float)Math.random()*difpolh+hpolmin;
      if(p.getLevel()==Property.LEVEL.MEDIUM)return (float)Math.random()*difpolh+difpolh+hpolmin;
      if(p.getLevel()==Property.LEVEL.HIGH)return (float)Math.random()*difpolh+difpolh*2+hpolmin;
    }
    if(p.getType()==Property.TYPE.STORE){
      if(p.getLevel()==Property.LEVEL.LOW)return (float)Math.random()*difpols+spolmin;
      if(p.getLevel()==Property.LEVEL.MEDIUM)return (float)Math.random()*difpols+difpols+spolmin;
      if(p.getLevel()==Property.LEVEL.HIGH)return (float)Math.random()*difpols+difpols*2+spolmin;
    }
    if(p.getType()==Property.TYPE.INDUSTRY){
      if(p.getLevel()==Property.LEVEL.LOW)return (float)Math.random()*difpoli+ipolmin;
      if(p.getLevel()==Property.LEVEL.MEDIUM)return (float)Math.random()*difpoli+difpoli+ipolmin;
      if(p.getLevel()==Property.LEVEL.HIGH)return (float)Math.random()*difpoli+difpoli*2+ipolmin;
    }
    return 0;
  }
}
