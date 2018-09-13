package CalculamediaAulo;

import javax.swing.JOptionPane;

public class Controle {

	public String calcular(double nota1, double nota2,double nota3, int opcao, String nome) {
		
		String mens = " ";
		
		switch (opcao){
		
		case 1:
			
			ControleNota calcula = new ControleNota();
			mens = calcula.calcular(nota1,nota2,nota3, nome);
						
		break;
		case 2:
			
			System.exit(0);
		
		break;
		default:
			JOptionPane.showMessageDialog(null, "Opção Inexistente", "Erro", JOptionPane.OK_CANCEL_OPTION);
		
		break;	
		
		}
		return mens;
	}
}


	


