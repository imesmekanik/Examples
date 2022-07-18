package Odevler.Covid;

import java.util.ArrayList;
import java.util.List;

public class Ulke {
	private String isim;

	private List<Insan> insan;

	public Ulke(String isim) {
		super();
		this.isim = isim;
		insan = new ArrayList<Insan>();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Insan> getInsan() {
		return insan;
	}

	public void setInsan(List<Insan> insan) {
		this.insan = insan;
	}

	@Override
	public String toString() {
		return "\nUlke [isim=" + isim + "," + insan + "]\n";
	}

}
