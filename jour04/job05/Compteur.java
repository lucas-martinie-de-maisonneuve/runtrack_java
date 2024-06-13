package jour04.job05;

import java.util.Scanner;

class CompteurThread extends Thread {
    private int debut;
    private int fin;
    private long compte;

    public CompteurThread(int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
        this.compte = 0;
    }

    public long getCompte() {
        return compte;
    }

    public void run() {
        for (int i = debut; i <= fin; i++) {
            compte++;
        }
    }
}

public class Compteur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le nombre : ");
        int nombreMax = scanner.nextInt();
        
        int milieu = nombreMax / 2;
        
        CompteurThread thread1 = new CompteurThread(1, milieu);
        CompteurThread thread2 = new CompteurThread(milieu + 1, nombreMax);
        
        long debut = System.nanoTime();
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long fin = System.nanoTime();
        
        long total = thread1.getCompte() + thread2.getCompte();
        
        long temps = fin - debut;
        
        System.out.println("Compte total: " + total);
        System.out.println("Temps d'exécution: " + temps + " nanosecondes");
        
        scanner.close();
    }
}

