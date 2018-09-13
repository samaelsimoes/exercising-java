package pesquisa;

public class Comunicadora {

	public void executar() {
		
		int numFamilias = 0, filhos = 0, salmenor = 0;
		double salario = 0, TotSal = 0, MediaSal = 0, MediaFilhos = 0, salmaior = 0, porcentagem = 0, TotFilhos = 0;
		
		numFamilias = EntradaDeDados.infNumFamilias();
		
		for(int i = 1; i <= numFamilias; i++ ){
			
			
			salario = EntradaDeDados.infSalario(i);
			filhos = EntradaDeDados.infNuFilhos(i);
			
			TotSal = TotSal + salario;  // acumuladosr.
			TotFilhos = TotFilhos + filhos; // acumulador.
			
			if( salario <= 150 ){
				
				//System.out.println("entrou");   teste de mesa.... 
				salmenor++;
				
				//System.out.println(salmenor);
				
				porcentagem =( salmenor * 100) / numFamilias;
				
				//System.out.println(porcentagem);
			}else{
					salmaior = salario;
			}
		}
		
		Calcular cal = new Calcular();
		MediaSal = cal.mediaSal(TotSal, numFamilias);
		MediaFilhos = cal.mediaFilhos(TotFilhos, numFamilias);
		
		String mens = " O Percentual de pessoas com sal�rio menor que 150 � de: " + porcentagem + " \n" 
		+ " O maior Sal�rio dos habitantes � de: R$ " + salmaior + " \n"
		+ " M�dia de sal�rio da popula��o � de: R$ " + MediaSal  + " \n"
		+ " M�dia do n�mero de filhos � de: " + MediaFilhos;
		
		SaidaDeDados.saidados(mens);
	}		
}

// Quantidade de habitantes para cadastrar // contador
// Total de filhos // acumulador
// Total do sal�rio // acumulador

// M�dia do sal�rio por habitante ok 
// M�dia de numero de filhos por habitnte ok 
// Maior sal�rio ok 
// Percentual de pessoas com sal�rio menor que 150. ok