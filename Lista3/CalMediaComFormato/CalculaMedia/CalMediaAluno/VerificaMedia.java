package CalMediaAluno;

public class VerificaMedia {

	public void executar(double resultado, String nomealuno) {
		
		if ( resultado <= 3){
				
		String mens = " Aluno: " + nomealuno + " Est� com a M�dia: " + resultado + " \n  "+
		 " \n " + " T� feia a coisa, deve esfor�ar-se muito para recuperar";
		
		Saidadedos.saindo(" \n " + mens );
		
		}else{
			
			if ( resultado <=6 ){
				
				String mens = " Aluno: " + nomealuno + " Est� com a M�dia: " + resultado + " \n  "+
				" \n " + " Tem alguma coisa boa a�, vamos melhorar ?";	
				
				Saidadedos.saindo(" \n " + mens );
				
			}else{
				if ( resultado <= 10 ){
					
					String mens = " Aluno: " + nomealuno + " Est� com a M�dia: " + resultado + " \n  "+
					" \n " + " Tem valor, procure manter-se ou melhorar !";
					
					Saidadedos.saindo(" \n " + mens );
					
				}else{
					
					if( resultado == 0){
						
						String mens = " Aluno: " + nomealuno + " Est� com a M�dia: " + resultado + " \n  "+
						" \n " + " Ainda d�, � s� tirar a pregui�a !";
						
						Saidadedos.saindo(" \n " + mens );
					}
				}
			}
		}
	} 
}
