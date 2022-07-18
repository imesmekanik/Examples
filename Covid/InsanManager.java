package Odevler.Covid;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class InsanManager {

	private Stack<Insan> stack;

	public Stack<Insan> getStack() {
		return stack;
	}

	public void setStack(Stack<Insan> stack) {
		this.stack = stack;
	}

	public Stack<Insan> populasyonOlustur() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Baslangic insan sayisini giriniz: ");
		int insanSayisi = scanner.nextInt();

		System.out.println("Super Insan yuzdesi giriniz: ");
		int superInsanYuzdesi = scanner.nextInt();

		if (superInsanYuzdesi != 0)
			superInsanYuzdesi = 100 / superInsanYuzdesi;

		System.out.println("Doktor yuzdesi giriniz: ");
		int doktorYuzdesi = scanner.nextInt();

		if (doktorYuzdesi != 0)
			doktorYuzdesi = 100 / doktorYuzdesi;

		String ad = "ad";
		String soyAd = "soyAd";
		stack = new Stack<Insan>();
		for (int i = 1; i <= insanSayisi; i++) {
			if (superInsanYuzdesi != 0 && i % superInsanYuzdesi == 0)
				stack.push(new SuperInsan(ad + (i), soyAd + (i), ((int) (Math.random() * 100))));
			if (doktorYuzdesi != 0 && i % doktorYuzdesi == 0)
				stack.push(new Doktor(ad + (i), soyAd + (i), ((int) (Math.random() * 70))));
			else {
				stack.push(new Insan(ad + (i), soyAd + (i), ((int) (Math.random() * 100))));
			}

		}

		return stack;
	}

	public void bulastir(ArrayList<Ulke> ulkes) {
		int hastalikKapanSayisi = 0;
		int count = 0;
		for (int i = 0; i < ulkes.size(); i++) {
			for (int j = 0; j < ulkes.get(i).getInsan().size(); j++) {
				if (ulkes.get(i).getInsan().get(j).isHastaMi())
					count++;
			}
			for (int j = 0; j < ulkes.get(i).getInsan().size(); j++) {
				// buraya 11.günden sonra bulaşması eklenmeli fakat hata verdiği ve çözülemediği
				// için çıkarıldı, tekrar bakılacak.
				if (!ulkes.get(i).getInsan().get(j).isHastaMi() && count > 0) {
					if (!ulkes.get(i).getInsan().get(j).isBagisiklik()) {
						ulkes.get(i).getInsan().get(j).setHastaMi(true);
						hastalikKapanSayisi++;
					}

					count--;

				}

			}

		}
		System.out.println("Hastalik kapan sayisi: " + hastalikKapanSayisi);

	}

	public void asiYap(ArrayList<Ulke> ulkes) {
		int asilananHasta = 0;
		int count = 0;
		for (int i = 0; i < ulkes.size(); i++) {
			for (int j = 0; j < ulkes.get(i).getInsan().size(); j++) {
				if (ulkes.get(i).getInsan().get(j) instanceof Doktor)
					count++;
			}
			count = count * 10;
			for (int j = 0; j < ulkes.get(i).getInsan().size(); j++) {

				if (ulkes.get(i).getInsan().get(j).isHastaMi() && count > 0) {

					count--;
					ulkes.get(i).getInsan().get(j).setHastaMi(false);
					ulkes.get(i).getInsan().get(j).setBagisiklik(true);
					asilananHasta++;
				}

			}
		}
		System.out.println("Asilanan hasta sayisi: " + asilananHasta);
	}

	// fazladan döngüye sokmamak için ölüm işlemi de burada yapıldı.
	public void hastaGunuArttir(ArrayList<Ulke> ulkes) {
		int olenHastaSayisi = 0;
		for (int i = 0; i < ulkes.size(); i++) {
			for (int j = 0; j < ulkes.get(i).getInsan().size(); j++) {
				if (ulkes.get(i).getInsan().get(j).isHastaMi()) {
					int temp = (ulkes.get(i).getInsan().get(j).getHastalikGunu()) + 1;
					ulkes.get(i).getInsan().get(j).setHastalikGunu(temp);
					if (temp > 11 && temp < 21) {
						int rand = ((int) (Math.random() * 9)) + 1;
						if (rand == 1 || rand == 2) {
							ulkes.get(i).getInsan().remove(j);
							olenHastaSayisi++;
						}
					} else if (temp == 21) {
						ulkes.get(i).getInsan().remove(j);
						olenHastaSayisi++;
					} else if (temp == 30) {
						ulkes.get(i).getInsan().get(j).setBagisiklik(true);
						ulkes.get(i).getInsan().get(j).setHastalikGunu(0);
						ulkes.get(i).getInsan().get(j).setHastaMi(false);
					}
				}
			}
		}
		System.out.println("Olen hasta sayisi: " + olenHastaSayisi);
	}

	public void seyahatEt(ArrayList<Ulke> ulkes) {
		int seyahatEdenSayi = 0;

		for (int i = 0; i < ulkes.size(); i++) {
			int rand = ((int) (Math.random() * (ulkes.size() - 1)));
			int rand2 = ((int) (Math.random() * 9)) + 1;
			for (int j = 0; j < ulkes.get(i).getInsan().size(); j++) {
				if (rand2 < 3) {
					ulkes.get(rand).getInsan().add(ulkes.get(i).getInsan().get(j));
					seyahatEdenSayi++;
					ulkes.get(i).getInsan().remove(j);
				}
			}
		}
		System.out.println("Seyahat eden insan sayisi: " + seyahatEdenSayi);
	}
}
