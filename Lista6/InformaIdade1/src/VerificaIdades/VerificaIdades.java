package VerificaIdades;

public class VerificaIdades {

	public void calcular(double mediaIdade, double salmas, double salfe,  int feminino, int masculino) {
		
		if ( mediaIdade <= 25){
			
			String mens = " A equipe � Jovem, com a m�dia de idade de: " + mediaIdade + " \n"
					+ " \n" + " A m�dia do sal�rio masculino � de R$: " + salmas + " \n"
					+ " \n" + " A m�dia do sal�rio feminino � de R$: "+ salfe + " \n "
					+ " \n " 
					+ " Total de funcion�rios Homens � de: "+ masculino + " \n"
					+ " Total de Funcion�rios Mulheres � de: "+ feminino + " \n";
			
					SaidaDeDados.dados(mens);
		
		}else{
			if ( mediaIdade <= 60){
				
				String mens = " A equipe � Adulta, com a m�dia de idade de: " + mediaIdade + " \n "
						+ " \n " + " A m�dia do sal�rio masculino � de R$: " + salmas+ " \n "
						+ " \n " + " A m�dia do sal�rio feminino � de R$: " + salfe
						+ " \n "
						+ " Total de funcion�rios homens � de: " + masculino + " \n"
						+ " Total de Funcion�rios Mulheres � de: " + feminino + " \n";
				
						SaidaDeDados.dados(mens);
			}else{
				if( mediaIdade >= 61){
					
					String mens = " A equipe � Idosa, com a m�dia de idade de: " + mediaIdade + " \n"
							+ " \n " + " A m�dia do sal�rio masculino � de R$: " + salmas + " \n"
							+ " \n " + " A m�dia do sal�rio feminino � de R$: " + salfe
							+ " \n "
							+ " Total de funcion�rios homens � de: " + masculino + " \n"
							+ " Total de Funcion�rios Mulheres � de: " + feminino + " \n";
							SaidaDeDados.dados(mens);
				}
			}
		}
	}	
}
