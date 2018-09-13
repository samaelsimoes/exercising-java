package CalculamediaAulo;

public class CalculaMedia {

	public double calcular(double nota1, double nota2, double nota3) { //declarando 3 variaveis para receber os valores de variaveis de parametro enviadas pelo metodo. 
		
		double MediaAluno = 0;
		
		MediaAluno = (nota1 + nota2 + nota3) / 3;
		
		return MediaAluno;
	}
}
