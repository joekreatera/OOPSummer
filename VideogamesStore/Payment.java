public class Payment{

  private String date;
  private float amount;
  private Videogame videogame;

  public Payment(Videogame vg, String d, float a){
    date = d;
    amount = a;
    videogame = vg;
  }

  public Videogame getVideogame(){
    return videogame;
  }

  public float getAmount(){
    return amount;
  }

  public String getDate(){
    return date;
  }

  @Override
  public String toString(){
      return date + " " + videogame + " " + amount;
  }

}
