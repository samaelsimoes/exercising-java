package pesquisa;

import javax.swing.JOptionPane;

public class EntradaDeDados {

	public static int infNumFamilias() {
		
		int familias = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de Familias  para Iniciar a pesquisa: "));
		
		return familias;
	}

	public static double infSalario(int i) {
		
		double Salario = Double.parseDouble(JOptionPane.showInputDialog(" Informe o Sal�rio da: " + i + "� Familia: R$ "));
		
		return Salario;
	}

	public static int infNuFilhos(int i) {
		int familias = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de filhos da " + i + "� F�milia:"));
		
		return familias;
		
	}
}
