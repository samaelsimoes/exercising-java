package CalculamediaAulo;

public class Verifica {

	public String calcular(double calMediaNota) {
		
		String msg = " ";
		
		if ( calMediaNota > 7){
		msg = " est� com a m�dia: " + calMediaNota + "\n Aluno Aprovado. ";			
						
		}else{
			msg = " est� com a m�dia:" + calMediaNota + "\n Aluno est� abaixo da m�dia. ";
			
		}if ( calMediaNota > 10){
			msg = " \n  Erro, Por favor digite o valor de 0 a 10 ";
		}
		return msg;
	}
}
