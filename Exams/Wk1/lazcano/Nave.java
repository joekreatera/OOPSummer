public class Nave{
  private Recurso oro;
  private Recurso cobre;
  private Recurso energia;

  public static final int VELORO=10;
  public static final int VELCOBRE=15;
  public static final int VELENER=7;

  public Recurso getOro(){return this.oro;}
  public Recurso getCobre(){return this.cobre;}
  public Recurso getEner(){return this.energia;}

  public Nave(){
    this.oro=new Recurso    (Recurso.ORO);
    this.cobre=new Recurso  (Recurso.COBRE);
    this.energia=new Recurso(Recurso.ENERGIA);

    this.oro.setCant(0);
    this.cobre.setCant(0);
    this.energia.setCant(0);
  }

  public void minar(Planeta p){
    System.out.println();
    if(p.getOro().getCant()<=Nave.VELORO){
      this.oro.sumCant(p.getOro().getCant());
      System.out.println("Se minaron "+ p.getOro().getCant() + " trozos de oro en " + p.getNom());
      p.getOro().setCant(0);
    }else{
      this.oro.sumCant(Nave.VELORO);
      p.getOro().minusCant(Nave.VELORO);
      System.out.println("Se minaron "+ Nave.VELORO + " trozos de oro en " + p.getNom());
    }
    if(p.getCobre().getCant()<=Nave.VELCOBRE){
      this.cobre.sumCant(p.getCobre().getCant());
      System.out.println("Se minaron "+ p.getCobre().getCant() + " trozos de cobre en " + p.getNom());
      p.getCobre().setCant(0);
    }else{
      this.cobre.sumCant(Nave.VELCOBRE);
      p.getCobre().minusCant(Nave.VELCOBRE);
      System.out.println("Se minaron "+ Nave.VELCOBRE + " trozos de cobre en " + p.getNom());
    }
    if(p.getEner().getCant()<=Nave.VELENER){
      this.energia.sumCant(p.getEner().getCant());
      System.out.println("Se extrajeron "+ p.getEner().getCant() + " watts de energia en " + p.getNom());
      p.getEner().setCant(0);
    }else{
      this.energia.sumCant(Nave.VELENER);
      p.getEner().minusCant(Nave.VELENER);
      System.out.println("Se extrajeron "+ Nave.VELENER + " watts de energia en " + p.getNom());
    }
    if(p.getOro().getCant()==0 && p.getCobre().getCant()==0 && p.getEner().getCant()==0){
      p.setAgo(true);
    }
    System.out.println();
    System.out.println(p);
  }

  @Override
  public String toString(){
    return "\n Recursos Totales:" + "\n Oro: " +this.oro.getCant() +  " trozos " + "\n Cobre: " + this.cobre.getCant() + " trozos " + "\n Energia: " + this.energia.getCant() +" watts"; 
  }
}
