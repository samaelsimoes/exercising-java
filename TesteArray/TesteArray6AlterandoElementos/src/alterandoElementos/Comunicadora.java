package alterandoElementos;

import javax.swing.JOptionPane;

public class Comunicadora {

	public void comunicar() {
	
		int [] array = {10,20,30,40,50,60,70,80,90,100,110};
			System.out.printf("%s%8s\n"," Primeira Tabela \n ", " \n  Posi��o   Elementos");

		int a = Integer.parseInt(JOptionPane.showInputDialog("Informe posi��o que deseja modificar:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor que deseja passar:"));
		
		for(int i = 0; i < array.length; i++){
			
			System.out.printf("%5d%8d\n", i, array [ i]);
			
			//int a = Integer.parseInt(JOptionPane.showInputDialog("%5d%8d\n", i, array [ i]));
			
		}
			array [a] = b; // ele est� pegando meu vetor com a tal posi��o que foi pedida e incrementa o valor.
			
		for(int i = 0; i < array.length; i++){
				
				System.out.printf("\n%5d%8d", i, array [ i]);
				
		}
	}
}
