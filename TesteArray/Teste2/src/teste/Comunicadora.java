package teste;

import java.util.Scanner;

public class Comunicadora {

	public void executar() {
		
		int quantidade = 0;
		double  numeros = 0, soma = 0;
		
		Scanner in = new Scanner(System.in);
		
		quantidade = InfDados.infQuant();
		
		int[] calcular = new int[quantidade]; // array 'vetor';
		
		for(int i = 0; i < quantidade; i++){	
			
			numeros = InfDados.infNumeros(i+1);		
			calcular[i] = numeros() ;
		}
		for(int i = 0; i < quantidade; i++){
			
			soma += calcular[i];
		}
	}
}
