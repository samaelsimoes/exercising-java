package VerificaMassaCorporea;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static double infoPeso() {
		
		double peSo = Double.parseDouble(JOptionPane.showInputDialog(" Informe o Peso do aluno: "));
		
		return peSo;
	}

	public static double infoAltura() {
		
		double alTura = Double.parseDouble(JOptionPane.showInputDialog(" Informe a Altura do aluno: "));
		
		return alTura;
	}
}
