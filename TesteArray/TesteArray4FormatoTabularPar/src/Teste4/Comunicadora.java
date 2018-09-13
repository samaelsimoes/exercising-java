package Teste4;

public class Comunicadora {

	public void comunicar() {
		
		final int umArray = 10; // declara o array
		int [] array = new int [ umArray]; // cria o array 
		
		System.out.printf( "%s%8s\n", "Index", " Value" );
		
		for(int i = 0; i < array.length; i++){
			array [i] = 2 + 2 * i;
			
		}
		
		for(int i = 0; i < array.length; i++){
			
			System.out.printf("%5d%8d\n", i, array[i]);
		}
	}
}
