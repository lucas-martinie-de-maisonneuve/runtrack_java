package jour04.job04;

import java.util.Scanner;

public class Compteur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long total = 0;
        
        System.out.print("Entrez le nombre maximum : ");
        int nombreMax = scanner.nextInt();
        long debut = System.nanoTime();
        
        for (int i = 1; i <= nombreMax; i++) {
            total++;
        }
        
        long fin = System.nanoTime();
        
        long temps = fin - debut;
        
        System.out.println("Compte total: " + total);
        System.out.println("Temps d'exécution: " + temps + " nanosecondes");
        
        scanner.close();
    }
}
