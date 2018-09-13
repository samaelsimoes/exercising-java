package MetanolGasolina;

public class Comunicadora {

	public void executar() {
		
		while (true){
			
			int opcao = InformaOpcao.infOpcao();
			
			VericaOpca veri = new VericaOpca();
			veri.verifica(opcao);
			
		}
	}
}
