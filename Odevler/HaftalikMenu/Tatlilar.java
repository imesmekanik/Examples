package Odevler.HaftalikMenu;

public enum Tatlilar {
	BAKLAVA(1, "Baklava", false), TULUMBA(2, "Tulumba", false), KADAYIF(3, "Kadayif", false),
	SUTLAC(4, "Sutlac", false), SEKERPARE(5, "Sekerpare", false), HOSAF(6, "Hosaf", false), PASTA(7, "Pasta", false);

	private int no;
	private String isim;
	private boolean check;

	private Tatlilar(int no, String isim, boolean check) {
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