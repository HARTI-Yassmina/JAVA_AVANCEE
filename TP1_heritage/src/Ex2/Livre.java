package Ex2;

public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;

    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "ISBN: " + ISBN + ", Titre: " + titre + ", Auteur: [" + auteur.toString() + "]";
    }
}

