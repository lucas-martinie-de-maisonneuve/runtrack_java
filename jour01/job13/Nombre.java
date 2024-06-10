package jour01.job13;

import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int num = nombre.nextInt();
        int i = 1;
        while (i <= num){
            System.out.print(i + " ");
            i++;
        }  
        nombre.close();
    }
}
