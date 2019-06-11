public class Universo
{
	Planetas[] basePlaneta;
	
	public Universo()
	{
		basePlaneta = new Planetas[10];
		basePlaneta[0]= new Planetas("Mercurio",40,2 );
		basePlaneta[1]= new Planetas("Venus",35,3 );
		basePlaneta[2]= new Planetas("Tierra",30,4 );
		basePlaneta[3]= new Planetas("Marte",25,5 );
		basePlaneta[4]= new Planetas("Jupiter",20,6 );
		basePlaneta[5]= new Planetas("Saturno",15,7 );
		basePlaneta[7]= new Planetas("Urano",10,8 );
		basePlaneta[8]= new Planetas("Neptuno", 5,9 );
		basePlaneta[9]= new Planetas("Pluton", 45,1 );
		
	}
	public Planetas getRandomPlaneta(){

    int r = (int)(Math.random()*9);
    return basePlaneta[r];

  }
  @Override
  public String toString(){
    String universoStr = "";
    for( int i =0 ; i < basePlaneta.length ; i++){
      universoStr += "\n" + basePlaneta[i];
    }
    return "Impresion de catalogo: " + universoStr ;
  }
}