package MédiaBimestral;

import javax.swing.JOptionPane;

public class EntraEsaiDados {
	
	public static String name(){
		
		String name = JOptionPane.showInputDialog("Inform o Nome do aluno");
		
		return name;
	}

	public static double infonum1() {
		
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(" Informe a primeira nota: "));
		
		return num1;
	}

	public static double infonum2() {
		
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
				
		return num2 ;
	}
	
	public static double infonum3(){
		
		double num3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota: "));
		
		return num3;
	}

	public static int infopcao() {
		
		int op = Integer.parseInt(JOptionPane
				.showInputDialog("Escolha um Calcula \n "
						+ " 1 - Calcular a média do aluno \n"
						+ " 2 - Sair do sistema \n"));
		return op;
	}
	static void mostraResultado(String recmsgdresult){	
		JOptionPane.showMessageDialog(null, recmsgdresult, " Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
