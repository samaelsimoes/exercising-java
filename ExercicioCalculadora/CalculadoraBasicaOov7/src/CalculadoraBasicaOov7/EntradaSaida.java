package CalculadoraBasicaOov7;
import javax.swing.JOptionPane; // importando
public class EntradaSaida { // inicio da classe
	//Metodo de entrada de dados
	static int infonum1(){   // uma classe static é quando uma classe tem dentro dela um metodo static no caso temos 3 metodos static
		//static queremos dizer que os métodos ou atributos estáticos da classe são criados na memória diretamente quando executamos o programa.
		int num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro número"));
		return num1; //Retorna o número informado
	}
	//Metodo para entrada de dados da opção do calcula
	static int infop(){
		int op = Integer.parseInt(JOptionPane
			.showInputDialog("Escolha um Calcula \n "
					+ " 1 - Soma \n"
					+ " 2 - Subtração \n"
					+ " 3 - Multiplicação \n"
					+ " 4- Divisão \n "));
	return op; // Retorna a opção escolhida
	}
	//Metodo de entrada do segundo número
	static int infonum2(){
		int num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo número"));
		return num2;
	}
	static void mostraResultado(String recmsgdresult){	// void ele não retorna
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
// RESPONSABILIDADE DESSA CLASSE É COLOCAR A ENTRADA DE DADOS DOS NUMEROS 