package VerificaMassaCorporea;

public class Comunicadora {

	public void executar() {
		
		 double altura = 0, peso = 0, imc;
		 
		while(true){
			
			altura = EntradaDeDados.infoAltura();
			peso = EntradaDeDados.infoPeso();
			
			Calcular cal = new Calcular();
			imc = cal.executar( altura, peso);
			
			String mens = "Indice de Massa Corpórea desse aluno é de: " + imc;
			SaidaDeDados.dados(mens);
		}
	}
}
