package CalAreas;

public class Trapezio {

	public void executar() {

		double Ladomaior = InformaDados.infmaior();
		double Ladomenor = InformaDados.infmenor();
		double altura = InformaDados.altura();
		
		Calcula cal = new Calcula();
		cal.executar5(Ladomaior, Ladomenor, altura);	
	}
}
