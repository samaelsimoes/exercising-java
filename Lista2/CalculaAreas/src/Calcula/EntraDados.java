package Calcula;

import javax.swing.JOptionPane;

public class EntraDados {

	public static int infonum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das op��es para calcular: \n \n"
				+ "1- �rea Ret�ngulo. \n"
				+ "2- �rea Tri�ngulo. \n "
				+ "3- �rea do C�rculo. \n"
				+ "4- �rea do quadrado. \n"
				+ "5- �rea do trap�zio. \n"
				+ "6- Sair do Sistema. \n"));
		
		return num;
	}
	static void mostraResultado(String recmsgdresult){	
		
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}	
}
