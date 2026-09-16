package Mastermind;

public class masterMind {

    public static void main(String[] args) {

        String codeMaker = "CodeMaker";
        String codeKraker = "CodeKraker";

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
