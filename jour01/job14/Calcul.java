package jour01.job14;
import java.util.Scanner;

public class Calcul {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.print("Entrez le 1er nombre : ");
        int nb1 = num.nextInt();
        System.out.print("Entrez le 2ème nombre : ");
        int nb2 = num.nextInt();

        int result = Somme(nb1, nb2);

        System.out.print(nb1 + " + " + nb2 + " = " + result);

        num.close();
    }

    public static int Somme(int a, int b) {
        int result = a + b;
        return result;
    }
}
