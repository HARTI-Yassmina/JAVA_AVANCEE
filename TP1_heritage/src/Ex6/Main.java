package Ex6;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre("livre1", "auteur1");
        Livre livre2 = new Livre("livre2", "auteur2");

        DVD dvd1 = new DVD("DVD1", "Realisateur1");
        DVD dvd2 = new DVD("DVD2", "Realisateur2");

        Utilisateur utilisateur = new Utilisateur("yassmina");

        utilisateur.emprunterObjet(livre1);
        utilisateur.emprunterObjet(dvd1);
        utilisateur.emprunterObjet(livre2);
        utilisateur.emprunterObjet(dvd2);

        utilisateur.emprunterObjet(livre1);

        livre1.retourner();
        dvd1.retourner();

        livre1.retourner();
    }
}
