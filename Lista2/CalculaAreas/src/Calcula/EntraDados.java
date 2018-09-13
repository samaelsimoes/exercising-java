package Calcula;

import javax.swing.JOptionPane;

public class EntraDados {

	public static int infonum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções para calcular: \n \n"
				+ "1- Área Retângulo. \n"
				+ "2- Área Triângulo. \n "
				+ "3- Área do Círculo. \n"
				+ "4- Área do quadrado. \n"
				+ "5- Área do trapézio. \n"
				+ "6- Sair do Sistema. \n"));
		
		return num;
	}
	static void mostraResultado(String recmsgdresult){	
		
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}	
}
