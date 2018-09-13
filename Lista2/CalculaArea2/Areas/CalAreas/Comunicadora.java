package CalAreas;


public class Comunicadora {

	public void executar() {
		
		while (true){
			
			int EscolhaOp = EscolhaOpcao.InformOp();
			
			VerificaOpcao veri = new VerificaOpcao();		
			veri.calcular(EscolhaOp);
		}
	}
}
