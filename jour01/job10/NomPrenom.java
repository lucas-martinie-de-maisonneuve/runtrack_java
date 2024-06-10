package jour01.job10;

import java.util.Scanner;
import java.util.StringJoiner;

public class NomPrenom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre prénom: ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();

        StringJoiner stringJoiner = new StringJoiner(" ", " ", " ");
        stringJoiner.add(prenom);
        stringJoiner.add(nom);

        String concat = stringJoiner.toString();
        System.out.println("Résultat: " + concat);

        scanner.close();
    }
}
