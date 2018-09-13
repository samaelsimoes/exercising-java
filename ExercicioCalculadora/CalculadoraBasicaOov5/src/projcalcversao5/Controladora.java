package projcalcversao5;

import javax.swing.JOptionPane;

public class Controladora {

	public String calcular(int numero1, int numero2, int operacao) {
		
		String mens = " ";
		switch(operacao){ // estrutura escolha 
			case 1:
				Soma soma = new Soma();
				
				mens = soma.calcular(numero1,numero2);
			break;
			case 2:
				Subtracao sub = new Subtracao();
				
				mens = sub.calcular(numero1,numero2);
			break;
			case 3:
				Multiplicacao multi = new Multiplicacao();
				
				mens = multi.calcular(numero1,numero2);
			break;
			case 4:
				Divisao divi = new Divisao();
				
				mens = divi.calcular(numero1,numero2);
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
