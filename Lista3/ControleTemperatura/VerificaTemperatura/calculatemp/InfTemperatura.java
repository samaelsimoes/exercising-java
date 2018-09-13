package calculatemp;

import javax.swing.JOptionPane;

public class InfTemperatura {

	public static double inftemp() {
		
		double tempe = Double.parseDouble(JOptionPane.showInputDialog(" Informe a temperatura do Forno: "));
		
		return tempe;
	}
}
