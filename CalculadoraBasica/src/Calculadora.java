
/*
 * Importando a classe JOptionPane para utilizar os pain�is de di�logo.
 */
import javax.swing.JOptionPane;
public class Calculadora {//In�cio da classe Calculadora

	public static void main(String[] args) {//In�cio do m�todo main
		/*
		 * Enquanto a execu��o da estrutura n�o for interrrompida,
		 * solicite as entradas de dados para os primeiro e segundo n�meros, como tamb�m,
		 * mostre a op��es de opera��es que pode realizar para, tamb�m, escolha.
		 * Quando clicar no bot�o Cancelar ou na op��o de Sair do programa,
		 * que ainda n�o foi programada, esta estrutura ser� interrompida.
		 * 
		 */
		while (true) {
			  
			int numero1 = Integer.parseInt(JOptionPane
					.showInputDialog("Informe o primeiro n�mero : "));
			
			int numero2 = Integer.parseInt(JOptionPane
					.showInputDialog("Informe o segundo n�mero: "));
			
			int acao = Integer.parseInt(JOptionPane
					.showInputDialog("Escolha um c�lculo b�sico : \n"
							+ "1 - Soma \n"
							+ "2 - Subtra��o \n"
							+ "3 - Multiplica��o \n" 
							+ "4 - Divis�o \n"
							+ "5 - Sair do programa \n"));
			 
			 /*
			  * A cada execu��o da estrutura inicializamos as vari�veis msg e dResultado
			  * respectivamente para garantir que estas s�o respons�veis pelos resultados
			  * finais processados a cada execu��o.
			  */
			 String msg = " ";
			
			 double dResultado = 0;
			 /*
			   * Escolhe uma op��o do menu que, por sua vez, chama uma fun��o(m�todo),
			   * a ser executado.Depois que esta fun��o � executada o programa � retornado para o menu
			   * em execu��o, automaticamente.
			   */
			  switch (acao) {
				
				case 1:
					   
					    dResultado = numero1+numero2;
				        msg = "A soma �:";
					break;
				case 2:
					dResultado = numero1-numero2;
			        msg = "A subtra��o �:";
					break;
				case 3:
					dResultado = numero1*numero2;
			        msg = "A multiplica��o �:";
					break;
				case 4:
					
			        if(numero2 != 0)
                   {
                	    dResultado = numero1/numero2;
                	    msg = "A divis�o �:";
                   }else{
                	      dResultado = 999999999.999999999;
                	      msg="Erro de divisi�o por zero";
                        }

					break;
				case 5:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Op��o Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
					
					break;
				}
		mostraResultado(msg + dResultado);
						
		}//T�rmino da estrutura while()
	
	}//T�rmino do m�todo main
	
	static void mostraResultado(String recmsgdresult){
   	 
   	    JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION); 
   		
	}
}//T�rmino da classe Calculadora
		
		
		
		
		
		
		
		
		
		
		
			
			