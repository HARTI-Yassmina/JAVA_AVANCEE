package Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    private static IMetier<Produit> metier = new MetierProduitImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuer = true;

        while (continuer) {
            afficherMenu();
            int choix = lireChoixUtilisateur();

            switch (choix) {
                case 1:
                    afficherListeProduits();
                    break;
                case 2:
                    rechercherProduitParId();
                    break;
                case 3:
                    ajouterProduit();
                    break;
                case 4:
                    supprimerProduit();
                    break;
                case 5:
                    continuer = false;
                    System.out.println("Merci d'avoir utilisé notre application !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option de 1 à 5.");
                    break;
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("\nMenu :");
        System.out.println("1. Afficher la liste des produits.");
        System.out.println("2. Rechercher un produit par son id.");
        System.out.println("3. Ajouter un nouveau produit.");
        System.out.println("4. Supprimer un produit par id.");
        System.out.println("5. Quitter ce programme.");
        System.out.print("Votre choix : ");
    }

    private static int lireChoixUtilisateur() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Pour consommer le token erroné
            return -1;
        }
    }

    private static void afficherListeProduits() {
        System.out.println("\nListe des produits :");
        for (Produit produit : metier.getAll()) {
            System.out.println(produit);
        }
    }

    private static void rechercherProduitParId() {
        System.out.print("\nEntrez l'id du produit à rechercher : ");
        long id = scanner.nextLong();
        Produit produit = metier.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé : " + produit);
        } else {
            System.out.println("Aucun produit trouvé avec l'id : " + id);
        }
    }

    private static void ajouterProduit() {
        scanner.nextLine();
        System.out.println("\nAjout d'un nouveau produit :");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Marque : ");
        String marque = scanner.nextLine();
        System.out.print("Prix : ");
        double prix = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Description : ");
        String description = scanner.nextLine();
        System.out.print("Nombre en stock : ");
        int nombreEnStock = scanner.nextInt();

        long id = System.currentTimeMillis();

        Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
        metier.add(nouveauProduit);
        System.out.println("Nouveau produit ajouté avec succès.");
    }

    private static void supprimerProduit() {
        System.out.print("\nEntrez l'id du produit à supprimer : ");
        long id = scanner.nextLong();
        metier.delete(id);
    }
}

