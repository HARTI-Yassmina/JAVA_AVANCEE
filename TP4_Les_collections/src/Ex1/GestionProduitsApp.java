package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionProduitsApp {
    public static void main(String[] args) {
        ArrayList<Produit> listeProduits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        listeProduits.add(new Produit(1, "Livre", 15.99));
        listeProduits.add(new Produit(2, "Stylo", 2.50));
        listeProduits.add(new Produit(3, "Cahier", 4.75));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Supprimer un produit par indice");
            System.out.println("3. Afficher la liste des produits");
            System.out.println("4. Modifier un produit par indice");
            System.out.println("5. Rechercher un produit par nom");
            System.out.println("0. Quitter");

            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'id du produit: ");
                    long id = scanner.nextLong();
                    scanner.nextLine(); // Consommer le retour à la ligne
                    System.out.print("Entrez le nom du produit: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez le prix du produit: ");
                    double prix = scanner.nextDouble();
                    listeProduits.add(new Produit(id, nom, prix));
                    System.out.println("Produit ajouté avec succès.");
                    break;
                case 2:
                    System.out.print("Entrez l'indice du produit à supprimer: ");
                    int indiceSupprimer = scanner.nextInt();
                    if (indiceSupprimer >= 0 && indiceSupprimer < listeProduits.size()) {
                        listeProduits.remove(indiceSupprimer);
                        System.out.println("Produit supprimé avec succès.");
                    } else {
                        System.out.println("Indice invalide.");
                    }
                    break;
                case 3:
                    System.out.println("Liste des produits:");
                    for (Produit produit : listeProduits) {
                        System.out.println(produit);
                    }
                    break;
                case 4:
                    System.out.print("Entrez l'indice du produit à modifier: ");
                    int indiceModifier = scanner.nextInt();
                    scanner.nextLine(); // Consommer le retour à la ligne
                    if (indiceModifier >= 0 && indiceModifier < listeProduits.size()) {
                        System.out.print("Entrez le nouveau nom du produit: ");
                        String nouveauNom = scanner.nextLine();
                        System.out.print("Entrez le nouveau prix du produit: ");
                        double nouveauPrix = scanner.nextDouble();
                        listeProduits.get(indiceModifier).setNom(nouveauNom);
                        listeProduits.get(indiceModifier).setPrix(nouveauPrix);
                        System.out.println("Produit modifié avec succès.");
                    } else {
                        System.out.println("Indice invalide.");
                    }
                    break;
                case 5:
                    System.out.print("Entrez le nom du produit à rechercher: ");
                    String nomRecherche = scanner.nextLine();
                    boolean trouve = false;
                    for (Produit produit : listeProduits) {
                        if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                            System.out.println("Produit trouvé: " + produit);
                            trouve = true;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Produit non trouvé.");
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }
}

