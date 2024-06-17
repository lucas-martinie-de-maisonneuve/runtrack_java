package jour03.job05;

public class ValeurUnique {
    static void Unique(int[] tableau) {
        int[] count = new int[10];

        for (int i = 0; i < tableau.length; i++) {
            count[tableau[i]]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 1) {
                System.out.println("Nombre " + i + " : " + count[i] + " fois");
            }
        }
    }

    public static void main(String[] args) {
        int[] tableau = { 3, 7, 3, 9, 8 };
        Unique(tableau);
    }

}
