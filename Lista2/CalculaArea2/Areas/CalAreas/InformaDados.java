package CalAreas;
import javax.swing.JOptionPane;


public class InformaDados {

	public static double infAltura() {
		
		double alt = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho da Base: "));// base altura 1� e 2 classe
		
		return alt;
	}

	public static double infBase() {
		double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")); // base altura 1� e 2 classes
		
		return base;
	}

	public static double infraio1() {
		
		double raio1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 1� Raio do circulo: ")); 
		
		return raio1;
	}

	public static double infraio2() {
		
		double raio2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do 2� Raio do circulo: "));
		
		return raio2;
	}

	public static double inflado1() { // quadrado
		
		double ado = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2� lado: "));
		
		return ado;
	}

	public static double inflado2() { // quadrado
		
		double ado = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� lado: "));
		
		return ado;
	}

	public static double infmaior() {
		
		double maior = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� lado: "));
		
		return maior;
	}

	public static double infmenor() {
		
		double menor = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1� lado: "));
		
		return menor;
	}

	public static double altura() {
		
		double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
		
		return altura2;
	}
}

