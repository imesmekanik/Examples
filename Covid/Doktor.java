package Odevler.Covid;

public class Doktor extends Insan {

	public Doktor(String isim, String soyisim, int yas) {
		super(isim, soyisim, yas);
		super.setBagisiklik(true);
		super.setHastaMi(false);
		super.setHastalikGunu(0);
	}

	@Override
	public String toString() {
		return "\nDoktor [Isim()=" + getIsim() + ", Soyisim()=" + getSoyisim() + ", Bagisiklik()=" + isBagisiklik()
				+ ", Yas()=" + getYas() + ", HastaMi()=" + isHastaMi() + ", HastalikGunu()=" + getHastalikGunu() + "]";
	}

}
