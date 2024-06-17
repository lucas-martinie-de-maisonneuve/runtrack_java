package jour03.job03;

public class Tableau {
    public static void main(String[] args) {
        String[] noms = { "Josette", "John", "Myrtille", "Marc" };

        System.out.println("Index 1 : " + noms[1]);

        noms[2] = "Mireille";

        System.out.println("Tableau modifié :");
        for (int i = 0; i < noms.length; i++) {
            System.out.println("i" + i + " : " + noms[i]);
        }
    }

}
