package Ex2;

public class Main {
    public static void main(String[] args) {
        Adherent adherent = new Adherent("harti", "yassmina", "harti.yassmina@example.com", "0123456789", 25, 1001);

        Auteur auteur = new Auteur("harti", "nour el houda", "harti.nour@example.com", "0987654321", 45, 2001);

        Livre livre = new Livre(123456, "Le Java pour les nuls", auteur);

        System.out.println("Informations de l'adhérent :");
        System.out.println(adherent);

        System.out.println("\nInformations du livre :");
        System.out.println(livre);
    }
}
