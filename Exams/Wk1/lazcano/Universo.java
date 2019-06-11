public class Universo{
  private Planeta arrPplanetas[];
  private int pos;

  public Planeta getPlan(int plan){return arrPplanetas[plan];}
  public int getPos(){return this.pos;}

  public void setPos(int i){this.pos=i;}

  public void plusOne(){this.pos++;}

  public Universo(){
    arrPplanetas= new Planeta[20];
    pos=0;

    arrPplanetas[0] =new Planeta ("Albanel");
    arrPplanetas[1] =new Planeta ("Tori I");
    arrPplanetas[2] =new Planeta ("Delta Rekonda V");
    arrPplanetas[3] =new Planeta ("Monument");
    arrPplanetas[4] = new Planeta ("Christi IX");
    arrPplanetas[5] =new Planeta ("Hephaestus");
    arrPplanetas[6] =new Planeta ("Cassandra");
    arrPplanetas[7] =new Planeta ("Deianira III");
    arrPplanetas[8] =new Planeta ("Pi Eidera I");
    arrPplanetas[9] =new Planeta ("Rognar");
    arrPplanetas[10]=new Planeta("Tethra IV");
    arrPplanetas[11]=new Planeta("Vega Delphi III");
    arrPplanetas[12]=new Planeta("Tyche III");
    arrPplanetas[13]=new Planeta("Beaup");
    arrPplanetas[14]=new Planeta("Proxima");
    arrPplanetas[15]=new Planeta("Marduk");
    arrPplanetas[16]=new Planeta("Aaratan");
    arrPplanetas[17]=new Planeta("Khufu");
    arrPplanetas[18]=new Planeta("Bellataine");
    arrPplanetas[19]=new Planeta("Zeconis VIII");
  }
}
