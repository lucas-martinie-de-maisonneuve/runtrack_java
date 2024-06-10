package jour01.Job09;

public class MyString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        String str3 = str1 + " " + str2;

        StringBuilder sb =  new StringBuilder() ;  
        sb.append(str1).append(" ").append("World");
        String str4 = sb.toString();

        // Affichage des valeurs des variables
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("str3 : " + str3);
        System.out.println("str4 : " + str4);
    }
}
