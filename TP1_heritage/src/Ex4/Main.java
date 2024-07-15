package Ex4;

public class Main {
    public static void main(String[] args) {
        Ingenieur ingenieur = new Ingenieur("HARTI", "yassmina", "harti@example.com", "0102030405", 3000, "Développement logiciel");
        double salaireIngenieur = ingenieur.calculerSalaire();
        ingenieur.salaire = salaireIngenieur;

        Manager manager = new Manager("HARTI", "nour", "harti@example.com", "0607080910", 4000, "Ressources Humaines");
        double salaireManager = manager.calculerSalaire();
        manager.salaire = salaireManager;

        System.out.println("Informations de l'Ingénieur:");
        ingenieur.afficherInformations();
        System.out.println();

        System.out.println("Informations du Manager:");
        manager.afficherInformations();
    }
}
