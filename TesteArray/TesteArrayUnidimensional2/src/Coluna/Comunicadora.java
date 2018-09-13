package Coluna;

public class Comunicadora {

	public void executar() {
		
	
		int[] array; //Declarei array;
		array = new int[11]; // cria espaço para reservar
		
		System.out.printf("%s%10s \n", " _______", "________ ");
		System.out.printf("%s%10s \n", "|indice "  , " |valores|");
		System.out.printf("%s%10s \n", "|-------", "|--------|");

		for( int i = 0; i<=10; i++){
			
			System.out.printf("|%5d%3s%7d | \n ", i , " |", array[i]);
		}
		System.out.printf("%s%10s \n", "|-------", "|--------|");
	}
}
