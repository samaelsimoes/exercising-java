package CalAreas;
import javax.swing.JOptionPane;


public class EscolhaOpcao{

	public static int InformOp(){
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(" Qual op��o voc� deseja escolher para calcular: \n \n"
				+ "1- �rea Ret�ngulo. \n"
				+ "2- �rea Tri�ngulo. \n "
				+ "3- �rea do C�rculo. \n"
				+ "4- �rea do quadrado. \n"
				+ "5- �rea do trap�zio. \n"
				+ "6- Sair do Sistema. \n \n"));
		
		return num;
	}
}
