package CalculadoraBasicaOov7;

public abstract class Operacao implements Ioperacao {  // classe Operação publica e Dinamica 
	
	protected int m_numero1;  // protected = Modificadores.
	protected int m_numero2; // o modificador protected  ' protegido' significa que somente as classes filhas poderão fazer uso.
	// metodos que recebem as váriaveis e são armazenados na classe m_numero1 e m_numero2;
	
	public void ajustaValores(int numero1, int numero2){
		// armazena os dados do numero 1 no atributo m_numero1;
		m_numero1 = numero1;
		m_numero2 = numero2;
		// armazena os dados do numero2 no atributo m_numero1;	
	}
	abstract public  String calcular ();
}

// essa classe estamos utilizando o metodo de atributos 
// essa é uma classe mãe e está utilizando herança pelo oque as outras classes irão utilizar 