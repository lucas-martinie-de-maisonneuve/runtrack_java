package jour04.job07;

import java.util.Scanner;

public class SommeThread {
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

        SumThread thread1 = new SumThread(nb, 0, n / 2);
        SumThread thread2 = new SumThread(nb, n / 2, n);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int somme = thread1.getSum() + thread2.getSum();

        long fin = System.nanoTime();

        long temps = fin - debut;

        System.out.println("Somme des nombres : " + somme);
        System.out.println("Temps d'exécution: " + temps + " nanosecondes");

        scanner.close();
    }
}

class SumThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
