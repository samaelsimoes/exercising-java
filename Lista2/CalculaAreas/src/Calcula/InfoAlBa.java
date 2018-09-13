package Calcula;

import javax.swing.JOptionPane;

public class InfoAlBa {
	
	public static double infoba() {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a Altura do Retângulo: "));
		
		return num1;
	}

	public static double infoal() {
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a Base do Retângulo: "));
		return num2;
	}
}
