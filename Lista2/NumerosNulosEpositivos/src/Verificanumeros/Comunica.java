package Verificanumeros;

public class Comunica {

	public void entradados() {
		
		while (true){
			
			double numero1 = EntraEsaiDados.infnum();
		
			Controle contro = new Controle();
			String msg = contro.calculanota(numero1);
		
			EntraEsaiDados.mostraResultado(msg);
		}
	}
}
