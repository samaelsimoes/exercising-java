package testeArrayList3;

import javax.swing.JOptionPane;

public class EntradaDados {

	public String chamaNome(String mens) {
		
		return  JOptionPane.showInputDialog(mens);
	}

	public void saiDados(String mens) {
		
		JOptionPane.showConfirmDialog(null, mens , "Resultado",JOptionPane.OK_CANCEL_OPTION);
		
	}
}
