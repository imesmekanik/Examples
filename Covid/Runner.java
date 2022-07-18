package Odevler.Covid;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Runner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Dunyada gececek gun sayisini giriniz: ");
		int gun = scanner.nextInt();

		UlkeManager ulkeManager = new UlkeManager();
		InsanManager insanManager = new InsanManager();

		ArrayList<Ulke> ulkeListesi = ulkeManager.ulkeOlustur();
		Stack<Insan> insanlar = insanManager.populasyonOlustur();

		// ülkelere rastgele insan dağıtma
		while (!insanlar.isEmpty()) {
			ulkeListesi.get((int) (Math.random() * ulkeListesi.size())).getInsan().add(insanManager.getStack().pop());
		}
		/*
		 * ulkeListesi.get(0).getInsan().add(stack.pop());
		 * ulkeListesi.get(1).getInsan().add(stack.pop());
		 * ulkeListesi.get(1).getInsan().add(stack.pop());
		 */
		Dunya dunya = new Dunya(ulkeListesi);

		// System.out.println(dunya.getUlkeListesi().get(0));
		// System.out.println(dunya.getUlkeListesi().get(1));
		dunya.getUlkeListesi().forEach(d -> System.out.println(d.toString()));
		for (int i = 0; i < gun; i++) {
			System.out.println("******" + (i + 1) + ". Gun Raporu******");
			insanManager.bulastir(ulkeListesi);
			insanManager.asiYap(ulkeListesi);
			insanManager.hastaGunuArttir(ulkeListesi);
			insanManager.seyahatEt(ulkeListesi);
			System.out.println("*****************************");
		}

	}

}
