package projcalversao6;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular(int numero1, int numero2, int operacao) {
		
		String mens = " ";
		switch(operacao){ // estrutura escolha 
			case 1:
				Soma soma = new Soma(); // cria um objeto e faz uma instancia ' copia ' para classe Soma.
				
				soma.ajustaValores(numero1,numero2);
;				
				mens = soma.calcular();
			break;
			case 2:
				Subtracao sub = new Subtracao();// cria um objeto e faz uma instancia para classe Subtracao
				
				sub.ajustaValores(numero1,numero2); 
				/* Chama  o metodo ajustaValores da classe operacao que ira receber os numeros
				 * para serem armazenados nos atributos m_numero1 e m_numero2 declarados nesta classe. 
				 */
				
				mens = sub.calcular();
			break;
			case 3:
				Multiplicacao multi = new Multiplicacao();
				
				multi.ajustaValores(numero1,numero2);
				
				mens = multi.calcular();
			break;
			case 4:
				Divisao divi = new Divisao();
				
				divi.ajustaValores(numero1,numero2);
				
				mens = divi.calcular();
			break;
			case 5:
				System.exit(0);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
		
			break;		
		} // fim da estrutura escolha 'switch';
		return mens;
	}// fim do metodo calcular;	
} // Terminio da classe calculadora
