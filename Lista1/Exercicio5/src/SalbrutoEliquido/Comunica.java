package SalbrutoEliquido;

public class Comunica {

	public void executar() { // metodo executar publico sem retorno. 
		
		double numero1 = EntraEsaiDados.infonum1();
		double numero2 = EntraEsaiDados.infonum2();
		int opcao = EntraEsaiDados.opp();
				
		Controladora controle = new Controladora();
		
		String msg = controle.calcular(numero1,numero2,opcao);
		
		
		EntraEsaiDados.mostraResultado(msg);	
	}
}
