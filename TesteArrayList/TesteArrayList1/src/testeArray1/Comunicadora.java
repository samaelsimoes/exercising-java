package testeArray1;

import java.util.ArrayList;

public class Comunicadora {

	public void iniciaMetodo() {
		
		EntradaDados entra = new EntradaDados();
		String nome = " ";
		
		ArrayList <String> list = new ArrayList <String> (); // criei meu ArrayList do tipo string
		
		while ( true){
			
			int opcao = Integer.parseInt(entra.chamaNome("Informe a op��o desejada \n"
					+ "1- Inserir os nomes dos Funcion�rios \n"
					+ "2- Sair do programa "));
			
			if(opcao == 1){
			
				list.add(nome = entra.chamaNome("Favor informar o nome"));
				
			}else{
				
				break;
			
			}
			
			//break;
		}
		for (int i = 0; i < list.size(); i++) {
			
			entra.saiDados(list.get(i));
		}
	}
}