package Calcula;

public class DadosTrapezio {

	public void caltrapezio() {
		double LadoMaior = InformTrapezio.infolado1();
		double LadoMenor = InformTrapezio.infolado2();
		double Altura = InformTrapezio.infolado3();
		
		CalTrap cal = new CalTrap();
		cal.executar(LadoMaior, LadoMenor, Altura);
		
	}
}
