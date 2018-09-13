package Calcula;

public class CalareaCirc {

	public void executar(double raio) {
		
		double Resultado = 0;
		
		Resultado = 2 * 3.14 * raio * raio;
		
		Saidados.mostraResultado( " Área do Círculo é de: " + Resultado );
	}
}
