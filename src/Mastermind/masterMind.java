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
			String[] pogingen = new String[5];

			System.out.println();
			System.out.println("Dit is beurt: " + beurt);

			// Zwarte en witte pionnen
			zwartePionnen = 0;
			wittePionnen = 0;

			for(int poging = 0; poging < 4; poging++) {
			System.out.println("Rij " + beurt + "vakje" + poging);
			pogingen[poging] = sc.next();
		
			}
			


			for (int i = 0; i < 4; i++) {
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