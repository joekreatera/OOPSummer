class Planetas
{
	private String nombre;
	private int recursos;
	private int diasViaje;
	
	public Planetas(String nom, int rec, int div)
	{
		setNombre(nom);
		setRecursos(rec);
		setDiasViaje(div);
		
	}
	
	public String getNombre(){ return nombre ;}
  	public void setNombre(String s){ nombre = s;}
  	
  	public int getRecursos(){ return recursos;}
  	public void setRecursos(int s){ recursos = s;}
  	
  	public int getDiasViaje(){ return diasViaje;}
  	public void setDiasViaje(int s){ diasViaje = s;}
	
}