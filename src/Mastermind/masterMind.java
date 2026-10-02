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
		String rodePin = "Rood";
		String blauwePin = "Blauw";
		String gelePin = "Geel";
		String paarsePin = "Paars";
		String oranjePin = "Oranje";
		String groenPin = "Groen";

		// Geheime code
		String[] secretcode = { "Blauw", "Groen", "Paars", "Rood" };

		System.out.println("MasterMind");

		System.out.println("CodeMaker: " + codeMaker);
		System.out.println("CodeKraker: " + codeKraker);

		System.out.println("De geheime code bestaat uit 4 kleuren.");

		// vakjes en rijen

		for (beurt = 1; beurt <= 10; beurt++) {

			System.out.println();
			System.out.println("Dit is beurt: " + beurt);

			// Zwarte en witte pionnen
			zwartePionnen = 0;
			wittePionnen = 0;

			System.out.println("Rij " + beurt + " - Vakje 1: ");
			String vakje1 = sc.next();

			System.out.println("Rij " + beurt + " - Vakje 2: ");
			String vakje2 = sc.next();

			System.out.println("Rij " + beurt + " - Vakje 3: ");
			String vakje3 = sc.next();

			System.out.println("Rij " + beurt + " - Vakje 4: ");
			String vakje4 = sc.next();

			String[] poging = { vakje1, vakje2, vakje3, vakje4 };

			for (int i = 0; i < 4; i++) {
				String message = "Fout";
				if (poging[i].equals(secretcode[i])) {

					message = "Zwart";
					zwartePionnen++;

				}

				else {
					for (int j = 0; j < secretcode.length; j++) {
					    if (poging[i].equals(secretcode[j])) {
					        message = "Wit";
					        wittePionnen++;
					        break;
					    }
					}
					
				}
				System.out.println(message);
			}

			if (zwartePionnen == 4) {

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