package calcula;

import javax.swing.JOptionPane;

public class InformaDados {

	public static String infNome(int func) {
		
		String funcionario = (JOptionPane.showInputDialog("Informe o nome do: " + func +"�" + " Funcion�rio"));  // 1 � funcion�rio
		return funcionario;
	}
	public static int infSexFunc(int func, String nomefun) {
		
		int funcionario = Integer.parseInt(JOptionPane.showInputDialog(func + "� Funcion�rio:" + nomefun+ " Informe o sexo do Funcion�rio \n \n"
				+ "1- para sexo Masculino \n "
				+ "2- para sexo Feminino \n "));
		
		return funcionario;
	}
	public static double infsal(String nomefun1) {
		
		double sal1 = Double.parseDouble(JOptionPane.showInputDialog("Funcion�rio: " + nomefun1 +"  recebera sal�rio de: R$" ));
		return sal1;
	}
}
