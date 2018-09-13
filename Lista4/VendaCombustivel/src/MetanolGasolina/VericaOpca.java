package MetanolGasolina;

public class VericaOpca {

	public void verifica(int opcao) {
		
		switch ( opcao){
		
			case 1:
				
				double metanol = CompQuantLitros. infLitroMetano();
				
				if (metanol >20){
	
					CalculaCompra cal1 = new CalculaCompra();
					cal1.desMaior(metanol);
					
				}else{
					
					if (metanol <= 20){
						
						CalculaCompra cal1 = new CalculaCompra();
						cal1.desMenor(metanol);
						
					}
				}
				
			break;
			
			case 2:
				
				double gasolina =  CompQuantLitros.inflitroGasolina();
				
				if (gasolina > 20){
					
					CalculaCompra cal2 = new CalculaCompra();
					cal2.calGasolina(gasolina);
					
				}
				
			break;
			
			case 3:
				
				System.exit(0);
				
			break;
		}	
	}
}
