package calcula;

public class Comunica {
	
	public void executar() {
		
		String nomefun = " ";
		double totmas = 0, totfe = 0, media1 = 0,media2 = 0, salfunc = 0;
		int func = 0, masculino = 0, feminino = 0, sexo = 0;
		
		while ( func <= 4 ){
			
			func = func + 1;
			
			nomefun = InformaDados.infNome(func);
			sexo = InformaDados.infSexFunc(func, nomefun);
			salfunc = InformaDados.infsal(nomefun);
									
			if ( sexo == 1){
				
				masculino++; // contador
				
				totmas +=  salfunc; // acumuladora
				media1 = totmas / masculino; 
				
			}else{
				if(sexo == 2){
					
					feminino++; // contador
					
					totfe += salfunc; // acumulador
					//media2 = totfe / feminino;
				}
			}
		}	
		
		String mens = " Total de Funcionários masculinos: " + masculino + " \n"
				+ " Total de Funcionários femininos: " + feminino + " \n \n"
				+ " Média do salário masculino é de: R$ " + media1 + " \n"
				+ " Média do salário feminino é de R$ " + media2 + " \n  \n";
		
		SaidaDeDados.dados(mens);
		// aqui temos que acumular o total de sexo masculino e feminino
		// aqui temos que acumular o total de salários feminino e masculino
		// tem que retorna tudo para ca
		// após isso fazer sair  por aqui só puxando os dados de cada um .
		
		
	}
}
