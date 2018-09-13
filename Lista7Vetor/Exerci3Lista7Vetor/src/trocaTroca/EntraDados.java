package trocaTroca;

import javax.swing.JOptionPane;

public class EntraDados {

	public static int infQuant() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de números que deseja Digitar: ", "Informa a quantidade de vezes aqui"));
		
		return num;
	}

	public static double infNumero(int i) {
		
		double num = Double.parseDouble(JOptionPane.showInputDialog(" Informe a quantidade de números que deseja Digitar: ", "Informa a quantidade de vezes aqui"));
		
		return num;
	}
}
