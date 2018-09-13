package trocaTroca;

public class Comunicadora {

	public void comunica() {
		
		int quantidade =0;
		
		quantidade = EntraDados.infQuant();
		
		Controladora controle = new Controladora();
		controle.controlar(quantidade);
	}
}
