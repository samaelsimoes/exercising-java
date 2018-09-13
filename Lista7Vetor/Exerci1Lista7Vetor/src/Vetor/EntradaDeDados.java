package Vetor;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static int infQuant() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de número que deseja Digitar: "));
		
		return num;
	}

	public static double infNumeros(int i) {
		
		double infnumero = Double.parseDouble(JOptionPane.showInputDialog("Informe o " + i+ "º  número: " ));
		
		return infnumero;
	}

	public static int infNum() {
		
		int procura = Integer.parseInt(JOptionPane.showInputDialog(" Informe um número que procura: "));
		
		return procura;
	}

}
