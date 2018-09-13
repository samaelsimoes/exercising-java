package Elementos;

public class Comunicadora {

	public void comunicar() {
		
		int [] array = { 10,20,30,40,50,60,70,80,90,100};
		int total =0;
		
		for (int i =0; i < array.length; i++){
			
			total += array [i];
			
			System.out.printf(" Total da soma dos elementos é: %d\n", total);
			
		}
	}
}
 
