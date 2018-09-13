package Verifica;

public class CalculaMediaIadade {

	public void calcula(int idade1, int idade2, int idade3, int idade4, int idade5) {
		
		double calculaMedia = ( idade1 + idade2 + idade3 + idade4 + idade5) /5;
		
		VerfMediaIdade ver = new VerfMediaIdade();
		ver.verifi(calculaMedia);
		
	}
}
