package VerificaIdades;

import javax.swing.JOptionPane;

public class EntradadeDados {
	
	public static int infQuant() {
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de funcion�rios que deseja Cadastrar: "));
		
		return quantidade;
		
	}

	public static String infNome(int i) {
		
		String nome =(JOptionPane.showInputDialog(i +"� funcion�rio, Informe o nome do seu funcion�rio: "));
		
		return nome;
	}

	public static int infSexo( int i, String nome ) {
		
		int funcionario = Integer.parseInt(JOptionPane.showInputDialog(i + "� Funcion�rio:" + nome + " Informe o sexo do Funcion�rio \n "
				+ "1- para sexo Masculino \n "
				+ "2- para sexo Feminino \n "));
		
		return funcionario;
	}

	public static double infSal(String nome, int i) {
		
		double sal1 = Double.parseDouble(JOptionPane.showInputDialog(" Funcion�rio: " + nome +", Recebera sal�rio de: R$" ));
		return sal1;
	}

	public static int infIdade(String nome, int i) {
		
		int idadefunc = Integer.parseInt(JOptionPane.showInputDialog(i + "�, Funcion�rio: " + nome + ", Informe a idade do funcion�rio: "));
		return idadefunc;
	}
}
