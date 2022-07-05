package Odevler.HaftalikMenu;

public enum Gun {
	PAZARTESI(1, "Pazartesi"), SALI(2, "Sali"), CARSAMBA(3, "Carsamba"), Persembe(4, "Persembe"), CUMA(5, "Cuma"),
	CUMARTESI(6, "Cumartesi"), PAZAR(7, "Pazar");

	private int no;
	private String isim;

	private Gun(int no, String isim) {
		this.no = no;
		this.isim = isim;
	}

	public int getNo() {
		return no;
	}

	public String getIsim() {
		return isim;
	}

}