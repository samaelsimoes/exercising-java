package calcula;

import javax.swing.JOptionPane;

public class InformaDados {

	public static String infNome(int func) {
		
		String funcionario = (JOptionPane.showInputDialog("Informe o nome do: " + func +"ª" + " Funcionário"));  // 1 ª funcionário
		return funcionario;
	}
	public static int infSexFunc(int func, String nomefun) {
		
		int funcionario = Integer.parseInt(JOptionPane.showInputDialog(func + "ª Funcionário:" + nomefun+ " Informe o sexo do Funcionário \n \n"
				+ "1- para sexo Masculino \n "
				+ "2- para sexo Feminino \n "));
		
		return funcionario;
	}
	public static double infsal(String nomefun1) {
		
		double sal1 = Double.parseDouble(JOptionPane.showInputDialog("Funcionário: " + nomefun1 +"  recebera salário de: R$" ));
		return sal1;
	}
}
