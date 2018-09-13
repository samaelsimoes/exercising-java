package SalbrutoEliquido;

public class Calcular {
	
	double bruto,ir,inss,sindi,liquido, descon; // variavel de retorno

	public String calcular(double numero1, double numero2) {
		
		SalBruto salbruto = new SalBruto();
		bruto = salbruto.calcular(numero1,numero2);
	
		DesconIR descir = new DesconIR();
		ir = descir.calcular(bruto); // Desconto Ir
	
		DesconINSS descinss = new DesconINSS();
		inss = descinss.calcular(bruto); // Desconto INSS
	
		DescontoSindicato descsindi = new DescontoSindicato();
		sindi = descsindi.calcular(bruto); // Desconto Sindicato
	
		SomaDescontos  somadescontos = new SomaDescontos();
		liquido = somadescontos.calcular(ir,inss,sindi);  // Total descontos
		 
		Desco  des = new Desco();
		descon = des.calcular(bruto,liquido);	// Sal�rio com desconto	
		
		return   " Descontos  " +  " \n"
			+ " \n "
			+ " IR: R$" + ir + " \n "
			+ " INSS: R$" + inss + " \n"
			+ " SINDICATO: R$" + sindi + "\n "
			+ " \n " + " Sal�rio Bruto � de: R$"+ bruto
			+ " \n " + " Sal�rio Liquido � de: R$"+ descon + " \n"
			+ " \n "
			+ " Total de descontos � de: R$ "+ liquido;	
	}
		
}
		
		