package testeArray1;

import javax.swing.JOptionPane;

public class EntradaDados {

	public String chamaNome(String mens) {
		
		return JOptionPane.showInputDialog(mens);
		
	}

	public void saiDados(String mensagem) {
		
		JOptionPane.showConfirmDialog(null, mensagem , "Resultado",JOptionPane.OK_CANCEL_OPTION);
	}
}
