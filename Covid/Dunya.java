package Odevler.Covid;

import java.util.List;

public class Dunya {
	private List<Ulke> UlkeListesi;

	public Dunya(List<Ulke> ulkeListesi) {
		super();
		UlkeListesi = ulkeListesi;
	}

	public List<Ulke> getUlkeListesi() {
		return UlkeListesi;
	}

	public void setUlkeListesi(List<Ulke> ulkeListesi) {
		UlkeListesi = ulkeListesi;
	}

}
