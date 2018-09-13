
/*
 * Importando a classe JOptionPane para utilizar os painéis de diálogo.
 */
import javax.swing.JOptionPane;
public class Calculadora {//Início da classe Calculadora

	public static void main(String[] args) {//Início do método main
		/*
		 * Enquanto a execução da estrutura não for interrrompida,
		 * solicite as entradas de dados para os primeiro e segundo números, como também,
		 * mostre a opções de operações que pode realizar para, também, escolha.
		 * Quando clicar no botão Cancelar ou na opção de Sair do programa,
		 * que ainda não foi programada, esta estrutura será interrompida.
		 * 
		 */
		while (true) {
			  
			int numero1 = Integer.parseInt(JOptionPane
					.showInputDialog("Informe o primeiro número : "));
			
			int numero2 = Integer.parseInt(JOptionPane
					.showInputDialog("Informe o segundo número: "));
			
			int acao = Integer.parseInt(JOptionPane
					.showInputDialog("Escolha um cálculo básico : \n"
							+ "1 - Soma \n"
							+ "2 - Subtração \n"
							+ "3 - Multiplicação \n" 
							+ "4 - Divisão \n"
							+ "5 - Sair do programa \n"));
			 
			 /*
			  * A cada execução da estrutura inicializamos as variáveis msg e dResultado
			  * respectivamente para garantir que estas são responsáveis pelos resultados
			  * finais processados a cada execução.
			  */
			 String msg = " ";
			
			 double dResultado = 0;
			 /*
			   * Escolhe uma opção do menu que, por sua vez, chama uma função(método),
			   * a ser executado.Depois que esta função é executada o programa é retornado para o menu
			   * em execução, automaticamente.
			   */
			  switch (acao) {
				
				case 1:
					   
					    dResultado = numero1+numero2;
				        msg = "A soma é:";
					break;
				case 2:
					dResultado = numero1-numero2;
			        msg = "A subtração é:";
					break;
				case 3:
					dResultado = numero1*numero2;
			        msg = "A multiplicação é:";
					break;
				case 4:
					
			        if(numero2 != 0)
                   {
                	    dResultado = numero1/numero2;
                	    msg = "A divisão é:";
                   }else{
                	      dResultado = 999999999.999999999;
                	      msg="Erro de divisião por zero";
                        }

					break;
				case 5:
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
					
					break;
				}
		mostraResultado(msg + dResultado);
						
		}//Término da estrutura while()
	
	}//Término do método main
	
	static void mostraResultado(String recmsgdresult){
   	 
   	    JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION); 
   		
	}
}//Término da classe Calculadora
		
		
		
		
		
		
		
		
		
		
		
			
			