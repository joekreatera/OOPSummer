public class Store extends Property{

  public static final float  MIN_POPULATION = 20;
  public static final float  MAX_POPULATION = 30;

  public static final int MIN_POLLUTION = 20;
  public static final int MAX_POLLUTION = 60;

  public Store(int lx, int ly, Property.PROPERTY_SIZE s , Property.PROPERTY_CLASS pc){

      super(lx,ly, 0.0f, 0.0f, s , pc);

      int typeToThird = getIntFromType();
      float popThird = (MAX_POPULATION-MIN_POPULATION)/3f;
      float polThird = (MAX_POLLUTION-MIN_POLLUTION)/3f;

      popThird = MIN_POPULATION + (float)(typeToThird*popThird*Math.random());
      polThird = MIN_POLLUTION + (float)(typeToThird*polThird*Math.random());
      setPopulation(popThird);
      setPollution(polThird);
      setPropertyClass(Property.PROPERTY_CLASS.STORE);

  }

}
