package SalbrutoSalliquido;

public class IniciaProgram {
	
	public static void main(String[] args){	// metodo main 	estatico e publico 
		
		while(true){ // enquanto for verdadeiro 
			
			double numero1 = EntradaSaida.infonum1();// aqui estamos chamando o metodo infonum1 na classe EntradaSaida para armazenar na variavel
			double numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.opcao();
			
			Operacao oper = new Operacao(); // Criado um objeto que está fazendo uma instancia para classe Operacao
			
			String msg = oper.calcular(numero1,numero2,acao); // estamos chamando o metodo calcular aonde vamos mandar os dados e depois retornalos como string
			
			EntradaSaida.mostraResultado(msg);
		}
	}
}