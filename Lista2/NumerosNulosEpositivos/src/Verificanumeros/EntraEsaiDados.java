package Verificanumeros;

import javax.swing.JOptionPane;

public class EntraEsaiDados {

	public static double infnum() {
		
		double num = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
		
		return num;
	}
	static void mostraResultado(String recmsgdresult){	
		
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
