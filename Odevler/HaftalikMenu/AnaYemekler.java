package Odevler.HaftalikMenu;

public enum AnaYemekler {
	NOHUTPILAV(1, "Nohut Pilav", false), IMAMBAYILDI(2, "Imam Bayildi", false), HAMSITAVA(3, "Hamsi Tava", false),
	KUZUHASLAMA(4, "Kuzu Haslama", false), KARNIYARIK(5, "Karniyarik", false), MANTI(6, "Manti", false),
	PIDE(7, "Pide", false);

	private int no;
	private String isim;
	private boolean check;

	private AnaYemekler(int no, String isim, boolean check) {
		this.no = no;
		this.isim = isim;
		this.check = check;
	}

	public int getNo() {
		return no;
	}

	public String getIsim() {
		return isim;
	}

	public boolean getCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

}