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
		
		String mens = " O Percentual de pessoas com salário menor que 150 é de: " + porcentagem + " \n" 
		+ " O maior Salário dos habitantes é de: R$ " + salmaior + " \n"
		+ " Média de salário da população é de: R$ " + MediaSal  + " \n"
		+ " Média do número de filhos é de: " + MediaFilhos;
		
		SaidaDeDados.saidados(mens);
	}		
}

// Quantidade de habitantes para cadastrar // contador
// Total de filhos // acumulador
// Total do salário // acumulador

// Média do salário por habitante ok 
// Média de numero de filhos por habitnte ok 
// Maior salário ok 
// Percentual de pessoas com salário menor que 150. ok