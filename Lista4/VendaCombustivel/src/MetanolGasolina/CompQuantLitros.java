package MetanolGasolina;

import javax.swing.JOptionPane;

public class CompQuantLitros {

	public static double infLitroMetano() {
		
		double meta= Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de Litros de Metanol que você Deseja: \n \n"));
		
		return meta;
	}

	public static double inflitroGasolina() {
		
		double gaso = Double.parseDouble(JOptionPane.showInputDialog(" Informe a quantidade de litros de Gasolina que você Deseja: \n \n"));
		
		return gaso;
	}
}
