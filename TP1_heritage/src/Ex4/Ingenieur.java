package Ex4;

class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur() {}

    public Ingenieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.15;
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Specialite: " + specialite);
    }
}

