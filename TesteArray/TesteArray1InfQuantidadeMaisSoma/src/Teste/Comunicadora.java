package Teste;

import java.util.Arrays;
import java.util.Scanner;

public class Comunicadora {

	public void executar() {
		
		int soma=0;
		Scanner in = new Scanner(System.in);
		
		int quantidade = EntradaDados.infquant();
		
		int[] valores = new int[quantidade]; // array
		
		for( int i = 0; i < quantidade; i++){
			
			System.out.printf("Digite os números a serem armazenados [%d]: ", i+1);
			valores[i] = in.nextInt();
		}
		System.out.println(Arrays.toString(valores));
		
		for( int i =0; i < quantidade; i++){
			
			soma += valores[i];
			System.out.printf(" %s%8s\n"," Resultado: ", soma);
		}
		//SaidadeDados.saida(soma);
	} 
}