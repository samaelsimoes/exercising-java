package VerificaIdades;

import javax.swing.JOptionPane;

public class EntradadeDados {
	
	public static int infQuant() {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de funcionários que deseja Cadastrar: "));
		
		return quantidade;
		
	}

	public static String infNome(int i) {
		
		String nome =(JOptionPane.showInputDialog(i +"ª funcionário, Informe o nome do seu funcionário: "));
		
		return nome;
	}

	public static int infSexo( int i, String nome ) {
		
		int funcionario = Integer.parseInt(JOptionPane.showInputDialog(i + "ª Funcionário:" + nome + " Informe o sexo do Funcionário \n "
				+ "1- para sexo Masculino \n "
				+ "2- para sexo Feminino \n "));
		
		return funcionario;
	}

	public static double infSal(String nome, int i) {
		
		double sal1 = Double.parseDouble(JOptionPane.showInputDialog(" Funcionário: " + nome +", Recebera salário de: R$" ));
		return sal1;
	}

	public static int infIdade(String nome, int i) {
		
		int idadefunc = Integer.parseInt(JOptionPane.showInputDialog(i + "ª, Funcionário: " + nome + ", Informe a idade do funcionário: "));
		return idadefunc;
	}
}
