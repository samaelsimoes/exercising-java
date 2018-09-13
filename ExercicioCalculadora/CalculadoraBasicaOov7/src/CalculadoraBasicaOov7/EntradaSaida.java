package CalculadoraBasicaOov7;
import javax.swing.JOptionPane; // importando
public class EntradaSaida { // inicio da classe
	//Metodo de entrada de dados
	static int infonum1(){   // uma classe static � quando uma classe tem dentro dela um metodo static no caso temos 3 metodos static
		//static queremos dizer que os m�todos ou atributos est�ticos da classe s�o criados na mem�ria diretamente quando executamos o programa.
		int num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro n�mero"));
		return num1; //Retorna o n�mero informado
	}
	//Metodo para entrada de dados da op��o do calcula
	static int infop(){
		int op = Integer.parseInt(JOptionPane
			.showInputDialog("Escolha um Calcula \n "
					+ " 1 - Soma \n"
					+ " 2 - Subtra��o \n"
					+ " 3 - Multiplica��o \n"
					+ " 4- Divis�o \n "));
	return op; // Retorna a op��o escolhida
	}
	//Metodo de entrada do segundo n�mero
	static int infonum2(){
		int num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo n�mero"));
		return num2;
	}
	static void mostraResultado(String recmsgdresult){	// void ele n�o retorna
		JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
// RESPONSABILIDADE DESSA CLASSE � COLOCAR A ENTRADA DE DADOS DOS NUMEROS 