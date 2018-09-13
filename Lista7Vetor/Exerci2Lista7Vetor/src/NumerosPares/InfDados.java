package NumerosPares;

import javax.swing.JOptionPane;

public class InfDados {

	public static int infNum() {

		int num = Integer.parseInt(JOptionPane.showInputDialog(" Informe a quantidade de número que deseja Digitar: ", "Informa a quantidade de vezes aqui"));
		
		return num;
	}

	public static int infNumeros(int i) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(" Informe o " + i + " º, número: ", "Informe algum número"));
		
		return num1;
	}
	
	
}
