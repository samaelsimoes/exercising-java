package CalculamediaAulo;

public class Comunica {
	
	public void executar() {

		while (true){
		
			String nome = EntraEsaiDados.aluno();
			double nota1 = EntraEsaiDados.numero1();
			double nota2 = EntraEsaiDados.numero2();
			double nota3 = EntraEsaiDados.numero3();
			int opcao = EntraEsaiDados.opcaoo();
		
			Controle control = new Controle();
			String msg = control.calcular(nota1,nota2,nota3,opcao,nome);
		
			EntraEsaiDados.mostraResultado(msg);
		}
	}
}
