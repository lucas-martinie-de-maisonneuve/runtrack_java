package jour02.job11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int hauteur;
        String aster = "*";
        Scanner input = new Scanner(System.in);

        System.out.print("Veuillez entrer la hauteur du triangle : ");
        hauteur = input.nextInt();
        input.close();

        for (int i = 1; i <= hauteur; i++) {
            System.out.println(aster.repeat(i));
        }
    }
}
