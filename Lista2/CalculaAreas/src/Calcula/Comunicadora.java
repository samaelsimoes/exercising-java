package Calcula;

public class Comunicadora {

	public void executar() {
		
		while (true){
		
			int opcao = EntraDados.infonum();
		
			Verificadora contro = new Verificadora();
			String msg = contro.calcular(opcao);
		
			EntraDados.mostraResultado(msg);	
			
		}
	}
}
