/*
Excellent and complete example
Shows all the stuff, reacomodates the code shown in blackboard
but for good.


Should this inner lines have been changed to the very first
part, on top of the FOR cycle, you would not have needed to get
the if(dia==1)

if(dia==1){
  System.out.println("Viaje a nuevo planeta");
  System.out.println(examen.getUni().getPlan(examen.getUni().getPos()));
}
Compile: 20
Run: 20
Job: 20

*/

import javax.swing.*;

public class Examen1{
  Nave nave= new Nave();
  Universo andromeda= new Universo();

  public Nave getNave(){return nave;}
  public Universo getUni(){return andromeda;}

  public static void main(String[] args) {
    Examen1 examen=new Examen1();
    for(int dia=1; dia<=30 ; dia++){
      System.out.println("Dia " + dia);
      if(examen.getUni().getPlan(examen.getUni().getPos()).getAgo()){
        examen.getUni().plusOne();
        System.out.println();
        System.out.println("Viaje a nuevo planeta");
        System.out.println(examen.getUni().getPlan(examen.getUni().getPos()));
      }
      if(dia==1){
        System.out.println("Viaje a nuevo planeta");
        System.out.println(examen.getUni().getPlan(examen.getUni().getPos()));
      }
      examen.getNave().minar(examen.getUni().getPlan(examen.getUni().getPos()));
    }
    System.out.println(examen.getNave());
  }
}
