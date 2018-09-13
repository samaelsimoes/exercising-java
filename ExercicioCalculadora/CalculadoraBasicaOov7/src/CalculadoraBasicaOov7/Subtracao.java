package CalculadoraBasicaOov7;

public class Subtracao extends Operacao{ // 
	public Subtracao(){
		// esta iniciando os atributos 
		m_numero1 = 0;
		m_numero2 = 0;
	}
	public String calcular(){
		double dResultado = 0;
		String msg= " ";
		
		dResultado = m_numero1 - m_numero2;
		msg = " A soma é :" + dResultado;
		return msg;	
	}// fim do metodo calcular()	
} // fim da classe soma 