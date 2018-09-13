package Verificanumeros;

public class Verifica {

	public String executar(double numero1) {
		
		String mens = " ";
		
		if ( numero1 > 0 ){
			
			mens = " O número: " + numero1 + ("\n É positivo ");
			
		}else{
			if ( numero1 < 0){
				mens = " O número:" + numero1 + ("\n É negativo ");
				
			}else{
				mens = " O número: " + numero1 + ( " \n é nulo");
			}
		}				
		return mens;
	}
}
