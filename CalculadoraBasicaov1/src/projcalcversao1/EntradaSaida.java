package projcalcversao1;
import javax.swing.JOptionPane;
public class EntradaSaida {
	//M�todo para entrada de dados do primeiro n�mero
	static int infonum1(){
		int num1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro n�mero : "));
		return num1;//Retorna o n�mero informado pelo usu�rio
	}
   //M�todo para entrada de dados do segundo n�mero
	static int infonum2(){
		int num2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo n�mero : "));
		return num2;//Retorna o n�mero informado pelo usu�rio
	}
	//M�todo para entrada de dados da op��o de c�lculo
	static int infop(){
		
		int op = Integer.parseInt(JOptionPane
				.showInputDialog("Escolha um c�lculo b�sico : \n"
						+ "1 - Soma \n"
						+ "2 - Subtra��o \n"
						+ "3 - Multiplica��o \n" 
						+ "4 - Divis�o \n"
						+ "5 - Sair do programa \n"));	
		
		return op;//Retorna a op��o escolhida
		
	}
	//M�todo para mostrar o resultado. Este n�o retorna nada.
	static void mostraResultado(String recmsgdresult){
	   	 
   	    JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION); 
	}
}//T�rmino da Classe
