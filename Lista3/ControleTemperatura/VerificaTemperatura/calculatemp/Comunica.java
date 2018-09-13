package calculatemp;

public class Comunica {

	public void executar() {
		
		while (true){
			
			double temperatura = InfTemperatura.inftemp();	
		
			VerificaTemperatura veri = new VerificaTemperatura();
			veri.executar(temperatura);
		}
	}
}
