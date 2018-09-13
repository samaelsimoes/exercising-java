package teste;

import java.io.PrintStream;

public class Comunicadora {

	public void executar() {
		
		int[] array; //Declarei array;
		array = new int[11]; // cria espaço para reservar
		
		for( int i =0; i<=10; i++){
			
			System.out.printf("%5d%7d \n", i , array[i]);
			
		}
	}
}
// array = new int[10]; array que foi criado e de 11 unidades, 0 a 10..
//Printf imprima formatado
//System.out.printf serve para impri em forma formatada
//estamos recebendo números inteiros e esse numeros inteiros podem ter ate 5 casas  por isso %5d
// estamos recebendou outro numero inteiros e esse numero pode receber ate 7 elementos