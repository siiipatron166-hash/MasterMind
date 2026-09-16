package Mastermind;

import java.util.Scanner;

public class masterMind {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        String codeMaker = "CodeMaker";
        String codeKraker = "CodeKraker";
        
        //pins//
        String rodePin = "rood";
        String blauwePin = "Blauw";
        String gelePin = "Gele";
        String paarsePin = "Paars";
        String oranjePin = "Oranje";
        String groenPin = "Groen";
        
        
        //vakjes en rijen//
        String vakje1Rij1 = "1.1";
        String vakje2Rij1 = "1.2";
        String vakje3Rij1 = "1.3";
        String vakje4Rij1 = "1.4";
        
        String vakje1Rij2 = "2.1";
        String vakje2Rij2 = "2.2";
        String vakje3Rij2 = "2.3";
        String vakje4Rij2 = "2.4";
        
        String vakje1Rij3 = "3.1";
        String vakje2Rij3 = "3.2";
        String vakje3Rij3 = "3.3";
        String vakje4Rij3 = "3.4";
        
        String vakje1Rij4 = "4.1";
        String vakje2Rij4 = "4.2";
        String vakje3Rij4 = "4.3";
        String vakje4Rij4 = "4.4";
        
        String vakje1Rij5 = "5.1";
        String vakje2Rij5 = "5.2";
        String vakje3Rij5 = "5.3";
        String vakje4Rij5 = "5.4";
        
        String vakje1Rij6 = "6.1";
        String vakje2Rij6 = "6.2";
        String vakje3Rij6 = "6.3";
        String vakje4Rij6 = "6.4";
        
        String vakje1Rij7 = "7.1";
        String vakje2Rij7 = "7.2";
        String vakje3Rij7 = "7.3";
        String vakje4Rij7 = "7.4";
        
        String vakje1Rij8 = "8.1";
        String vakje2Rij8 = "8.2";
        String vakje3Rij8 = "8.3";
        String vakje4Rij8 = "8.4";
        
        String vakje1Rij9 = "9.1";
        String vakje2Rij9 = "9.2";
        String vakje3Rij9 = "9.3";
        String vakje4Rij9 = "9.4";
        
        String vakje1Rij10 = "10.1";
        String vakje2Rij10 = "10.2";
        String vakje3Rij10 = "10.3";
        String vakje4Rij10 = "10.4";
        
        

        int beurt = 1;

        int zwartePionnen = 0;
        int wittePionnen = 0;

        boolean gewonnen = false;
        boolean verloren = false;

        System.out.println("MasterMind");
        System.out.println("CodeMaker: " + codeMaker);
        System.out.println("CodeKraker: " + codeKraker);

        System.out.println("De geheime code bestaat uit 4 kleuren.");
        System.out.println("Dit is beurt: " + beurt);

        System.out.println("Zwarte pionnen: " + zwartePionnen);
        System.out.println("Witte pionnen: " + wittePionnen);

        System.out.println("Gewonnen: " + gewonnen);
        System.out.println("Verloren: " + verloren);
    }
}
