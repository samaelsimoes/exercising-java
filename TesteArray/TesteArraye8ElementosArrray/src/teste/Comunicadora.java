package teste;

import javax.swing.JOptionPane;

public class Comunicadora {
// aqui estou pedindo para informar a quantidade de informa��o para armazenar 
	public void chamaComunicadora() {
		
		int quant = 0, informa = 0;
		
		informa = Integer.parseInt(JOptionPane.showInputDialog("Escolha: \n \n"
				+ "1- Para Iniciar o programa: \n"
				+ "2- Sair do programa"));
		
		while (true){
			
			if(informa == 1){
				
				quant = Integer.parseInt(JOptionPane.showInputDialog("Informe quantidade de n�meros que deseja armazenar:"));
				
				iniciaArray(quant);
				
			}else{
				
				System.exit(0);
				break; // criar um if para prosseguir 
				
			}
		}
}
	private void iniciaArray(int quantidade) {
		
		int[] array = new int[quantidade];
		
		System.out.printf("%s%8s\n"," \n Primeira Tabela \n ", "\nPosi��o   Elementos");
		
		for( int i = 0; i < array.length; i++){
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe" + "i+1 " + " � o n�mero que deseja armazenar:"));
			array[i] = numero;
		}
		
		for(int i = 0; i < array.length; i++){
		
			System.out.printf("%5d%8d\n", i, array [ i ]);
		
		//int a = Integer.parseInt(JOptionPane.showInputDialog("%5d%8d\n", i, array [ i]));
		
		}
		int a = Integer.parseInt(JOptionPane.showInputDialog("Informe posi��o que deseja modificar:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que deseja passar:"));
		
			array [a] = b ; // ele est� pegando meu vetor com a tal posi��o que foi pedida e incrementa o valor.
		
		for(int i = 0; i < array.length; i++){
			
			System.out.printf("\n%5d%8d", i, array [ i ]);
			
		}		
	}		
}