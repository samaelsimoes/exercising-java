package CalMediaAluno;

import javax.swing.JOptionPane;

public class InformaMedia {

	public static double infMedia1() {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a 1� Nota: "));
		
		return num1; 
	}

	public static double infMedia2() {

		double num2 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a 2� Nota: "));
		
		return num2; 
		
	}

	public static double infMedia3() {

		double num3 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a 3� Nota: "));
		
		return num3; 
	}
}
