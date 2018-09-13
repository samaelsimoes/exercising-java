package Calcula;

public class DadosCirculo {

	public void calcirculo() {
		
		double Raio = InformRaio.infoal();
		
		CalareaCirc circ = new CalareaCirc();
		circ.executar(Raio);
		
	}
}
