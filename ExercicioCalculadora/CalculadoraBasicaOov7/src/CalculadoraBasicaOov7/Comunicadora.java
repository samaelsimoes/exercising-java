package CalculadoraBasicaOov7;

public class Comunicadora {
	
	public static void  executar (){ // metodo executar publico sem retorno.
		
		while (true) { // inicio da estrutura while ' enquantoo for verdadeiro'
			int numero1 = EntradaSaida.infonum1(); // aqui ele está chamando o metodo infonum1(), que esta na classe EntradaSaida para armazenar a váriavel numero1
			int numero2 = EntradaSaida.infonum2(); //   está chamando o metodo infonum2() que se encontra na classe EntradaSaida para armazenar na váriavel numero2
			int acao = EntradaSaida.infop();
			
			Controladora controle = new Controladora();
			
			String msg = controle.calcular(numero1,numero2,acao);
			
			EntradaSaida.mostraResultado(msg);					
		}
	}
}
