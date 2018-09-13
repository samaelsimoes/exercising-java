package projcalcversao1;
import javax.swing.JOptionPane; // Importando a classe javax.JOptionpane
public class Calculadora{ //Classe Publica 
	//incio da classe
	public static void main(String[] args){  //ele vai armazenar na memoria  ' metodo main ', Void significa sem retorno não tem retorno
		while (true){
			int numero1 = EntradaSaida.infonum1();
			int acao = EntradaSaida.infop();
			int numero2 = EntradaSaida.infonum2();
			String msg = " "; // está limpando e retornando
			double dResultado = 0; // limpando e retornando
			switch (acao){ //
				case 1:
					dResultado = numero1 + numero2;
					msg= "A soma é: ";
				break;
				case 2:
					dResultado = numero1 - numero2;
					msg= "A subtração é: ";					
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg= "A multiplicação é: ";
				break;	
				case 4:
					if(numero2 !=0){
						dResultado = numero1 / numero2;
						msg = "A divisão é: ";
					}else{
						dResultado = 9999999999.99999999999;
						msg = "Erro de divisão por zero ";		
					}
				break;	
				case 5:
						System.exit(0);
				break;
				default:
				JOptionPane.showMessageDialog(null," Opção Inexistente", " Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			} // fim da estrutura switch
			EntradaSaida.mostraResultado(msg + dResultado); // ele ira ler a Mensagem + o resultado dos dados.
		}//Fim estrutura while	
	}// terminio do main
}// terminio da classe