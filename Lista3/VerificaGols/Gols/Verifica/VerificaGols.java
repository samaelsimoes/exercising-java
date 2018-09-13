package Verifica;

public class VerificaGols {

	public void verifica(int golA, int golB, String timeA, String timeB) {
		
		if (golA > golB){  // TIME A  SE GANHAR
			
			String mens = "Ganhou o time " + timeA + " " + golA + " X " + golB +" " + timeB;
			SaiDados.saindo(" \n " + mens );
			
		}else{
			
			if ( golB > golA){ // TIME B SE GANHAR
				
				String mens = "Ganhou o time: " + timeB + " " + golB + " X " + golA + " " + timeA;
				SaiDados.saindo(" \n " + mens );
				
			}else{
				
				if ( golA  == golB){ // EMPATE
					
					String mens = " Empatados os times: \n \n "+ timeA + golA + " X " + golB +" " + timeB;
					SaiDados.saindo(" \n " + mens );
					
				}
			}
		}
	}
}
