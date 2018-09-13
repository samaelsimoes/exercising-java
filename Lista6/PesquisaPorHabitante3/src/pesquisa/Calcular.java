package pesquisa;

public class Calcular {
   
	public double mediaSal(double totSal, int numFamilias) {
		double Media = 0;
		Media = totSal / numFamilias;
		
		return Media ;
	}

	public double mediaFilhos(double TotFilhos, int numFamilias) {
		double media1 = 0;
		media1 = TotFilhos / numFamilias;

		return media1;
	}
}
