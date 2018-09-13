package testee;

import java.util.ArrayList;
import java.util.List;

public class Comunicadora {

	public void chamaComunicadorra() {
		
		EntradaDados entra = new EntradaDados();
		
		List < String >  listaTeste = new ArrayList < String > ();
		
		
		
		while ( true){
			
			int a = Integer.parseInt(entra.vaiEvoltaDados("Informe posição que deseja modificar:"));
			int b = Integer.parseInt(entra.vaiEvoltaDados("Informe o valor que deseja passar:"));
	
		}
		
		System.out.printf("%s%8s\n"," Primeira Tabela \n ", " \n  Posição   Coluna");
		
		
	}
}
