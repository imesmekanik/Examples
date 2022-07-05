package Odevler.HaftalikMenu;

public enum Icecekler {
	AYRAN(1, "Ayran", false), KOLA(2, "Kola", false), FANTA(3, "Fanta", false), MEYVESUYU(4, "Meyve Suyu", false),
	GAZOZ(5, "Gazoz", false);

	private int no;
	private String isim;
	private boolean check;

	private Icecekler(int no, String isim, boolean check) {
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