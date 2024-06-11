package jour02.job05;

import java.util.Scanner;

public class AgeTravail {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez l'âge de la personne : ");
        age = input.nextInt();

        if (age < 16)
            System.out.println("La personne n'a pas l'âge de travailler");
        else if (age < 55)
            System.out.println("La personne peut travailler");
        else if (age < 67)
            System.out.println("La personne aura du mal à trouver du travail");
        else
            System.out.println("La personne est à la retraite");

        input.close();
    }
}
