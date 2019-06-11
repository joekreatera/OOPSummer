/*
Found one error:

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\juan>java MyNave
Exception in thread "main" java.lang.NullPointerException
        at MyNave.Mision(MyNave.java:53)
        at MyNave.main(MyNave.java:78)

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\juan>java MyNave
Mision al planeta Mercurio Conteo de dias origen de la mision 0 Dias de traslado 2 Recursos recolectados 40 Dias de minado 8
Mision al planeta Saturno Conteo de dias origen de la mision 10 Dias de traslado 7 Recursos recolectados 15 Dias de minado 3
Mision al planeta Venus Conteo de dias origen de la mision 20 Dias de traslado 3 Recursos recolectados 35 Dias de minado 7
Mision al planeta Marte Conteo de dias origen de la mision 30 Dias de traslado 5 Recursos recolectados 25 Dias de minado 5
Los recursos totales recolectados= 115 En la nave Culera

As you can see, in the first Run there was an error. After checking that out
it was clear that the RandomFunction returned, at times, a number
that could not be assigned to a position in the array. For that
"b" became null, and there was a NullPointerException
Beware that position 6 in the planets is never assigned.

A second note: this program does not get the spaceship to mine
some resources in a day. Instead, calculates the days that should
have passed to finish the resources. Sums the travel days that
is an excellent detail. Although this was not the job asked to be
done, is not a bad example.

The final main code is not as it was stated.

Compile: 20
Run: 20
Job: 15
*/

public class MyNave
{
	Universo myUniverso;
	Nave laNave;

	public MyNave()
	{
		myUniverso = new Universo();
		laNave=new Nave();
		laNave.setNombreNave("Culera");
		laNave.setNombreCapitan("Juan");
		laNave.setTiempoMinar(5);
	}

	public Universo getUniverso(){
      return myUniverso;
  	}

	public Nave getNave(){
		return laNave;
	}


	public int Minar(int recursos)
  	{
		int tiempo=0;
		int day;

		Nave c=getNave();

		tiempo=c.getTiempoMinar();

		day=recursos/tiempo;

		return day;



  	}

  	public void Mision(){
		String nombreNA="";
		int recursos=0;
		int dias=0;
		int day=0;
		int diasT=0;
		String nombre="";
		int recT=0;

		while (diasT<=30)
		{
				Planetas b=getUniverso().getRandomPlaneta();
				recursos = b.getRecursos();
				nombre = b.getNombre();
				dias=b.getDiasViaje();

				Nave c=getNave();
				nombreNA = c.getNombreNave();

				day=Minar(recursos);

				System.out.println("Mision al planeta "+nombre+" Conteo de dias origen de la mision "+diasT+" Dias de traslado "+dias+" Recursos recolectados "+recursos+" Dias de minado "+day);

				recT=recT+recursos;

				diasT=diasT+day+dias;

			}

				System.out.println("Los recursos totales recolectados= "+ recT+" En la nave "+nombreNA);


	}

	public static void main(String args[])
	{
		MyNave viaje = new MyNave();
		viaje.Mision();


	}
}
