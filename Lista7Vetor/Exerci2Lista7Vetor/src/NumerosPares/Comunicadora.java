package NumerosPares;

public class Comunicadora {

	public void comunica() {
		
		int valor = 0;
		
		while (true){
			
			valor = InfDados.infNum();
		
			Controladora cont = new Controladora();
			cont.calcular(valor);
		}
	}
}
