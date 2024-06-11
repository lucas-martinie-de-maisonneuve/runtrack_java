package jour02.job10;

public class AdditionnerChiffre {
    public static void main(String[] args) {
        int numero = 1234;
        int somme = 0;

        while (numero > 0) {
            int i = numero % 10; 
            somme += i;
            numero /= 10;
        }

        System.out.println("La somme des chiffres est : " + somme);
    }
}
