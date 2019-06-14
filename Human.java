class Human{
  String name;
  float height;
  float weight;
  int gender;
  boolean isLiving;
  int damage = 0;
  public final int MAX_DAMAGE = 100;
  public static final int MALE = 0;
  public static final int FEMALE = 1;
// constructor
  public Human(String name, int sex){
      this.name = name;
      gender = sex;
      isLiving  = true;
  }


  public void grow(float goodFoodFGrams){
    height += goodFoodFGrams*0.3;
    weight += goodFoodFGrams*0.2;
  }

  public boolean makeLove(Human significantOther){
    if( this.gender != significantOther.gender ){
      return true;
    }
    return false;
  }
  /* challenge!!!!
  public void fight(Human contender){}
  public void heal(){}
  public void sleep(){}
  */

  public void fight(Human contender){
    if( !this.isLiving ) return;

    if( gender != contender.gender ){
      return; // nothing for nobody
    }
    float force = weight*0.4f + height*0.6f;
    System.out.println(weight + " // " + height  + " f  " + force);

    float force2 = contender.weight*0.4f + contender.height*0.6f;
    if(force > force2 ){
      contender.damage += force;
      if( contender.damage > MAX_DAMAGE) contender.isLiving = false;
    }else{
      this.damage += force2;
      if( this.damage > MAX_DAMAGE) this.isLiving = false;
    }

  }

  public void heal(){
    if( !this.isLiving ) return;
    damage = 0;
  }

  public void sleep(){
    if( !this.isLiving ) return;
    damage -= (damage/2);
    damage = damage<0?0:damage;
  }

  public void eat(float grams){
    weight += grams;
  }

  public static void main(String args[]){
    Human joe = new Human("Charlie" , Human.MALE);
    Human char1 = new Human("Pepillo" , Human.MALE);

    Human clau = new Human("Claudia" , Human.FEMALE);
    joe.eat(1000);
    joe.grow(500);
    char1.eat(2000);
    char1.grow(700);
    System.out.println("Weight " + joe.weight);
    System.out.println("Height " + joe.height);
    boolean danyBorn = joe.makeLove(clau);
    System.out.println("Dany " + danyBorn);
    char1.fight(joe);
    System.out.println("Char1 " + char1.damage);
    System.out.println("Joe " + joe.damage);
    joe.heal();
    // this should not change as joe is dead
      System.out.println("Joe " + joe.damage);
  }
}
