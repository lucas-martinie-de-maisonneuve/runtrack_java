package jour02.job04;

public class NombrePair {
    public static void main(String[] args) {
        System.out.println("Liste des nombres paires de 1 à 100 : ");
        for(int i = 0; i <=100; i++){
            if (i %2 == 0 && i != 0){
                System.out.print(i + " ");
            }
        } 
    }
}
