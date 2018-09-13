package CalMediaAluno;

public class CalMedia {

	public void calcular(double nota1, double nota2, double nota3, String nomealuno) {
		
		double resultado = 0;
		
		resultado = (nota1 + nota2 + nota3) / 3;
		
		VerificaMedia veri = new VerificaMedia();
		veri.executar(resultado, nomealuno);
	
	}
}
