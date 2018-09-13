package MetanolGasolina;

public class CalculaCompra {
	
	

	public void desMaior(double metanol) {  // acima de 20 litros com desconto de 5%.
			
		double cal = metanol * 2.75;  // 2.90 - 0.145 de desconto ou metanol * (2.90 - (2.90 *0.04));.
		
		String mens = " Valor total é de: R$ " + cal;
		SaiDados.saindo(" \n " + mens );
				
	}

	public void desMenor(double metanol) { // abaixo e ate 20 litros com desconto de 4%.
		
		double cal1 = metanol  * 2.78 ; // 2.90 - 0.116 de desconto.  ou metanol * (2.90 - (2.90 *0.04));
		
		String mens = " Valor total é de: R$ " + cal1;
		SaiDados.saindo(" \n " + mens );
		
	}

	public void calGasolina(double gasolina) { // acima de 20 litros desconto de 6%.
		
		double cal = gasolina * 3.29; // 3.50 -0,21 = 3.29 de desconto 
		
		String mens = " Valor total é de: R$ " + cal;
		SaiDados.saindo(" \n " + mens );
		
	}
}
