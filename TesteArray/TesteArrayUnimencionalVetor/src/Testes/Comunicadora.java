package Testes;

import java.util.Scanner;

public class Comunicadora {

	public void executar() {
	
		double media = 0, media2 = 0;
		Scanner input = new Scanner(System.in);		
		int i =0;
		
		int QuantidadeAlunos = EntradaDeDados.infQuantidade();// chamando os dados 
		int QuantidadeNotas = EntradaDeDados.infQuantidadeNotas();
		
		// Estou informando a quantidade de alunos para colocar cada numero de aluno por linha..
		// Estou informando a quantidade de notas por bimestre para colocar por coluna
		// Por enquanto estou tentando cria apenas uma tabela
		
		double[][] notasAlunos = new double [QuantidadeAlunos][QuantidadeNotas]; // array quantidadedeNotas = colunas, quantidade aluno = linhas;
		
		for(  i =1; i <= QuantidadeAlunos; i++){
			
			double InfNota = EntradaDeDados.infonotas(i);
			
			//System.out.println("Insira a nota do: " + (i+1) + "º aluno");
			//notasAlunos[i]= input.nextDouble();
			
		     //media2 = media /i;
		     //SaidaDedados.saidados(media2); Só não consigo fazer sai a média 
		}
	}
}
