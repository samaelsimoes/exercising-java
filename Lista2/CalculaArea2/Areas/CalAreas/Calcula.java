package CalAreas;


public class Calcula {

	public void executar1(double altura, double base, int opcao) {
		
		switch (opcao){
		
		case 1:
			
			double Resultado = base * altura;
			
			Saidadedos.saidados("�rea Ret�ngulo � de: " + Resultado );
			
		break;
		
		case 2:
			
			double Resultado1 = base * altura /2;
			
			Saidadedos.saidados("�rea do Tri�ngulo: " + Resultado1 );
			
		break;
		
		}	
	}
	
	public void executar3(double raio1, double raio2) {
		
		double Resultado2 = 2 * 3.14 * 3.14 * raio1 * raio2;
		Saidadedos.saidados("�rea do C�rculo �: " + Resultado2 );	
	}
	
	public void executar4(double lado1, double lado2) {
		
		double Resultado2 = lado1 * lado2;
		Saidadedos.saidados("�rea do Quadrado �: " + Resultado2 );		
	}
	
	public void executar5(double ladomaior, double ladomenor, double altura) {
		
		double Resultado2 = (ladomaior + ladomenor) * altura /2;
		Saidadedos.saidados("�rea do Quadrado �: " + Resultado2 );		
		
	}
}
