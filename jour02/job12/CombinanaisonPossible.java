package jour02.job12;

public class CombinanaisonPossible {
    public static void main(String[] args) {
        int combinaison = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    System.out.print("[" + i + "," + j + "," + k + "] ");
                    combinaison ++;
                }
            }
        }
        System.out.println("Nombre de combinanison maximum : " + combinaison);
    }
}
