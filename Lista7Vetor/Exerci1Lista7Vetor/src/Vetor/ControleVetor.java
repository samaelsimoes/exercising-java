package Vetor;

public class ControleVetor {

	public void levaDados(int quantidade) {
		
		double numeros = 0, procuraNum = 0;
		int  a = 0;
		
		int[] vetor = new int[quantidade];//array
		
		for ( int i = 0; i < quantidade; i++){
			
			numeros = EntradaDeDados.infNumeros(i+1); // esse i+1 é para ele iniciar em 1 não em 0;
			vetor[i] = (int) numeros; 
		}
		
		procuraNum = EntradaDeDados.infNum();
		
		for( int i = 0; i < quantidade; i++){
			
			if(vetor[i] == procuraNum){
				a = i; 
			}
		}
		String mens = "O número: " + procuraNum + " Está na posição: " + a ;
		SaidaDados.saindo(mens);
	}
}
