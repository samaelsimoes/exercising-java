package projcalcversao4;

public class Divisao {
	public String calcular ( int num1, int num2){
		int dResultado = 0;
		String msg = "";
		if (num2 !=0){
			
			dResultado = num1/num2;
			msg = "A divis�o � :" + dResultado;
		}else{
			dResultado = 999999999;
			msg = "Erro de divis�o por zero";
		}
		return msg;
	}
}

