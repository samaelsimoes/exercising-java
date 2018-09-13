package trocaTroca;

public class Controladora {

	public void controlar(int quantidade) {
		
		int[] vetor = new int[quantidade];//array

		
		double numeros = 0;
		
		for ( int i =0; i < quantidade; i++){
			
			numeros = EntraDados.infNumero(i+1);
			vetor[i] = (int) numeros; 
		
		}
		
		for( int i =0; i < quantidade; i++){
			
			vetor[i]++;
			vetor1[i +5] += vetor[i +5];
		}
		
		for( int i =0; i < quantidade; i++){
			
		}
		
	}
}
//num[i]<-num2[i+5]
//num[i+5]<-num1[i]