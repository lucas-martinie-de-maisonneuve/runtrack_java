package jour04.job06;

import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Combien de nombres ? : ");
        int n = scanner.nextInt();

        int[] nb = new int[n];

        System.out.println("Entrez les nombres : ");
        for (int i = 0; i < n; i++) {
            nb[i] = scanner.nextInt();
        }

        long debut = System.nanoTime();

        int somme = 0;
        for (int x : nb) {
            somme += x;
        }

        long fin = System.nanoTime();

        long temps = fin - debut;

        System.out.println("Somme des nombres : " + somme);
        System.out.println("Temps d'exécution: " + temps + " nanosecondes");

        scanner.close();
    }
}
