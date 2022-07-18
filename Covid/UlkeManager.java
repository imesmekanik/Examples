package Odevler.Covid;

import java.util.ArrayList;
import java.util.Scanner;

public class UlkeManager {

	public ArrayList<Ulke> ulkeOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ulke sayisini giriniz: ");
		int ulkeSayisi = scanner.nextInt();

		ArrayList<Ulke> ulkeler = new ArrayList<Ulke>();

		for (int i = 1; i <= ulkeSayisi; i++) {
			ulkeler.add(new Ulke("Ulke" + i));
		}
		return ulkeler;
	}
}
