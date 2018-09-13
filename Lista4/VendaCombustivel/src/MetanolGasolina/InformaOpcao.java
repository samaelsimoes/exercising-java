package MetanolGasolina;

import javax.swing.JOptionPane;

public class InformaOpcao {

	public static int infOpcao() {
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(" Informe Que tipo de combustivel você deseja utilizar: \n \n"
				+ "1-  Metanol R$ 2,90 Litro\n"
				+ "2-  Gasolina R$ 3,50 Litro \n"
				+ "\n"
				+ "Metanol: \n Acima de 20 Litros, desconto de 5% por litro \n"
				+ "até 20 litros, desconto de 4% por litro \n"
				+ "\n"
				+ "Gasolina: \n Acima de 20 Litros, desconto de 6% por litro \n"
				+ "\n"
				+ "3- Sair do Sistema"));
		
		return escolha;
	}
}
