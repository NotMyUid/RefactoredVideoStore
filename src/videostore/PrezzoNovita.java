package videostore;

public class PrezzoNovita extends Prezzo {

	@Override
	public int getCodicePrezzo() {
		return 1;
	}
	
	public double getAmmontare(int giorniNoleggio) {		   
		return giorniNoleggio * 3;
	}

}
