import javax.swing.*;

public class FirstProgram{

	public static void main(String args[] ){
			
		String res = JOptionPane.showInputDialog(null, "Nombre");
		String ape = JOptionPane.showInputDialog(null, "Apellido");
		String mon = JOptionPane.showInputDialog(null, "Mes");

		String n = res.charAt(0) + "" + res.charAt(1);	
		String a = ape.charAt(0) + "" + ape.charAt(1);
		String m = mon.charAt(0) + "" + mon.charAt(1);	
		System.out.println("Nombre Joesiano: " + n + a + m);
	}

}