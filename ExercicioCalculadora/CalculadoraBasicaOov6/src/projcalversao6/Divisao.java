package projcalversao6;

public class Divisao extends Operacao{ // 
	

	public Divisao(){
		// esta iniciando os atributos 
		m_numero1 = 0;
		m_numero2 = 0;
	}
	public String calcular(){
		int dResultado = 0;
		String msg = "";
		if (m_numero2 !=0){
		
			dResultado = m_numero1/m_numero2;
			msg = "A divis�o � :" + dResultado;
		}else{
			dResultado = 999999999;
			msg = "Erro de divis�o por zero";
		}
			return msg;
	}
}





