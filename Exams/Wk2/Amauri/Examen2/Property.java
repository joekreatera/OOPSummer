import java.util.Random.*;
public class Property{

  public enum PROPERTY_SIZE{NONE,SMALL, MEDIUM, BIG};
  public enum PROPERTY_TYPE{NONE,HOUSE, STORE, INDUSTRY};

  PROPERTY_SIZE size;
  PROPERTY_TYPE type;
  float population;
  float pollution;

  public PROPERTY_SIZE getSizee(Property p){
     int r= (int)(Math.random()*3.99f);
     if(r==1 || r<1){
       p.setSize(PROPERTY_SIZE.SMALL);
     }
     if(r==2){
       p.setSize(PROPERTY_SIZE.MEDIUM);
     }
     if(r==3){
       p.setSize(PROPERTY_SIZE.BIG);
     }
     return getSize();
   }
/*----------------------------------------------------*/
   public float getThePopulation(Property p){
     float random=0;
     if(p.getType()==Property.PROPERTY_TYPE.HOUSE){
       if(p.getSize()==Property.PROPERTY_SIZE.SMALL){
         float min=2f;
         float max=3.5f;
         random = (float) (min + Math.random() * (max - min));
         p.setPopulation(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.MEDIUM){
         float min=3.6f;
         float max=4.5f;
         random = (float) (min + Math.random() * (max - min));
         p.setPopulation(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.BIG){
         float min=4.6f;
         float max=6f;
         random = (float) (min + Math.random() * (max - min));
         p.setPopulation(random);
         return random;
       }

     }

     if(p.getType()==Property.PROPERTY_TYPE.STORE){
       if(p.getSize()==Property.PROPERTY_SIZE.SMALL){
         float min=20f;
         float max=23.5f;
         random = (float) (min + Math.random() * (max - min));
         p.setPopulation(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.MEDIUM){
         float min=23.6f;
         float max=26.5f;
         random = (float) (min + Math.random() * (max - min));
         p.setPopulation(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.BIG){
         float min=26.6f;
         float max=30f;
         random = (float) (min + Math.random() * (max - min));
         p.setPopulation(random);
         return random;
       }
     }


       if(p.getType()==Property.PROPERTY_TYPE.INDUSTRY){
         if(p.getSize()==Property.PROPERTY_SIZE.SMALL){
           float min=40f;
           float max=53.5f;
           random = (float) (min + Math.random() * (max - min));
           p.setPopulation(random);
           return random;
         }
         if(p.getSize()==Property.PROPERTY_SIZE.MEDIUM){
           float min=53.6f;
           float max=66.5f;
           random = (float) (min + Math.random() * (max - min));
           p.setPopulation(random);
           return random;
         }
         if(p.getSize()==Property.PROPERTY_SIZE.BIG){
           float min=66.6f;
           float max=80f;
           random = (float) (min + Math.random() * (max - min));
           p.setPopulation(random);
           return random;
         }
       }

       return getPopulation();
   }
   /*----------------------------------------------------*/
   public float getThePollution(Property p){
     float random=0;
     if(p.getType()==Property.PROPERTY_TYPE.HOUSE){
       if(p.getSize()==Property.PROPERTY_SIZE.SMALL){
         float min=5f;
         float max=6.6f;
         random = (float) (min + Math.random() * (max - min));
         p.setPollution(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.MEDIUM){
         float min=6.7f;
         float max=8.2f;
         random = (float) (min + Math.random() * (max - min));
         p.setPollution(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.BIG){
         float min=8.3f;
         float max=10f;
         random = (float) (min + Math.random() * (max - min));
         p.setPollution(random);
         return random;
       }
     }

     if(p.getType()==Property.PROPERTY_TYPE.STORE){
       if(p.getSize()==Property.PROPERTY_SIZE.SMALL){
         float min=20f;
         float max=33.5f;
         random = (float) (min + Math.random() * (max - min));
         p.setPollution(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.MEDIUM){
         float min=33.6f;
         float max=46.5f;
         random = (float) (min + Math.random() * (max - min));
         p.setPollution(random);
         return random;
       }
       if(p.getSize()==Property.PROPERTY_SIZE.BIG){
         float min=46.6f;
         float max=60f;
         random = (float) (min + Math.random() * (max - min));
         p.setPollution(random);
         return random;
       }
     }


       if(p.getType()==Property.PROPERTY_TYPE.INDUSTRY){
         if(p.getSize()==Property.PROPERTY_SIZE.SMALL){
           float min=80f;
           float max=103.5f;
           random = (float) (min + Math.random() * (max - min));
           p.setPollution(random);
           return random;
         }
         if(p.getSize()==Property.PROPERTY_SIZE.MEDIUM){
           float min=103.6f;
           float max=126.5f;
           random = (float) (min + Math.random() * (max - min));
           p.setPollution(random);
           return random;
         }
         if(p.getSize()==Property.PROPERTY_SIZE.BIG){
           float min=126.6f;
           float max=150f;
           random = (float) (min + Math.random() * (max - min));
           p.setPollution(random);
           return random;
         }
       }

       return getPollution();
   }
/*----------------------------------------------------*/


  public PROPERTY_SIZE getSize(){return size;}
  public void setSize(PROPERTY_SIZE s){size=s;}

  public PROPERTY_TYPE getType(){return type;}
  public void setType(PROPERTY_TYPE s){type=s;}

  public float getPopulation(){return population;}
  public void setPopulation(float s){population= s;}

  public float getPollution(){return pollution;}
  public void setPollution(float s){pollution= s;}



}
