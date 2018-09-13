package CalculamediaAulo;

public class Verifica {

	public String calcular(double calMediaNota) {
		
		String msg = " ";
		
		if ( calMediaNota > 7){
		msg = " está com a média: " + calMediaNota + "\n Aluno Aprovado. ";			
						
		}else{
			msg = " está com a média:" + calMediaNota + "\n Aluno está abaixo da média. ";
			
		}if ( calMediaNota > 10){
			msg = " \n  Erro, Por favor digite o valor de 0 a 10 ";
		}
		return msg;
	}
}
