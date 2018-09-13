package SalbrutoEliquido;

import javax.swing.JOptionPane;

public class EntraEsaiDados {

	public static double infonum1() {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("A quantidade de horas trabalha: "));
		
		return num1; 
	}

	public static double infonum2() {
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("O valor por hora trabalhada é de: R$ "));
		
		return num2; 
	}

	public static int opp() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha as opções \n"
				+ " 1 - Calcular: \n"
				+ " 2 - Sair do Sistema: "));
		
		return op; 
	}
	static void mostraResultado(String recmsgdresult){	
		
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}

}
