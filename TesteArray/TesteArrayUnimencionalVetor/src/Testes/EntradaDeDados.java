package Testes;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static int infQuantidade() {
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de alunos da sala de aula: "));
		
		return quantidade;
	}
	public static int infQuantidadeNotas() {
		int quantNotas = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de notas por bimestre: "));
		
		return quantNotas;
	}

	public static double infonotas(int i) {
		double nota = Double.parseDouble(JOptionPane.showInputDialog(" Informe nota do" + i + "ª Aluno: \n"));
		
		return nota;
	}

	
}
