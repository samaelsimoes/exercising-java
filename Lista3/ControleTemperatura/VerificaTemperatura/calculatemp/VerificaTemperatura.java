package calculatemp;

public class VerificaTemperatura {

	public void executar(double temperatura) {
		
		if ( temperatura <= 500 ){
			
			String mens = " Temperatura invalida ";
			Saidadedos.saindo(" \n " + mens );
			
		}else{
			
			if ( temperatura  < 700 ){
				
				String mens = " Aquecimento esta 100% ";
				Saidadedos.saindo(" \n " + mens );
				
				
			}else {
				
				if ( temperatura <= 735){
					
					String mens = " aquecimento ligado em 50% ";
					Saidadedos.saindo(" \n " + mens );
					
				}else{
					
					if ( temperatura <= 779){
					
						String mens = " Aquecimento desligado ";
						Saidadedos.saindo(" \n " + mens );
						
					}else{
						
						if ( temperatura >= 780){
							
							String mens = " Super Aquecimento  ";
							Saidadedos.saindo(" \n " + mens );
							
						}
					}
				}
			}
		}		
	}
}
