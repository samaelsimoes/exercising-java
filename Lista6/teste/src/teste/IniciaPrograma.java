package teste;

import java.util.Random;

public class IniciaPrograma {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int frequencia[] = new int [7];
		
		for(int i =1; i<= 6000; i++){
			
			++frequencia[ 1 + rand.nextInt(6)];
			
			System.out.printf("%s%8s\n", "face", "Frequencia" );
		
		}
		
		for( int face = 1; face < frequencia.length; face++){
			
			System.out.printf("%s%8s\n", face,frequencia[face] );
		}
	}
}
