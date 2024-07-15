package Ex6;

class DVD implements Empruntable {
    private String titre;
    private String realisateur;
    private boolean estEmprunte;

    public DVD(String titre, String realisateur) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.estEmprunte = false;
    }

    @Override
    public void emprunter() {
        if (!estEmprunte) {
            estEmprunte = true;
            System.out.println("Le DVD \"" + titre + "\" a été emprunté.");
        } else {
            System.out.println("Le DVD \"" + titre + "\" est déjà emprunté.");
        }
    }

    @Override
    public void retourner() {
        if (estEmprunte) {
            estEmprunte = false;
            System.out.println("Le DVD \"" + titre + "\" a été retourné.");
        } else {
            System.out.println("Le DVD \"" + titre + "\" n'a pas été emprunté.");
        }
    }
}