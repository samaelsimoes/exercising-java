package SalbrutoSalliquido;

import javax.swing.JOptionPane;

public class Operacao {
	
	public String calcular(double num1, double num2, int operacao){
		
		String msg = " ";
		String msg1 = " ";
		
		double dResultado = 0;
		double dResultado1 = 0; 
		
		switch(operacao){ //Estruta escolha 
		
			case 1:
				
				dResultado = num1 * num2;
				dResultado1 = dResultado - (dResultado * 0.10); 
				msg = "Salário bruto sem desconto é de: R$ "+ dResultado;
				msg1 = "Salário liquido com desconto de 10% é de: R$ "+ dResultado1;
				
			break;
			
			case 2:
			    
				System.exit(0);
				
			break;
						
			default: // outro caso uma omissão dele uma parte final			
			JOptionPane.showMessageDialog(null, " opção Inexistente ","Erro",JOptionPane.OK_CANCEL_OPTION);
			break;
		}
		return ( msg + "  " + " \n" + msg1 + "  " );
	}	
}
