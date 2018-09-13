package CalAreas;

public class VerificaOpcao {

	public void calcular(int opcao) {
		
		switch ( opcao){
		
			case 1:
				
				Retangulo cal = new Retangulo();
				cal.executar(opcao);
				
			break;
			
			case 2:
				
				Triangulo calcula = new Triangulo();
				calcula.executar(opcao);				
				
			break;
			
			case 3:
				
				Circulo cal1 = new Circulo();
				cal1.executar();				
				
			break;
			
			case 4:
				Quadrado cal2 = new Quadrado();
				cal2.executar();
				
			break;
			
			case 5:
				Trapezio cal3 = new Trapezio();
				cal3.executar();
				
			break;
			
			case 6 :
				
				System.exit(0);
				
			break;
		}
	}
}
