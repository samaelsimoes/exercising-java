import javax.swing.JOptionPane;

public class Calculadora { // inicio da classe calculadora
	// Parte interna da classe
	public static void main(String[] args) { // Inicio do M�todo Main, Classe
		// TODO Auto-generated method stub
		// escrevemos todo o c�digo principal aqui
		String msg = " ";  //  limpa a v�riavel caracter ap�s for ser utilizada 
		double dResultado = 0; //  limpa a v�riavel inteiro ap�s for ser utilizada
		while (true){ // Enquanto For verdadeiro
				int numero1 = Integer.parseInt(JOptionPane // Integer = > Classe , parseInt => Metodo, JOptionPane => Classe
						.showInputDialog("informe o primeiro N�mero: "));
				int acao = Integer.parseInt(JOptionPane	
						.showInputDialog("Escolha um Calculo B�sico: \n"
									+ "1 - Soma \n"
									+ "2 - Subtra��o \n"
									+ "3 - Multiplica��o \n"
									+ "4 - Divis�o \n"
									+ "5 - Sair do programa \n"));	
				int numero2 = Integer.parseInt(JOptionPane
						.showInputDialog("informe o segundo N�mero: "));
				switch (acao){ // escolha
				case 1:  // caso          
					dResultado = numero1+numero2; // dResultado = > variavel
					msg = "O Resultado da soma �:";    
				break; // se for o caso 1 ele ira vir at� aqui e ira parar e ira voltar para digitar um n�mero e escolher a op��o
				case 2:
					dResultado = numero1-numero2;
					msg = " O Resultado da subtra��o �: ";
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg = " O Resultado da multiplica��o �: ";
				break;					
				case 4:
					if(numero2 != 0){// se numero2 != ' diferente que' 0
						dResultado = numero1 / numero2;
						msg = " O Resultado da Divis�o �: ";	
					}else{
						 dResultado = 999999999.999999999; // erro � se um n�mero for divisivel por 0 ex: 8 / 0 error para a calculadora                                 
						 msg="Erro de divis�o por zero"; 
					}	
				break;	
				case 5:
					 System.exit(0);
				break;	
				default:       JOptionPane.showMessageDialog(null, "Op��o"
						+ 	"Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);          
				break;
				} // Terminio da estrutura switch
				mostraResultado(msg+dResultado);
		}	//Terminio da Estrutura While " Enquanto for verdadeiro						
	} // Terminio do Metodo main
		static void mostraResultado(String recmsgdresult){								//Quando apertamos ok ele cancela 'fecha' o programa
			JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);// imprimindo resultado.
		}
} // T�rminio Da classe calculadora
