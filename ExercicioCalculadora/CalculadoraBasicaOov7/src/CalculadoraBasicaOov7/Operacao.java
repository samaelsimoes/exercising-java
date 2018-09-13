package CalculadoraBasicaOov7;

public abstract class Operacao implements Ioperacao {  // classe Opera��o publica e Dinamica 
	
	protected int m_numero1;  // protected = Modificadores.
	protected int m_numero2; // o modificador protected  ' protegido' significa que somente as classes filhas poder�o fazer uso.
	// metodos que recebem as v�riaveis e s�o armazenados na classe m_numero1 e m_numero2;
	
	public void ajustaValores(int numero1, int numero2){
		// armazena os dados do numero 1 no atributo m_numero1;
		m_numero1 = numero1;
		m_numero2 = numero2;
		// armazena os dados do numero2 no atributo m_numero1;	
	}
	abstract public  String calcular ();
}

// essa classe estamos utilizando o metodo de atributos 
// essa � uma classe m�e e est� utilizando heran�a pelo oque as outras classes ir�o utilizar 