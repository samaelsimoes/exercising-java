package projcalversao2;
import javax.swing.JOptionPane;
public class Operacoes{
	public  String calcular(int num1, int operacao, int num2){ // esse metodo n�o � dinamico pois n�o esta como static
		String msg = " " ;
		double dResultado = 0;
		switch (operacao){
			case 1: // caso 
				dResultado = num1 + num2;
				msg = " A soma �: ";		
			break;
			case 2:
				dResultado = num1 - num2;
				msg = "A Subtra��o �: ";
			break;
			case 3:
				dResultado = num1 * num2;
				msg = " A multiplica��o �: ";				
			break;
			case 4:
				if ( num2 != 0){
					dResultado = num1 / num2;
					msg = " A divis�o �: ";					
				}else{
					dResultado = 999999999999999.9999999999999;
					msg= " Erro de divis�o por zero";
				}
			break;
			case 5:
				System.exit(0);
			break;
			default: // outro caso uma omiss�o dele uma parte final			
				JOptionPane.showMessageDialog(null, " op��o Inexistente ","Erro",JOptionPane.OK_CANCEL_OPTION);
			break;
		}	// Fim da estrutura Switch 	
		return ( msg + " " + dResultado);
	} // Fim estrutura metodo calcular
} // termino da estrutura 

//Classe Opera��es serve para dividir as tarefas.
