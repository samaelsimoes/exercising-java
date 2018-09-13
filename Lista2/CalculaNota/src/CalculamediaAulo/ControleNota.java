package CalculamediaAulo;

public class ControleNota {
	
	//double CalMediaNota,ver; não necessario cria-la aqui pois estamos utilizando apenas em 1 metodo direto se fosse mais de um é obrigatorio utilizar desse modo
	
	public String calcular(double nota1, double nota2, double nota3, String nome) {
		
		String msg = " ";
		
	    CalculaMedia media = new CalculaMedia();
		double CalMediaNota = media.calcular(nota1,nota2,nota3); // chama o metodo calcular e retorna os dados na variavel CalMediaNota como double
				// CalMediaNota é uma variavel de parametro.
				// para utilizar em outra classe 
		
		Verifica ver = new Verifica();
		msg = ver.calcular(CalMediaNota);
	
		return " Aluno: "+ nome + msg + " ";
	}
}
