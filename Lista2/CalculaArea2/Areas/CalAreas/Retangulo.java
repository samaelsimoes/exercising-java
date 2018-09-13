package CalAreas;


public class Retangulo {

	public void executar(int opcao) {
		
		double Altura = InformaDados.infAltura();
		double Base = InformaDados.infBase();
		
		Calcula cal = new Calcula();
		cal.executar1(Altura, Base,opcao);
	}
}
