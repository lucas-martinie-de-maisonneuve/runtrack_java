package jour03.job02;

public class Tableau {
    public static void main(String[] args) {
        int[] monTableau = { 12, 6, 76, 89 };

        System.out.println("Tableau avant modification :");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("i" + i + " : " + monTableau[i]);
        }

        monTableau[0] = 5;
        monTableau[1] = 15;
        monTableau[2] = 25;
        monTableau[3] = 35;

        System.out.println("Tableau modifié :");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.println("i" + i + " : " + monTableau[i]);
        }
    }

}
