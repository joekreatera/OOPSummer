import javax.swing.*;
import java.util.*;

public class Universo { 
	
	private Nave nave = new Nave();
  	private Planeta planeta = new Planeta();
  	 private ArrayList<Integer> planetas = new ArrayList<Integer>();
	
	public Universo() { 
		nave = new Nave();
	    planeta = new Planeta();
	}
	
	 public void getPlaneta(int plan) {
	 	if(nave.viaja()) {
	 		planetas.add(plan);
	 	}
     
  	}

 	 public void viaja() {
   		 nave.getMigrar();
  	}
  	
  	 @Override
 	 public String toString() {
  	 String planetaStr = "";
  		for( int i=0; i < planetas.length ; i++) {
    		planetaStr += "\n" + planetas[i];

  		}
  	return "Planetas conquistados: " + planetaStr ;

	}
}