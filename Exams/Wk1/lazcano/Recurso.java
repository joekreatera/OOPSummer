public class Recurso{
  private int type;
  private int cantidad;

  public static final int ORO=0;
  public static final int COBRE=1;
  public static final int ENERGIA=2;

  public int getType(){return this.type;}
  public int getCant(){return this.cantidad;}

  public void setType(int n){this.type=n;}
  public void setCant(int n){this.cantidad=n;}

  public Recurso(int t){
    this.type=t;
    switch (t) {
      case Recurso.ORO:     this.cantidad=(int)(Math.random()*20) +10; break;
      case Recurso.COBRE:   this.cantidad=(int)(Math.random()*40) +20; break;
      case Recurso.ENERGIA: this.cantidad=(int)(Math.random()*10) +10; break;
    }
  }

  public void sumCant(int sum){
    this.cantidad += sum;
  }

  public void minusCant(int sum){
    this.cantidad -= sum;
  }
}
