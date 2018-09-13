package projcalcversao3;

public class Calculadora{
	static Operacoes oper = new Operacoes();
	
	public static void main(String[] args){
		
		while (true){
			
			int numero1 = EntradaSaida.infonum1();
			int numero2 = EntradaSaida.infonum2();
			int acao = EntradaSaida.infop();
			
			String msg = oper.calcular( numero1, numero2, acao);
			
			EntradaSaida.mostraResultado(msg);			
		}		
	}// termino do metodo main.
}// fim da classe Calculadora.
