package Verificanumeros;

public class Controle {
	
	public String calculanota(double numero1) {
		
		String mens = " ";
		
		Verifica veri = new Verifica();
		mens = veri.executar(numero1);
		
		return mens;
	}
}
