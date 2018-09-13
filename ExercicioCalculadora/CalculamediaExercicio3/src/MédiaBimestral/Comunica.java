package MédiaBimestral;

public class Comunica {
	
	public void executar() {
		
		while(true){
			
			String nomealu = EntraEsaiDados.name();
			double nota1 = EntraEsaiDados.infonum1();
			double nota2 = EntraEsaiDados.infonum2();
			double nota3 = EntraEsaiDados.kinfonum3();
			
			int opcao = EntraEsaiDados.infopcao();
			
			Operacao op = new Operacao();
			
			String msg = op.calcular(nota1,nota2,nota3,nomealu, opcao);
			
			EntraEsaiDados.mostraResultado(msg);
		}
	}
}
