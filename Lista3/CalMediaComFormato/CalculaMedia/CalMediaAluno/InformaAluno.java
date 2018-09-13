package CalMediaAluno;

import javax.swing.JOptionPane;

public class InformaAluno {

	public static String infAluno() {

		String aluno = (JOptionPane.showInputDialog(" Digite o nome do aluno: "));
		
		return aluno;
	}
}
