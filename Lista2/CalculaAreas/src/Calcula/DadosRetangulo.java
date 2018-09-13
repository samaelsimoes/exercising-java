package Calcula;

public class DadosRetangulo {

	public void calretangulo() {
		
		double altura = InfoAlBa.infoal();
		double base = InfoAlBa.infoba();
		
		CalRetanTrian cal = new CalRetanTrian();
		cal.executar(altura,base);
	}
}
