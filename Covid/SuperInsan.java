package Odevler.Covid;

public class SuperInsan extends Insan {

	public SuperInsan(String isim, String soyisim, int yas) {
		super(isim, soyisim, yas);
		super.setBagisiklik(true);
		super.setHastaMi(false);
		super.setHastalikGunu(0);
	}

	@Override
	public String toString() {
		return "\nSuperInsan [Isim()=" + getIsim() + ", Soyisim()=" + getSoyisim() + ", Bagisiklik()=" + isBagisiklik()
				+ ", Yas()=" + getYas() + ", HastaMi()=" + isHastaMi() + ", HastalikGunu()=" + getHastalikGunu() + "]";
	}

}
