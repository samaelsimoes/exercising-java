package Verifica;

public class VerfMediaIdade {

	public void verifi(double Media) {
		
		if ( Media <= 25 ){
			
			String mens = " A Equipe � Jovem com a m�dia de:  " + Media;
			SaiDados.saindo(" \n " + mens );
			
			
		}else
			if(Media > 26){
				String mens = " A Equipe � Adulta com a m�dia de:  " + Media;
				SaiDados.saindo(" \n " + mens );
				
				
			}else{
				if(Media >= 61){
					
					String mens = " A Equipe � Idosa com a m�dia de:  " + Media;
					SaiDados.saindo(" \n " + mens );
			}
		}
	}
}






