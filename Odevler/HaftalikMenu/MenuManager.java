package Odevler.HaftalikMenu;

public class MenuManager {
	Menu menu;

	public MenuManager(Menu menu) {

		this.menu = new Menu();
	}

	public String randomAnaYemek() {
		String yemek = "";
		int rand = ((int) (Math.random() * AnaYemekler.values().length) + 1);
		for (AnaYemekler a : AnaYemekler.values()) {
			if (rand == a.getNo()) {
				yemek = a.getIsim();
				a.setCheck(true);
			}

		}
		System.out.println("Yemek: " + yemek);
		return yemek;

	}

	public String randomTatli() {
		String tatli = "";
		int rand = ((int) (Math.random() * Tatlilar.values().length) + 1);
		for (Tatlilar a : Tatlilar.values()) {
			if (rand == a.getNo()) {
				tatli = a.getIsim();
				a.setCheck(true);
			}

		}
		System.out.println("Tatli: " + tatli);
		return tatli;

	}

	public String randomCorba() {
		String corba = "";
		int rand = ((int) (Math.random() * Corbalar.values().length) + 1);
		for (Corbalar a : Corbalar.values()) {
			if (rand == a.getNo()) {
				corba = a.getIsim();
				a.setCheck(true);
			}

		}
		System.out.println("Corba: " + corba);
		return corba;

	}

	public String randomIcecek() {
		String icecek = "";
		int rand = ((int) (Math.random() * Icecekler.values().length) + 1);
		for (Icecekler a : Icecekler.values()) {
			if (rand == a.getNo()) {
				icecek = a.getIsim();
				a.setCheck(true);
			}

		}
		System.out.println("Icecek: " + icecek);
		return icecek;

	}

	public void menuOlustur() {
		int i = 1;
		MenuManager menuManager = new MenuManager(null);
		System.out.println("***HAFTALIK MENU***\n");

		for (Gun gun : Gun.values()) {
			if (i == gun.getNo()) {
				System.out.println(gun.getIsim());
				System.out.println("------------");
				i++;
			}
			menuManager.randomCorba();
			menuManager.randomIcecek();
			menuManager.randomAnaYemek();
			menuManager.randomTatli();
			System.out.println();
		}
	}

}
