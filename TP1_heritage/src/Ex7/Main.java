package Ex7;

public class Main {
    public static void main(String[] args) {
        CarteCredit carteCredit = new CarteCredit(100.0, "TX123456", "1234-5678-9101-1121");
        PayPal payPal = new PayPal(150.0, "TX654321", "user@example.com");

        Commande commande1 = new Commande(100.0, carteCredit);
        Commande commande2 = new Commande(150.0, payPal);

        System.out.println("Traitement des paiements pour les commandes:");
        commande1.processPayment();
        commande2.processPayment();
    }
}
