/*
could not compile

C:\Users\L01132753\Documents\Classes\2019\verano\OOP\repo\OOPSummer\Examenes\Wk1\carmen>javac *.java
Nave.java:16: error: incompatible types: unexpected return value
        return universo;
               ^
Nave.java:20: error: cannot find symbol
                for(int i=0; recursostotales>recursosquitados;i++) {
                             ^
  symbol:   variable recursostotales
  location: class Nave
Nave.java:20: error: cannot find symbol
                for(int i=0; recursostotales>recursosquitados;i++) {
                                             ^
  symbol:   variable recursosquitados
  location: class Nave
Nave.java:21: error: cannot find symbol
                        int sobrante = recursostotales - recursosquitados;
                                       ^
  symbol:   variable recursostotales
  location: class Nave
Nave.java:21: error: cannot find symbol
                        int sobrante = recursostotales - recursosquitados;
                                                         ^
  symbol:   variable recursosquitados
  location: class Nave
Nave.java:24: error: incompatible types: unexpected return value
                        return sobrante;
                               ^
Nave.java:28: error: incompatible types: void cannot be converted to boolean
                if(planeta.isFull()) {
                                 ^
Nave.java:29: error: cannot find symbol
          nave.ritmo();
          ^
  symbol:   variable nave
  location: class Nave
Nave.java:31: error: cannot find symbol
        nave.getMigrar();
        ^
  symbol:   variable nave
  location: class Nave
Nave.java:35: error: cannot find symbol
                for(int i=0;i<planetas.length;i++) {
                              ^
  symbol:   variable planetas
  location: class Nave
Nave.java:36: error: cannot find symbol
                System.out.println(planetas.get(i));
                                   ^
  symbol:   variable planetas
  location: class Nave
Nave.java:42: error: cannot find symbol
            NaveEspacial nave = new NaveEspacial();
            ^
  symbol:   class NaveEspacial
  location: class Nave
Nave.java:42: error: cannot find symbol
            NaveEspacial nave = new NaveEspacial();
                                    ^
  symbol:   class NaveEspacial
  location: class Nave
Nave.java:45: error: non-static variable dia cannot be referenced from a static context
            while(dia<30) {
                  ^
Nave.java:46: error: non-static variable planeta cannot be referenced from a static context
            nave.viaja(planeta);
                       ^
Nave.java:49: error: non-static variable planeta cannot be referenced from a static context
              if(planeta.isEmpty()) {
                 ^
Nave.java:49: error: incompatible types: void cannot be converted to boolean
              if(planeta.isEmpty()) {
                                ^
Nave.java:50: error: non-static variable planeta cannot be referenced from a static context
                planeta = universo.getMigrar();
                ^
Nave.java:50: error: cannot find symbol
                planeta = universo.getMigrar();
                          ^
  symbol:   variable universo
  location: class Nave
Nave.java:52: error: non-static variable dia cannot be referenced from a static context
                dia++;
                ^
Universo.java:16: error: incompatible types: void cannot be converted to boolean
                if(nave.viaja()) {
                             ^
Universo.java:29: error: cannot find symbol
                for( int i=0; i < planetas.length ; i++) {
                                          ^
  symbol:   variable length
  location: variable planetas of type ArrayList<Integer>
Universo.java:30: error: array required, but ArrayList<Integer> found
                planetaStr += "\n" + planetas[i];
                                             ^
Planeta.java:17: error: incompatible types: unexpected return value
                return recursostotales;
                       ^
Planeta.java:21: error: incompatible types: unexpected return value
                return recursostotales=0;
                                      ^
25 errors


Concept was good, with good program flow control.

Compile: 10
Run: 0
Job: 15

*/

import javax.swing.*;
import java.util.*;

public class Nave {

	private int dia = 0;
	private Universo uni = new Universo();
  	private Planeta planeta = new Planeta();

 	public Nave() {
	    uni = new Universo();
	    planeta = new Planeta();
 	}

  	public void getUniverso() {
    	return universo;
  	}

  	public void ritmo() {
  		for(int i=0; recursostotales>recursosquitados;i++) {
  			int sobrante = recursostotales - recursosquitados;

  		}
  			return sobrante;
  	}

  	public void viaja() {
  		if(planeta.isFull()) {
      	  nave.ritmo();
    	} else
    	nave.getMigrar();
  	}

  	 public void getMigrar() {
   		for(int i=0;i<planetas.length;i++) {
      		System.out.println(planetas.get(i));
    	}
  	}


  	public static void main(String args[]) {
	    NaveEspacial nave = new NaveEspacial();
	    nave.getUniverso();

	    while(dia<30) {
	    nave.viaja(planeta);
	    nave.ritmo();

	      if(planeta.isEmpty()) {
	        planeta = universo.getMigrar();
	      }
	        dia++;
	    }
	  }
}
