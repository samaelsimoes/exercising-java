package projcalcversao1;

import javax.swing.JOptionPane;//Importa a Classe JOptionPane

public class Calculadora {

	public static void main(String[] args) {
		
		
		while (true) {
			/*
			 * Comparativamente ao programa anterior, ao inv�s de, inicialmente
			 * implementarmos as entradas de dados estamos declarando as vari�veis
			 * que, por sua vez, receber�o os valores provenientes de suas respectivas
			 * entradas de dados e chamando os m�todos que fornecer�o os respectivos valores.
			 * Exemplo: 
			 *           int numero1 = EntradaSaida.infonum1()
			 *           Chamamos o m�todo infonum1() que est� iimplementado na classe
			 *           EntradaSaida e o valor que este retornar ser� armanezado na 
			 *           vari�vel numero1.
			 * Observa��o importante: os m�todos desta classe s�o Est�ticos, portanto,
			 *                        para utiliz�-los, cham�-los, devemos faz�-lo por
			 *                        meio do nome da classe, no caso, EntradaSaida.
			 *   
			 */
			int numero1=EntradaSaida.infonum1();//Armazena em numero1 o primeiro valor informado pelo usu�rio 
		    int numero2=EntradaSaida.infonum2();//Armazena em numero2 o segundo valor informado pelo usu�rio
		    int acao=EntradaSaida.infop();//Armazena em acao a op��o de c�lculo escolhida pelo usu�rio
		    //Inicializa��o das vari�veis que fornecer�o o resultado do c�lculo
		    String msg = " ";
			double dResultado = 0;
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
		    /*
		     * Chama o m�todo mostraResultado(), passando como par�metro ou argumento
		     * a mensagem com o valor do resultado do c�lculo. Como dito anteriormente
		     * Este m�todo agora encontra-se na classe EntradaSaida e este � est�tico
		     * portanto, deve ser chamado a partir do nome da classe onde encontra-se
		     * implementado.
		     */
			EntradaSaida.mostraResultado(msg + dResultado);
						
		}//T�rmino da estrutura while()

	}//T�rmino do m�todo main

}//T�rmino da Classe
