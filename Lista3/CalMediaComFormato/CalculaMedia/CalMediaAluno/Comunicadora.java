package CalMediaAluno;

public class Comunicadora {

	public void chamaComu() {
		
		while ( true ){
			
			String nomealuno = InformaAluno.infAluno();
			
			double nota1 = InformaMedia.infMedia1();
			double nota2 = InformaMedia.infMedia2();
			double nota3 = InformaMedia.infMedia3();
			
			CalMedia cal = new CalMedia();
			cal.calcular(nota1, nota2, nota3, nomealuno);
		}	
	}
}
