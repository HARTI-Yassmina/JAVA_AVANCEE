package Ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> listeComptes = new ArrayList<>();

        CompteBancaire compte1 = new CompteBancaire("Alice");
        CompteCourant compte2 = new CompteCourant("Bob", 500);
        CompteEpargne compte3 = new CompteEpargne("Eve", 3);

        listeComptes.add(compte1);
        listeComptes.add(compte2);
        listeComptes.add(compte3);

        try {
            compte1.deposer(1000);
            compte2.deposer(500);
            compte3.deposer(2000);

            compte1.retirer(300);
            compte2.retirer(700); // Retrait dépassant le découvert autorisé
        } catch (FondsInsuffisantsException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        try {
            compte1.transferer(compte2, 200);
            compte2.transferer(compte3, 1000); // Transfert vers un compte inexistant
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.err.println("Erreur : " + e.getMessage());
        }

        for (CompteBancaire compte : listeComptes) {
            compte.afficherSolde();
        }

        listeComptes.remove(compte3);

        try {
            compte3.deposer(500);
        } catch (NullPointerException e) {
            System.err.println("Erreur : Tentative d'accéder à un compte supprimé.");
        }
    }
}
