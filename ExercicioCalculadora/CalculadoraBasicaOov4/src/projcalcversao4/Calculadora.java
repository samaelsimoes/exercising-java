package projcalcversao4;
import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) { // metodo main com a classe static 
			while (true){// enquanto for verdadeiro
				int numero1 = EntradaSaida.infonum1();
				int numero2 = EntradaSaida.infonum2();
				int acao = EntradaSaida.infop();
				
				String msg = calcular(numero1,numero2,acao);
				EntradaSaida.mostraResultado(msg);// pede pra executa após pucha os dados 
			}
		}
		private static String calcular( int numero1, int numero2, int operacao){
			String mens = " ";
			switch(operacao){// caso
			case 1:
				Soma soma= new Soma( );
				mens=soma.calcular(numero1,numero2);
			break;
			case 2:
				Subtracao sub = new Subtracao( );
				mens = sub.calcular(numero1,numero2);	
			break;
			case 3:
				Multiplicacao multi = new Multiplicacao( );
				mens = multi.calcular(numero1,numero2);
			break;
			case 4:
				Divisao  divi = new Divisao( );
				mens = divi.calcular(numero1,numero2);
			break;
			case 5:
				System.exit(0);
			break;// parada 
			default:
				JOptionPane.showMessageDialog(null," Opção Inexistente","Erro", JOptionPane.OK_CANCEL_OPTION);//
			break;			
			} // termino estrutura caso 
			return mens; // retorna 
		}// metodo calcular
	}	

