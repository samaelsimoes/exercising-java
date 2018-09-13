package CalMediaAluno;

public class VerificaMedia {

	public void executar(double resultado, String nomealuno) {
		
		if ( resultado <= 3){
				
		String mens = " Aluno: " + nomealuno + " Está com a Média: " + resultado + " \n  "+
		 " \n " + " Tá feia a coisa, deve esforçar-se muito para recuperar";
		
		Saidadedos.saindo(" \n " + mens );
		
		}else{
			
			if ( resultado <=6 ){
				
				String mens = " Aluno: " + nomealuno + " Está com a Média: " + resultado + " \n  "+
				" \n " + " Tem alguma coisa boa aí, vamos melhorar ?";	
				
				Saidadedos.saindo(" \n " + mens );
				
			}else{
				if ( resultado <= 10 ){
					
					String mens = " Aluno: " + nomealuno + " Está com a Média: " + resultado + " \n  "+
					" \n " + " Tem valor, procure manter-se ou melhorar !";
					
					Saidadedos.saindo(" \n " + mens );
					
				}else{
					
					if( resultado == 0){
						
						String mens = " Aluno: " + nomealuno + " Está com a Média: " + resultado + " \n  "+
						" \n " + " Ainda dá, é só tirar a preguiça !";
						
						Saidadedos.saindo(" \n " + mens );
					}
				}
			}
		}
	} 
}
