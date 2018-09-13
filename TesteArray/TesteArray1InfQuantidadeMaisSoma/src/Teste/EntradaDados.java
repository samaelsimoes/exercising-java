package Teste;

import javax.swing.JOptionPane;

public class EntradaDados {

	public static int infquant() {
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantos numeros deseja digitar para somar: "));
		
		return num;
	}
}
