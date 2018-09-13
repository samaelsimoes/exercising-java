package CalculadoraBasicaOov7;

import javax.swing.JOptionPane;

public class Controladora {
// essa classe tem o papel para mostrar a opção da operação que o usuário desejar.
	public String calcular(int numero1, int numero2, int operacao) {
		
		String mens = " " ;
		
		Operacao oper = null;  // o objeto nao esta amarrado em ninguem ele é nulo 
		switch (operacao){// aqui estamos utilizando polimorfismo por causa do objeto que esta tendo varias formas de operações 
			case 1: 
				Soma soma = new Soma(); // cria o objeto soma e instancia ele para classe criando uma forma 
				oper = soma; // fazendo uma associação    soma esta transferindo para  oper.
			break; // ta tirando ele da qui de dentro 
			case 2 :
				Subtracao sub = new Subtracao();
				oper = sub;
			break;
			case 3:
				Multiplicacao multi = new Multiplicacao();
				oper = multi;
			break;
			case 4 :
				Divisao divi = new Divisao();
				oper = divi;
			break;
			case 5 :
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			break;		
		}// fim da estrutura switch
		// verifica se o objeto é diferente ou nulo
		if ( oper != null){
		oper.ajustaValores(numero1,numero2);
		
		mens = oper.calcular();
		}
		return mens;
	}

}
