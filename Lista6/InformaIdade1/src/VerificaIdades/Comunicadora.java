package VerificaIdades;

public class Comunicadora {
	
	public void executar() {
		
		String nome;
		
		int sexo, quanti, idade, masculino = 0, feminino = 0;
		double sal, salfe = 0, salmas = 0, acumulaIdade = 0, mediaIdade = 0;
		
		quanti = EntradadeDados. infQuant();
		
		for (int i = 1; i <= quanti;i++){
			
			nome = EntradadeDados.infNome(i);
			sexo = EntradadeDados.infSexo(i, nome);
			sal = EntradadeDados.infSal(nome, i);
			idade = EntradadeDados.infIdade(nome,i);
			
			if (sexo == 1){
				
				masculino ++; // contador
			
				salmas +=  sal; // acumulador
			    
			}else{
				if(sexo == 2){
					
				feminino++; // contador
				
				salfe += sal; // acumulador
				
				}
			}
			acumulaIdade +=  idade; // acumulador
			mediaIdade = acumulaIdade / quanti;
		}		
	    
	    VerificaIdades veri = new VerificaIdades ();
	    veri.calcular(mediaIdade, salmas, salfe, feminino, masculino);
	}
}
