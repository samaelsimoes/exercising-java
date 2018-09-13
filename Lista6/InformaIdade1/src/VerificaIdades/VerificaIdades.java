package VerificaIdades;

public class VerificaIdades {

	public void calcular(double mediaIdade, double salmas, double salfe,  int feminino, int masculino) {
		
		if ( mediaIdade <= 25){
			
			String mens = " A equipe é Jovem, com a média de idade de: " + mediaIdade + " \n"
					+ " \n" + " A média do salário masculino é de R$: " + salmas + " \n"
					+ " \n" + " A média do salário feminino é de R$: "+ salfe + " \n "
					+ " \n " 
					+ " Total de funcionários Homens é de: "+ masculino + " \n"
					+ " Total de Funcionários Mulheres é de: "+ feminino + " \n";
			
					SaidaDeDados.dados(mens);
		
		}else{
			if ( mediaIdade <= 60){
				
				String mens = " A equipe é Adulta, com a média de idade de: " + mediaIdade + " \n "
						+ " \n " + " A média do salário masculino é de R$: " + salmas+ " \n "
						+ " \n " + " A média do salário feminino é de R$: " + salfe
						+ " \n "
						+ " Total de funcionários homens é de: " + masculino + " \n"
						+ " Total de Funcionários Mulheres é de: " + feminino + " \n";
				
						SaidaDeDados.dados(mens);
			}else{
				if( mediaIdade >= 61){
					
					String mens = " A equipe é Idosa, com a média de idade de: " + mediaIdade + " \n"
							+ " \n " + " A média do salário masculino é de R$: " + salmas + " \n"
							+ " \n " + " A média do salário feminino é de R$: " + salfe
							+ " \n "
							+ " Total de funcionários homens é de: " + masculino + " \n"
							+ " Total de Funcionários Mulheres é de: " + feminino + " \n";
							SaidaDeDados.dados(mens);
				}
			}
		}
	}	
}
