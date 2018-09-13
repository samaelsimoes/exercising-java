package projcalversao2;
public class calculadora { // Classe Principal
	public static void main(String[] args) { // metodo main
		while (true){
			int numero1 = EntradaSaida.infonum1();   // ele pede para solicitar infonum1 que é a entrada de dados e vai salvar numa variavel
			int acao = EntradaSaida.infop(); // entrada
			int	numero2 = EntradaSaida.infonum2();  //enntrada 
			// Criando um objeto =  Metodo, váriavel = new = > Operações oper= new Operacoes()
			Operacoes oper = new Operacoes(); // classe operacoes se transforma em objeto = new é um comando apos temos uma classe 
			// seguindo entre parentes criando uma instancia ' copia' ele ta criando uma copia na memoria ram 
			String msg = oper.calcular( numero1, acao, numero2);  // processo 
			//esta declarando uma variavel string tipo msg = tipo bojeto e faze uma copia do metodo calcular que esta passando o num 1 2 e 3
			//saida de dados 
			EntradaSaida.mostraResultado(msg); // aqui ele vai executa direto  
		} // terminio da estrutura while
	} //main
} // términio da classe
// ELA É RESPONSAVEL DE ENCAMINHAR O CALCULO
// ESSA CLASSE ENCAMINHA ' CHAMA '  A ENTRADA DE DADOS
//ELA É A CLASSE PRINCIPAL.