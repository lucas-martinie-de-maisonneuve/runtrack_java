package jour01.job06;

public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 5, num2 = 10;
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("La valeur de num1 est " + num1 + " et la valeur de num2 est " + num2);
    }
}
