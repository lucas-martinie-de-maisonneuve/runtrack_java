package jour01.job12;

import java.util.Scanner;

public class Echange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la 1ère chaîne : ");
        String chaine1 = scanner.nextLine();

        System.out.print("Entrez la 2ème chaîne : ");
        String chaine2 = scanner.nextLine();

        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());

        System.out.println("chaîne1 -> " + chaine1);
        System.out.println("chaine2 -> " + chaine2);

        scanner.close();
    }
}
