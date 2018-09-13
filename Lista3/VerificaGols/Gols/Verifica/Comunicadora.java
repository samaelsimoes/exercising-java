package Verifica;

public class Comunicadora {

	public void executar() {
		
		while ( true) {
		
			String timeA = InfoTime.inftimeA();
			String timeB = InfoTime.inftimeB();

			int golA = InfoGols.infgolA(timeA);
			int golB = InfoGols.InfgolB(timeB);

			VerificaGols veri = new VerificaGols();
			veri.verifica(golA, golB, timeA, timeB);
			
		}		
	}
}
