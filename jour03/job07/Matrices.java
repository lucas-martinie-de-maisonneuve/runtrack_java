package jour03.job07;

public class Matrices {
    public static void main(String[] args) {
        int[][] matrice1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrice2 = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Matrice 1 :");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matriceResultat = new int[3][3];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                matriceResultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        System.out.println("Matrice 1 + Matrice 2 :");
        for (int i = 0; i < matriceResultat.length; i++) {
            for (int j = 0; j < matriceResultat[i].length; j++) {
                System.out.print(matriceResultat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
