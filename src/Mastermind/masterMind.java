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
        
        //pins//
        String rodePin = "rood";
        String blauwePin = "Blauw";
        String gelePin = "Gele";
        String paarsePin = "Paars";
        String oranjePin = "Oranje";
        String groenPin = "Groen";
        
        String[] secretcode = {"Blauw", "Groen", "Paars", "Rood"};
        
        System.out.println("MasterMind");
        System.out.println("CodeMaker: " + codeMaker);
        System.out.println("CodeKraker: " + codeKraker);

        System.out.println("De geheime code bestaat uit 4 kleuren.");
        System.out.println("Dit is beurt: " + beurt);
        
        
     
		//vakjes en rijen//
        System.out.println("Rij 1 - Vakje 1: ");
        String vakje1Rij1 = sc.next();
        System.out.println("Rij 1 - Vakje 2: ");
        String vakje2Rij1 = sc.next();
        System.out.println("Rij 1 - Vakje 3: ");
        String vakje3Rij1 = sc.next();
        System.out.println("Rij 1 - Vakje 4: ");
        String vakje4Rij1 = sc.next();
        

        
        String[] poging = {vakje1Rij1, vakje2Rij1, vakje3Rij1, vakje4Rij1};

        for (int i = 0; i < 4; i++) {
            if (poging[i].equals(secretcode[i])) {
                System.out.println("Zwart");
            } else if (poging[i].equals(secretcode[0]) ||
                       poging[i].equals(secretcode[1]) ||
                       poging[i].equals(secretcode[2]) ||
                       poging[i].equals(secretcode[3])) {
                System.out.println("Wit");
            } else {
                System.out.println("Fout");
            }
        }
         
        System.out.println("Rij 2 - Vakje 1: ");
        String vakje1Rij2 = sc.next();
        System.out.println("Rij 2 - Vakje 2: ");
        String vakje2Rij2 = sc.next();
        System.out.println("Rij 2 - Vakje 3: ");
        String vakje3Rij2 = sc.next();
        System.out.println("Rij 2 - Vakje 4: ");
        String vakje4Rij2 = sc.next();
         
        System.out.println("Rij 3 - Vakje 1: ");
        String vakje1Rij3 = sc.next();
        System.out.println("Rij 3 - Vakje 2: ");
        String vakje2Rij3 = sc.next();
        System.out.println("Rij 3 - Vakje 3: ");
        String vakje3Rij3 = sc.next();
        System.out.println("Rij 3 - Vakje 4: ");
        String vakje4Rij3 = sc.next();
         
        System.out.println("Rij 4 - Vakje 1: ");
        String vakje1Rij4 = sc.next();
        System.out.println("Rij 4 - Vakje 2: ");
        String vakje2Rij4 = sc.next();
        System.out.println("Rij 4 - Vakje 3: ");
        String vakje3Rij4 = sc.next();
        System.out.println("Rij 4 - Vakje 4: ");
        String vakje4Rij4 = sc.next();
         
        System.out.println("Rij 5 - Vakje 1: ");
        String vakje1Rij5 = sc.next();
        System.out.println("Rij 5 - Vakje 2: ");
        String vakje2Rij5 = sc.next();
        System.out.println("Rij 5 - Vakje 3: ");
        String vakje3Rij5 = sc.next();
        System.out.println("Rij 5 - Vakje 4: ");
        String vakje4Rij5 = sc.next();
         
        System.out.println("Rij 6 - Vakje 1: ");
        String vakje1Rij6 = sc.next();
        System.out.println("Rij 6 - Vakje 2: ");
        String vakje2Rij6 = sc.next();
        System.out.println("Rij 6 - Vakje 3: ");
        String vakje3Rij6 = sc.next();
        System.out.println("Rij 6 - Vakje 4: ");
        String vakje4Rij6 = sc.next();
         
        System.out.println("Rij 7 - Vakje 1: ");
        String vakje1Rij7 = sc.next();
        System.out.println("Rij 7 - Vakje 2: ");
        String vakje2Rij7 = sc.next();
        System.out.println("Rij 7 - Vakje 3: ");
        String vakje3Rij7 = sc.next();
        System.out.println("Rij 7 - Vakje 4: ");
        String vakje4Rij7 = sc.next();
         
        System.out.println("Rij 8 - Vakje 1: ");
        String vakje1Rij8 = sc.next();
        System.out.println("Rij 8 - Vakje 2: ");
        String vakje2Rij8 = sc.next();
        System.out.println("Rij 8 - Vakje 3: ");
        String vakje3Rij8 = sc.next();
        System.out.println("Rij 8 - Vakje 4: ");
        String vakje4Rij8 = sc.next();
         
        System.out.println("Rij 9 - Vakje 1: ");
        String vakje1Rij9 = sc.next();
        System.out.println("Rij 9 - Vakje 2: ");
        String vakje2Rij9 = sc.next();
        System.out.println("Rij 9 - Vakje 3: ");
        String vakje3Rij9 = sc.next();
        System.out.println("Rij 9 - Vakje 4: ");
        String vakje4Rij9 = sc.next();
         
        System.out.println("Rij 10 - Vakje 1: ");
        String vakje1Rij10 = sc.next();
        System.out.println("Rij 10 - Vakje 2: ");
        String vakje2Rij10 = sc.next();
        System.out.println("Rij 10 - Vakje 3: ");
        String vakje3Rij10 = sc.next();
        System.out.println("Rij 10 - Vakje 4: ");
        String vakje4Rij10 = sc.next();
        
        //codemaker//
        
        String codemakervakje1Rij1;
        String codemakervakje2Rij1;
        String codemakervakje3Rij1;
        String codemakervakje4Rij1;
        
        String codemakervakje1Rij2;
        String codemakervakje2Rij2;
        String codemakervakje3Rij2;
        String codemakervakje4Rij2;
        
        String codemakervakje1Rij3;
        String codemakervakje2Rij3;
        String codemakervakje3Rij3;
        String codemakervakje4Rij3;
        
        String codemakervakje1Rij4;
        String codemakervakje2Rij4;
        String codemakervakje3Rij4;
        String codemakervakje4Rij4;
        
        String codemakervakje1Rij5;
        String codemakervakje2Rij5;
        String codemakervakje3Rij5;
        String codemakervakje4Rij5;
        
        String codemakervakje1Rij6;
        String codemakervakje2Rij6;
        String codemakervakje3Rij6;
        String codemakervakje4Rij6;
        
        String codemakervakje1Rij7;
        String codemakervakje2Rij7;
        String codemakervakje3Rij7;
        String codemakervakje4Rij7;
        
        String codemakervakje1Rij8;
        String codemakervakje2Rij8;
        String codemakervakje3Rij8;
        String codemakervakje4Rij8;
        
        String codemakervakje1Rij9;
        String codemakervakje2Rij9;
        String codemakervakje3Rij9;
        String codemakervakje4Rij9;
        
        String codemakervakje1Rij10;
        String codemakervakje2Rij10;
        String codemakervakje3Rij10;
        String codemakervakje4Rij10;
        
        


        System.out.println("Zwarte pionnen: " + zwartePionnen);
        System.out.println("Witte pionnen: " + wittePionnen);

        System.out.println("Gewonnen: " + gewonnen);
        System.out.println("Verloren: " + verloren);
        
        sc.close();
		
        
       
    }
}
