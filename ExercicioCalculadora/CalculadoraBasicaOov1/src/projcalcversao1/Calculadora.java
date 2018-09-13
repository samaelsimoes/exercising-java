package projcalcversao1;
import javax.swing.JOptionPane; // Importando a classe javax.JOptionpane
public class Calculadora{ //Classe Publica 
	//incio da classe
	public static void main(String[] args){  //ele vai armazenar na memoria  ' metodo main ', Void significa sem retorno n�o tem retorno
		while (true){
			int numero1 = EntradaSaida.infonum1();
			int acao = EntradaSaida.infop();
			int numero2 = EntradaSaida.infonum2();
			String msg = " "; // est� limpando e retornando
			double dResultado = 0; // limpando e retornando
			switch (acao){ //
				case 1:
					dResultado = numero1 + numero2;
					msg= "A soma �: ";
				break;
				case 2:
					dResultado = numero1 - numero2;
					msg= "A subtra��o �: ";					
				break;
				case 3:
					dResultado = numero1 * numero2;
					msg= "A multiplica��o �: ";
				break;	
				case 4:
					if(numero2 !=0){
						dResultado = numero1 / numero2;
						msg = "A divis�o �: ";
					}else{
						dResultado = 9999999999.99999999999;
						msg = "Erro de divis�o por zero ";		
					}
				break;	
				case 5:
						System.exit(0);
				break;
				default:
				JOptionPane.showMessageDialog(null," Op��o Inexistente", " Erro", JOptionPane.OK_CANCEL_OPTION);
				break;
			} // fim da estrutura switch
			EntradaSaida.mostraResultado(msg + dResultado); // ele ira ler a Mensagem + o resultado dos dados.
		}//Fim estrutura while	
	}// terminio do main
}// terminio da classe