package teste;

import javax.swing.JOptionPane;

public class InfDados {

	public static int infQuant() {

		int num = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantidade de vezes que deseja digitar para fazer um calculo: "));
		
		return num;
		
	}

	public static double infNumeros(int i) {

		double num = Double.parseDouble(JOptionPane.showInputDialog("[%d]: Informe o" + i + " º Número:"));
		
		return num;
	}
}
