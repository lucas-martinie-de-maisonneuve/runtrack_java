package jour02.job03;
import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        int nb;
        Scanner input = new Scanner(System.in);

        System.out.print("Entrez un nombre à multiplier : ");
        nb = input.nextInt();

        for (int i = 0; i <= 10; i++){
            System.out.println(i + " X " + nb + " = " + i * nb);
        }
        input.close();
    }
}
