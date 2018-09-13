package Calcula;

import javax.swing.JOptionPane;

public class Verificadora {

	public String calcular(int opcao) {
		String mens = " ";
		switch ( opcao ){
			case 1 :
				
				DadosRetangulo dados = new DadosRetangulo(); // Calculo do Retângulo;
				dados.calretangulo(); // Metodo sem retorno;
				
				mens = "Você escolheu o Calculo do Retângulo ! ";
				
			break;
			case 2:
				
				DadosTriangulo dados1 = new DadosTriangulo();
				dados1.caltriangulo();
				
				mens = "Você escolheu  Calculo do Triângulo ! ";
				
			break;
			case 3:
				
				DadosCirculo dados2 = new DadosCirculo();
				dados2.calcirculo();
				
				mens = "Você escolheu Calculo do Círculo ! ";
				
			break;
			case 4:
				
				DadosQuadrado dado3 = new DadosQuadrado();
				dado3.calqualdrado();
				
				mens = "Você escolheu Calculo do quadrado ! ";
								
			break;
			case 5:
				
				DadosTrapezio dado4 = new DadosTrapezio();
				dado4.caltrapezio();
				
				mens = "Você escolheu Calculo do trapézio !";
				
			break;
			case 6:
				
				System.exit(0);
				
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			
			break;	
		}
		return mens;
	}
}
