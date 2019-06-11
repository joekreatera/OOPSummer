import javax.swing.*;
import java.util.*;

public class Planeta { 
	
	private int recursostotales=1000;
  	private int recursosquitados=100;
  	private Universo uni = new Universo();
  	private Nave nave = new Nave();
	
	public Planeta() { 
		nave = new Nave();
	    uni = new Universo();
		}
		
	public void isFull() {
		return recursostotales;
	}

	public void isEmpty() {
		return recursostotales=0;
	}
	
	public int getRecursosTotales() { return recursostotales;}
  	public int getRecursosQuitados() { return recursosquitados;}
}