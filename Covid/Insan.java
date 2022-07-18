package Odevler.Covid;

public class Insan {
	private String isim;
	private String soyisim;
	private boolean bagisiklik;
	private int yas;
	private boolean hastaMi;
	private int hastalikGunu;

	public Insan() {
		super();
	}

	public Insan(String isim, String soyisim, int yas) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.bagisiklik = false;
		this.yas = yas;
		this.hastalikGunu = 0;
		if ((((int) (Math.random() * 9)) + 1) < 4) {
			this.hastaMi = true;
		} else {
			this.hastaMi = false;
		}
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public boolean isBagisiklik() {
		return bagisiklik;
	}

	public void setBagisiklik(boolean bagisiklik) {
		this.bagisiklik = bagisiklik;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public boolean isHastaMi() {
		return hastaMi;
	}

	public void setHastaMi(boolean hastaMi) {
		this.hastaMi = hastaMi;
	}

	public int getHastalikGunu() {
		return hastalikGunu;
	}

	public void setHastalikGunu(int hastalikGunu) {
		this.hastalikGunu = hastalikGunu;
	}

	@Override
	public String toString() {
		return "\nInsan [isim=" + isim + ", soyisim=" + soyisim + ", bagisiklik=" + bagisiklik + ", yas=" + yas
				+ ", HastaMi=" + hastaMi + ", hastalikGunu=" + hastalikGunu + "]";
	}

}
