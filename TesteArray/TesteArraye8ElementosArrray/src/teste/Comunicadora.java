package teste;

import javax.swing.JOptionPane;

public class Comunicadora {
// aqui estou pedindo para informar a quantidade de informação para armazenar 
	public void chamaComunicadora() {
		
		int quant = 0, informa = 0;
		
		informa = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n \n"
				+ "1- Para Iniciar o programa: \n"
				+ "2- Sair do programa"));
		
		while (true){
			
			if(informa == 1){
				
				quant = Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade de números que deseja armazenar:"));
				
				iniciaArray(quant);
				
			}else{
				
				System.exit(0);
				break; // criar um if para prosseguir 
				
			}
		}
}
	private void iniciaArray(int quantidade) {
		
		int[] array = new int[quantidade];
		
		System.out.printf("%s%8s\n"," \n Primeira Tabela \n ", "\nPosição   Elementos");
		
		for( int i = 0; i < array.length; i++){
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe" + "i+1 " + " º o número que deseja armazenar:"));
			array[i] = numero;
		}
		
		for(int i = 0; i < array.length; i++){
		
			System.out.printf("%5d%8d\n", i, array [ i ]);
		
		//int a = Integer.parseInt(JOptionPane.showInputDialog("%5d%8d\n", i, array [ i]));
		
		}
		int a = Integer.parseInt(JOptionPane.showInputDialog("Informe posição que deseja modificar:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que deseja passar:"));
		
			array [a] = b ; // ele está pegando meu vetor com a tal posição que foi pedida e incrementa o valor.
		
		for(int i = 0; i < array.length; i++){
			
			System.out.printf("\n%5d%8d", i, array [ i ]);
			
		}		
	}		
}