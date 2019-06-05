class Human{
  String name;
  float height;
  float weight;
  int gender;
  boolean isLiving;
  public static final int MALE = 0;
  public static final int FEMALE = 1;
// constructor
  public Human(String name, int sex){
      this.name = name;
      gender = sex;
  }

  public void grow(float goodFoodFGrams){
    height += goodFoodFGrams*0.3;
    weight += goodFoodFGrams*0.2;
  }

  public boolean makeLove(Human significantOther){

  }
  /* challenge!!!!
  public void fight(Human contender){}
  public void heal(){}
  public void sleep(){}
  */
  public void eat(float grams){
    weight += grams;
  }

  public static void main(String args[]){
    Human joe = new Human("Charlie" , Human.MALE);
    joe.eat(1000);
    joe.grow(500);
    System.out.println("Weight " + joe.weight);
    System.out.println("Height " + joe.height);
  }
}
