package Calcula;

import javax.swing.JOptionPane;

public class InformRaio {

	public static double infoal() {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe o Raio do Circulo: "));
		
		return num;
	}
}
