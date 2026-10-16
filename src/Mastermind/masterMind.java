package Mastermind;

import java.util.Scanner;

public class masterMind {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String codeMaker = "CodeMaker";
		String codeKraker = "CodeKraker";

		int beurt = 1;
		int zwartePionnen = 0;
		int wittePionnen = 0;

		boolean gewonnen = false;
		boolean verloren = false;

		// pins
		String[] kleuren = { "Rood", "Blauw", "Geel", "Paars", "Oranje", "Groen" };

		// Geheime code
		String[] secretcode = { kleuren[1], kleuren[0], kleuren[3], kleuren[5] };

		System.out.println("MasterMind");

		System.out.println("CodeMaker: " + codeMaker);
		System.out.println("CodeKraker: " + codeKraker);

		System.out.println("De geheime code bestaat uit" + secretcode.length + " kleuren.");

		//beurt

		for (beurt = 1; beurt <= 10; beurt++) {
			String[] pogingen = new String[secretcode.length];

			System.out.println();
			System.out.println("Dit is beurt: " + beurt);

			// Zwarte en witte pionnen
			zwartePionnen = 0;
			wittePionnen = 0;

			for (int poging = 0; poging < pogingen.length; poging++) {
				System.out.println("Rij " + beurt + "vakje" + (poging + 1));
				pogingen[poging] = sc.next();

			}

			for (int i = 0; i < pogingen.length; i++) {
				String message = "Fout";
				if (pogingen[i].equals(secretcode[i])) {

					message = "Zwart";
					zwartePionnen++;

				}
				// vergelijken secretcode
				else {
					for (int j = 0; j < secretcode.length; j++) {
						if (pogingen[i].equals(secretcode[j])) {
							message = "Wit";
							wittePionnen++;
							break;
						}
					}

				}
				System.out.println(message);
			}

//			 wanneer gewonnen wanneer verloren bepalen
			if (zwartePionnen == pogingen.length) {

				gewonnen = true;

				System.out.println();
				System.out.println("Je hebt gewonnen!");
				System.out.println("Aantal pogingen: " + beurt);

				break;
			}

			if (beurt == 10) {

				verloren = true;

				System.out.println();
				System.out.println("Je hebt verloren!");
				System.out.println("De geheime code was:");

				for (int i = 0; i < 4; i++) {

					System.out.println(secretcode[i]);

				}
			}
		}

		System.out.println();
		System.out.println("----- EINDE SPEL -----");

		sc.close();
	}
}