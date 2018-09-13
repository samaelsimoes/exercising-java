package Vetor;

public class Comunicadora {

	public void executar() {
		
		while (true){
			
			int quantidade = EntradaDeDados.infQuant();
			
			ControleVetor control = new ControleVetor();	
			control.levaDados(quantidade);
			
		}
	}
}
