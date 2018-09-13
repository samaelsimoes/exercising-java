package SalbrutoSalliquido;

import javax.swing.JOptionPane;

public class EntradaSaida {

	public static double infonum1() {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhada"));
		
		return num1; 
	}

	public static double infonum2() {
		
		double num2 =  Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada"));
		
		return num2;
	}

	public static int opcao() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um Calcula \n "
						+ " 1 - Calcular Salário liquido e bruto \n"
						+ " 2 - Sair do Sistema \n"));						
		return op;
	}
	static void mostraResultado(String recmsgdresult){	// void ele não retorna
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
