package testeArrayList3;

import java.util.ArrayList;
import java.util.List;


public class Comunicadora {

	String nome = " ";
	
	public void iniciaPrograma() {
		
		EntradaDados entra = new EntradaDados();
		
		List < String >  listaTeste = new ArrayList < String > ();
		
		while ( true){
			
			int opcao = Integer.parseInt(entra.chamaNome("Informe a opção desejada \n "
					+ "\n 1- Inserir os nomes dos Funcionários: \n"
					+ " 2- Sair do programa:  \n"));
			
			if(opcao == 1){
			
				listaTeste.add(nome = entra.chamaNome("Favor informar o nome"));
			
			}else{
				
				break;
			
			}
		}
		
		for( String list : listaTeste){
			// list é um novo objeto, que eu criei do tipo String
			entra.saiDados(list);
		}
	}
}
