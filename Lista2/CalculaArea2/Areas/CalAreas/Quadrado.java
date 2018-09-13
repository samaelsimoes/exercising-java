package CalAreas;

public class Quadrado {

	public void executar() {
		
		double Lado1 = InformaDados.inflado1();
		double Lado2 = InformaDados.inflado2();
		
		Calcula cal1 = new Calcula();
		cal1.executar4(Lado1, Lado2);
	}
}
