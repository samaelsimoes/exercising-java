package Calcula;

public class CalTrap {

	public void executar(double LadoMaior, double LadoMenor, double Altura) {
		
		double Resultado = 0;
		
		Resultado = ( LadoMaior + LadoMenor) * Altura /2;
		
		Saidados.mostraResultado("�rea Ret�ngulo � de: " + Resultado );
		
	}

}
