package jour02.job08;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        int numero, longueur;
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le nombre à compter : ");
        numero = input.nextInt();

        input.close();

        longueur = String.valueOf(numero).length();
        System.out.println("Il y à " + longueur + " chiffres dans " + numero);

    }
}
