package Calcula;

public class CalTrap {

	public void executar(double LadoMaior, double LadoMenor, double Altura) {
		
		double Resultado = 0;
		
		Resultado = ( LadoMaior + LadoMenor) * Altura /2;
		
		Saidados.mostraResultado("Área Retângulo é de: " + Resultado );
		
	}

}
