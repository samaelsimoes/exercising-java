package Verificanumeros;

public class Verifica {

	public String executar(double numero1) {
		
		String mens = " ";
		
		if ( numero1 > 0 ){
			
			mens = " O n�mero: " + numero1 + ("\n � positivo ");
			
		}else{
			if ( numero1 < 0){
				mens = " O n�mero:" + numero1 + ("\n � negativo ");
				
			}else{
				mens = " O n�mero: " + numero1 + ( " \n � nulo");
			}
		}				
		return mens;
	}
}
