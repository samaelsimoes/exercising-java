package Teste3;

public class Comunicadora {

	public void comunicar() {

		int [] umArray = {10,20,30,40,50};
		
		System.out.printf("%s%8s\n","  Posição ","Elementos");
		
		for( int contador = 0;  contador < umArray.length; contador++){
			System.out.printf("%5d%8d\n", contador, umArray [ contador]);
		}
	}
}
