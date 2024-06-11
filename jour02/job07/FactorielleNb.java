package jour02.job07;

import java.util.Scanner;

public class FactorielleNb {
    public static void main(String[] args) {
        int X, Y = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez le nombre pour factorielle : ");
        X = input.nextInt();
        input.close();
        if (X == 0) {
            Y = 1;
        } else {
            for (int i = 1; i <= X; i++) {
                Y *= i;
            }
        }
        System.out.println("La factorielle de " + X + " est " + Y);
    }
}
