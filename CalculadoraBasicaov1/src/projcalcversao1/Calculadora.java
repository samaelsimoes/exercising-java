package projcalcversao1;

import javax.swing.JOptionPane;//Importa a Classe JOptionPane

public class Calculadora {

	public static void main(String[] args) {
		
		
		while (true) {
			/*
			 * Comparativamente ao programa anterior, ao invés de, inicialmente
			 * implementarmos as entradas de dados estamos declarando as variáveis
			 * que, por sua vez, receberão os valores provenientes de suas respectivas
			 * entradas de dados e chamando os métodos que fornecerão os respectivos valores.
			 * Exemplo: 
			 *           int numero1 = EntradaSaida.infonum1()
			 *           Chamamos o método infonum1() que está iimplementado na classe
			 *           EntradaSaida e o valor que este retornar será armanezado na 
			 *           variável numero1.
			 * Observação importante: os métodos desta classe são Estáticos, portanto,
			 *                        para utilizá-los, chamá-los, devemos fazê-lo por
			 *                        meio do nome da classe, no caso, EntradaSaida.
			 *   
			 */
			int numero1=EntradaSaida.infonum1();//Armazena em numero1 o primeiro valor informado pelo usuário 
		    int numero2=EntradaSaida.infonum2();//Armazena em numero2 o segundo valor informado pelo usuário
		    int acao=EntradaSaida.infop();//Armazena em acao a opção de cálculo escolhida pelo usuário
		    //Inicialização das variáveis que fornecerão o resultado do cálculo
		    String msg = " ";
			double dResultado = 0;
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
		    /*
		     * Chama o método mostraResultado(), passando como parâmetro ou argumento
		     * a mensagem com o valor do resultado do cálculo. Como dito anteriormente
		     * Este método agora encontra-se na classe EntradaSaida e este é estático
		     * portanto, deve ser chamado a partir do nome da classe onde encontra-se
		     * implementado.
		     */
			EntradaSaida.mostraResultado(msg + dResultado);
						
		}//Término da estrutura while()

	}//Término do método main

}//Término da Classe
