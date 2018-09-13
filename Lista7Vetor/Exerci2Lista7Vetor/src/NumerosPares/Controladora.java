package NumerosPares;

public class Controladora {

	public void calcular(int valor) {
		
		int numeros = 0,contImpar =0, contPar = 0;
		int[] vetor = new int[valor];//array
		
		for ( int i = 0; i < valor; i++){
		
			numeros = InfDados.infNumeros(i+1);
			vetor[i] = (int) numeros; 
			
			if((vetor[i] % 2) == 0){
				
				contPar ++; // contador
					
			}else{
				
				if((vetor[i] % 2) == 1 ){	
					
					contImpar ++; // contador
								
				}
			}
		}
		String mens = " Tem: "+ contPar + " Números Pares \n"
				+ "\n Tem: "+ contImpar + "  Números Impares";
		SaidaDeDados.saindo(mens);
	}
}
