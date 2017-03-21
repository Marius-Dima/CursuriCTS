package adapterclase;

import inchirieremasini.Masina;
import inchirieremasini.MasinaInchiriata;

public class PachetMasinaInchiriata extends MasinaInchiriata implements PachetTuristic {
	
	public PachetMasinaInchiriata(Masina masina){
		super(masina);
	}
	
	@Override
	public void descriere() {
		System.out.println(super.toString());
	}

	@Override
	public void rezervaPachet() {
		super.inchiriazaMasina();
	}

}
