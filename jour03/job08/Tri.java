package jour03.job08;

import java.util.Arrays;

public class Tri {
    public static void main(String[] args) {
        int[][] tableau = {
                { 5, 9, 3 },
                { 7, 2, 8 },
                { 1, 6, 4 }
        };

        System.out.println("Avant le tri :");
        afficherMatrice(tableau);

        for (int i = 0; i < tableau.length; i++) {
            Arrays.sort(tableau[i]);
        }

        int[][] matrice = new int[tableau.length][tableau[0].length];
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                matrice[j][i] = tableau[i][j];
            }
        }

        for (int i = 0; i < matrice.length; i++) {
            Arrays.sort(matrice[i]);
        }

        int[][] tableauTri = new int[tableau.length][tableau[0].length];
        for (int i = 0; i < tableauTri.length; i++) {
            for (int j = 0; j < tableauTri[i].length; j++) {
                tableauTri[i][j] = matrice[j][i];
            }
        }

        System.out.println("\nAprès le tri :");
        for (int i = 0; i < tableauTri.length; i++) {
            for (int j = 0; j < tableauTri[i].length; j++) {
                System.out.print(tableauTri[i][j] + " ");
            }
            System.out.println();
        }
    }
}
