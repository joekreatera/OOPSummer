public class Planeta{
  private Recurso oro;
  private Recurso cobre;
  private Recurso energia;
  private String nombre;
  private boolean agotado;

  public Recurso getOro(){return this.oro;}
  public Recurso getCobre(){return this.cobre;}
  public Recurso getEner(){return this.energia;}
  public boolean getAgo(){return this.agotado;}
  public String getNom(){return this.nombre;}

  public void setAgo(boolean bool){this.agotado=bool;}
  public void setName(String nom){this.nombre=nom;}

  public Planeta(String nombre){
    this.nombre=nombre;
    this.agotado=false;
    this.oro=new Recurso    (Recurso.ORO);
    this.cobre=new Recurso  (Recurso.COBRE);
    this.energia=new Recurso(Recurso.ENERGIA);
  }

  @Override
  public String toString(){
    return "\n" + "Nombre: " + this.nombre + "\n Oro:" + this.oro.getCant()
    + "\n Cobre:" + this.cobre.getCant() + "\n Energia:" + this.energia.getCant();
  }
}
