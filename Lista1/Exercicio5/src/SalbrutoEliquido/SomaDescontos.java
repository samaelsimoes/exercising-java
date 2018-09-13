package SalbrutoEliquido;

public class SomaDescontos {
	
	public double calcular(double ir, double inss, double sindi){
		
		double SalLiquidoTotal = 0;
		
		
		SalLiquidoTotal = ir + inss + sindi;
		
		return SalLiquidoTotal;
	}

}
