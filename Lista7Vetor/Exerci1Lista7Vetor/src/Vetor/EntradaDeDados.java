package Vetor;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static int infQuant() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de n�mero que deseja Digitar: "));
		
		return num;
	}

	public static double infNumeros(int i) {
		
		double infnumero = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + i+ "�  n�mero: " ));
		
		return infnumero;
	}

	public static int infNum() {
		
		int procura = Integer.parseInt(JOptionPane.showInputDialog(" Informe um n�mero que procura: "));
		
		return procura;
	}

}
