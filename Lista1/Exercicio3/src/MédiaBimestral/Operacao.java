package MédiaBimestral;

import javax.swing.JOptionPane;

public class Operacao {

	public String calcular(double nota1, double nota2, double nota3, String nomealu, int operacao) {
		
		String msg = " "; 
		double dResultado = 0;
		
		switch(operacao){
		
			case 1:
				dResultado = (nota1 + nota2 + nota3) / 3;
				msg = "Aluno:  " + nomealu + ",  está com a média: " + dResultado;
				
			break;
			
			case 2:
				System.exit(0);
			break;
			
			default: 		
				JOptionPane.showMessageDialog(null, " opção Inexistente ","Erro",JOptionPane.OK_CANCEL_OPTION);
			break;
		}
		return (msg) ;
	}
}
