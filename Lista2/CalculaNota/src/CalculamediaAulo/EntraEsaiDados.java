package CalculamediaAulo;

import javax.swing.JOptionPane;

public class EntraEsaiDados {

	public static String aluno() {
		
		String al = (JOptionPane.showInputDialog(" Digite o nome do aluno: "));
		return al;
	}

	public static double numero1() {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a 1ª Nota: "));
		
		return num1; 
		
	}

	public static double numero2() {

		double num2 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a 2ª Nota: "));
		
		return num2;
	}

	public static double numero3() {
		
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a 3ª Nota: "));
		
		return num3;
	}

	public static int opcaoo() {
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha as opções \n"
				+ " 1 - Calcular: \n"
				+ " 2 - Sair do Sistema: "));
		
		return op; 
	}
	static void mostraResultado(String msg){	
		
		JOptionPane.showMessageDialog(null, msg, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
