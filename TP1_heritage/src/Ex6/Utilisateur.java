package Ex6;

class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        objet.emprunter();
    }
}

