package SalbrutoEliquido;

import javax.swing.JOptionPane;

public class Controladora {
	
	public String calcular(double numero1, double numero2, int opcao) {
		
		String mens = " ";
		
		switch (opcao){
		
			case 1 :
				
				Calcular cal = new Calcular();
				mens = cal.calcular(numero1,numero2);
					
			break;
			case 2 :
			
				System.exit(0);
			
			break;
	
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			
			break;	
		}
		return  mens;
	}					
}