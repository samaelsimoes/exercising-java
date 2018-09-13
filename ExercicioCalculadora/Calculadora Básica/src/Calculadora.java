import javax.swing.JOptionPane;

public class Calculadora { // inicio da classe calculadora
	// Parte interna da classe
	public static void main(String[] args) { // Inicio do Método Main, Classe
		// TODO Auto-generated method stub
		// escrevemos todo o código principal aqui
		String msg = " ";  //  limpa a váriavel caracter após for ser utilizada 
		double dResultado = 0; //  limpa a váriavel inteiro após for ser utilizada
		while (true){ // Enquanto For verdadeiro
				int numero1 = Integer.parseInt(JOptionPane // Integer = > Classe , parseInt => Metodo, JOptionPane => Classe
						.showInputDialog("informe o primeiro Número: "));
				int acao = Integer.parseInt(JOptionPane	
						.showInputDialog("Escolha um Calculo Básico: \n"
									+ "1 - Soma \n"
									+ "2 - Subtração \n"
									+ "3 - Multiplicação \n"
									+ "4 - Divisão \n"
									+ "5 - Sair do programa \n"));	
				int numero2 = Integer.parseInt(JOptionPane
						.showInputDialog("informe o segundo Número: "));
				switch (acao){ // escolha
				case 1:  // caso          
					dResultado = numero1+numero2; // dResultado = > variavel
					msg = "O Resultado da soma é:";    
				break; // se for o caso 1 ele ira vir até aqui e ira parar e ira voltar para digitar um número e escolher a opção
				case 2:
					dResultado = numero1-numero2;
					msg = " O Resultado da subtração é: ";
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg = " O Resultado da multiplicação é: ";
				break;					
				case 4:
					if(numero2 != 0){// se numero2 != ' diferente que' 0
						dResultado = numero1 / numero2;
						msg = " O Resultado da Divisão é: ";	
					}else{
						 dResultado = 999999999.999999999; // erro é se um número for divisivel por 0 ex: 8 / 0 error para a calculadora                                 
						 msg="Erro de divisão por zero"; 
					}	
				break;	
				case 5:
					 System.exit(0);
				break;	
				default:       JOptionPane.showMessageDialog(null, "Opção"
						+ 	"Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);          
				break;
				} // Terminio da estrutura switch
				mostraResultado(msg+dResultado);
		}	//Terminio da Estrutura While " Enquanto for verdadeiro						
	} // Terminio do Metodo main
		static void mostraResultado(String recmsgdresult){								//Quando apertamos ok ele cancela 'fecha' o programa
			JOptionPane.showMessageDialog(null, recmsgdresult, "Resultado", JOptionPane.OK_CANCEL_OPTION);// imprimindo resultado.
		}
} // Términio Da classe calculadora
