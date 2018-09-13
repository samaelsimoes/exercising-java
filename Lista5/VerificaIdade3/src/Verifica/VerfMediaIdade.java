package Verifica;

public class VerfMediaIdade {

	public void verifi(double Media) {
		
		if ( Media <= 25 ){
			
			String mens = " A Equipe é Jovem com a média de:  " + Media;
			SaiDados.saindo(" \n " + mens );
			
			
		}else
			if(Media > 26){
				String mens = " A Equipe é Adulta com a média de:  " + Media;
				SaiDados.saindo(" \n " + mens );
				
				
			}else{
				if(Media >= 61){
					
					String mens = " A Equipe é Idosa com a média de:  " + Media;
					SaiDados.saindo(" \n " + mens );
			}
		}
	}
}






