package Verifica;

import javax.swing.JOptionPane;

public class InfoTime {

	public static String inftimeA() {

		String timea = (JOptionPane.showInputDialog(" Informe o nome do Primeiro Time: "));
		
		return timea;
	}

	public static String inftimeB() {

		String timeb= (JOptionPane.showInputDialog(" Informe o nome do Segundo Time: "));
		
		return timeb;	
	}
}
