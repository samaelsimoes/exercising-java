package CalAreas;

public class Circulo {

	public void executar() {
		
		double Raio1 = InformaDados.infraio1();
		double Raio2 = InformaDados.infraio2();
		
		Calcula cal = new Calcula();
		cal.executar3(Raio1, Raio2);	
	}
}
