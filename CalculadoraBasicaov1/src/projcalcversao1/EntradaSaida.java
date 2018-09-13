package projcalcversao1;
import javax.swing.JOptionPane;
public class EntradaSaida {
	//Método para entrada de dados do primeiro número
	static int infonum1(){
		int num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro número : "));
		return num1;//Retorna o número informado pelo usuário
	}
   //Método para entrada de dados do segundo número
	static int infonum2(){
		int num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo número : "));
		return num2;//Retorna o número informado pelo usuário
	}
	//Método para entrada de dados da opção de cálculo
	static int infop(){
		
		int op = Integer.parseInt(JOptionPane
				.showInputDialog("Escolha um cálculo básico : \n"
						+ "1 - Soma \n"
						+ "2 - Subtração \n"
						+ "3 - Multiplicação \n" 
						+ "4 - Divisão \n"
						+ "5 - Sair do programa \n"));	
		
		return op;//Retorna a opção escolhida
		
	}
	//Método para mostrar o resultado. Este não retorna nada.
	static void mostraResultado(String recmsgdresult){
	   	 
   	    JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION); 
	}
}//Término da Classe
