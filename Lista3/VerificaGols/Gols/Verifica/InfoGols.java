package Verifica;

import javax.swing.JOptionPane;

public class InfoGols {

	public static int infgolA(String timeA) {
		
		int gol1 = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantidade de gols do: " + timeA));
		
		return gol1;
	}

	public static int InfgolB(String timeB) {
		
		int gol2 = Integer.parseInt(JOptionPane.showInputDialog(" Informe quantidade de gols do:" + timeB));
		
		return gol2;
	}
}
