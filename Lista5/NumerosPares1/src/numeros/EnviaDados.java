package numeros;

public class EnviaDados {
	public void executar() {
		
		int numero = 0;
		int i = 0 ;
	
		for ( i =  100 ; i <= 200; i += 2){
			
			numero = numero + i;
			
			//String mens = " A soma dos pares são " + numero;
			//SaiDados.saindo(" \n " + mens );  aqui seria para mostrar a soma de 1 por vez.
			
		}
		
		String mens = " Soma total é " + numero;
		Saidados.saida(" \n" + mens );
		
	}
}
