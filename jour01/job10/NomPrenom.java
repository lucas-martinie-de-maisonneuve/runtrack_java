package jour01.job10;

import java.util.StringJoiner;

public class NomPrenom {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(" ", " ", " ");
        stringJoiner.add("Lucas");
        stringJoiner.add("Martinie");

        String concat = stringJoiner.toString();
        System.out.println(concat);
    }
}
