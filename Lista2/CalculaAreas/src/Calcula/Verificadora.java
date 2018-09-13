package Calcula;

import javax.swing.JOptionPane;

public class Verificadora {

	public String calcular(int opcao) {
		String mens = " ";
		switch ( opcao ){
			case 1 :
				
				DadosRetangulo dados = new DadosRetangulo(); // Calculo do Ret�ngulo;
				dados.calretangulo(); // Metodo sem retorno;
				
				mens = "Voc� escolheu o Calculo do Ret�ngulo ! ";
				
			break;
			case 2:
				
				DadosTriangulo dados1 = new DadosTriangulo();
				dados1.caltriangulo();
				
				mens = "Voc� escolheu  Calculo do Tri�ngulo ! ";
				
			break;
			case 3:
				
				DadosCirculo dados2 = new DadosCirculo();
				dados2.calcirculo();
				
				mens = "Voc� escolheu Calculo do C�rculo ! ";
				
			break;
			case 4:
				
				DadosQuadrado dado3 = new DadosQuadrado();
				dado3.calqualdrado();
				
				mens = "Voc� escolheu Calculo do quadrado ! ";
								
			break;
			case 5:
				
				DadosTrapezio dado4 = new DadosTrapezio();
				dado4.caltrapezio();
				
				mens = "Voc� escolheu Calculo do trap�zio !";
				
			break;
			case 6:
				
				System.exit(0);
				
			break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
			
			break;	
		}
		return mens;
	}
}
