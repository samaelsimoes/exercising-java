package VerificaMassaCorporea;

public class Calcular {

	public double executar(double altura, double peso) {
		
		double imc = peso / (altura * 2);
		
		return imc;
	}
}
