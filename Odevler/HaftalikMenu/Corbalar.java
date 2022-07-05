package Odevler.HaftalikMenu;

public enum Corbalar {
	MERCIMEK(1, "Mercimek", false), EZOGELIN(2, "Ezogelin", false), YARASA(3, "Yarasa", false),
	KELLEPACA(4, "Kellepaca", false), ISKEMBE(5, "Iskembe", false), TARHANA(6, "Tarhana", false),
	DOMATES(7, "Domates", false);

	private int no;
	private String isim;
	private boolean check;

	private Corbalar(int no, String isim, boolean check) {
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
