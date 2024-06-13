package jour04.job02;

import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class RandomString {

    public static String generateRandomString(int longueur) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(longueur);
        
        for (int i = 0; i < longueur; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Saisir la longueur de la chaîne : ");
        int longueur = scanner.nextInt();
        scanner.close();
        
        long startTime = System.currentTimeMillis();
        
        String randomString = generateRandomString(longueur);
        
        try (FileWriter writer = new FileWriter("jour04/job02/output.txt")) {
            writer.write(randomString);
        } catch (Exception  e) {
            System.out.println("Une erreur est survenue lors de l'écriture dans le fichier.");
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        long execution = endTime - startTime;
        
        System.out.println("Temps d'exécution : " + execution + " ms.");
    }
}

