package jour04.job03;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

// Le programme est plus rapide que celui du job02 car utilisation de thread

public class RandomString {

    private static String generateRandom(int longueur) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(longueur);
        for (int i = 0; i < longueur; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();

        System.out.print("Entrez la longueur de la chaîne de : ");
        int longueur = scanner.nextInt();

        String randomString = generateRandom(longueur);
        String firstHalf = randomString.substring(0, longueur / 2);
        String secondHalf = randomString.substring(longueur / 2);


        Thread thread1 = new Thread(() -> {
            try (FileWriter writer = new FileWriter("job03/output.txt")) {
                writer.write(firstHalf);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try (FileWriter writer = new FileWriter("job03/output.txt", true)) {
                writer.write(secondHalf);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Temps d'exécution : " + duration + " ms");

        scanner.close();
    }
}
