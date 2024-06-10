package jour01.job11;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int heure = 0, minutes = 0, total = 0;
        Scanner time = new Scanner(System.in);
        System.out.println("Entrez une durée en minutes : ");
        total = time.nextInt(); 
        if (total >= 60) {
            heure = total / 60;
            minutes = total % 60; 
        }
        System.out.println(total + " minutes équivaut à " + heure + " heures et " + minutes + " minutes");

        time.close();
    }
}
