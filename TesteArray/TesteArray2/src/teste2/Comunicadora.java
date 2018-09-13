package teste2;

public class Comunicadora {

	public void comunicar() {
		
		int [] umArray; // declarei a variavel do meu array como inteiro
		umArray = new int [10]; // criando o objeto do array + a quantidade de linhas 
		
		System.out.printf("%s%8s\n","  Linhas |","Colunas");
		
		for( int counter =0; counter < umArray.length; counter++){
			System.out.printf("%5d%8d\n",counter,umArray[counter]);
		}
		
	}
}
