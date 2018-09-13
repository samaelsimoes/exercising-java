package Calcula;

public class DadosTriangulo {

	public void caltriangulo() {
		double altura = InfoAlBa.infoal();
		double base = InfoAlBa.infoba();
		
		CalRetanTrian cal = new CalRetanTrian();
		cal.executar(altura,base);
	}
}
