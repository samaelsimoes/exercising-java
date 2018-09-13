package Verifica;

public class Comunicadora {

	public void comunicadora() {
		
		int idade1 = InformaDados.infIdade1();
		int idade2 = InformaDados.infIdade2();
		int idade3 = InformaDados.infIdade3();
		int idade4 = InformaDados.infIdade4();
		int idade5 = InformaDados.infIdade5();
		
		CalculaMediaIadade cal = new CalculaMediaIadade();
		cal.calcula(idade1,idade2,idade3,idade4,idade5);
	}
}
