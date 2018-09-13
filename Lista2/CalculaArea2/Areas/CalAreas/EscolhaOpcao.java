package CalAreas;
import javax.swing.JOptionPane;


public class EscolhaOpcao{

	public static int InformOp(){
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Qual opção você deseja escolher para calcular: \n \n"
				+ "1- Área Retângulo. \n"
				+ "2- Área Triângulo. \n "
				+ "3- Área do Círculo. \n"
				+ "4- Área do quadrado. \n"
				+ "5- Área do trapézio. \n"
				+ "6- Sair do Sistema. \n \n"));
		
		return num;
	}
}
