package jour01.job08;

public class Facture {
    public static void main(String[] args) {

        float prix = (float) 49.99;
        int quantite = 3;
        float tarifHT = prix * quantite;
        float tva = (float) 0.2 * tarifHT;

        float tarifTTC = (float) tarifHT + tva;

        System.out.println("Le montant total HT est de " + tarifHT);
        System.out.println("Le montant de la taxe est de " + tva);
        System.out.println("Le montant total TTC est de " + tarifTTC);
    }
}
