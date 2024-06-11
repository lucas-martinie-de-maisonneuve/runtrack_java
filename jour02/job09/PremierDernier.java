package jour02.job09;

public class PremierDernier {
    public static void main(String[] args) {
        int numero = 1234;
        int dernierChiffre = numero % 10;

        int premierChiffre = numero;
        while (premierChiffre >= 10) {
            premierChiffre /= 10;
        }

        System.out.println("Premier chiffre : " + premierChiffre + " | Dernier chiffre : " + dernierChiffre);
    }
}
