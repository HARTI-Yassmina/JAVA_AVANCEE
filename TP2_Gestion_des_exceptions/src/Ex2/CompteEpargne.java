package Ex2;

class CompteEpargne extends CompteBancaire {
    private double tauxInteret;

    // Constructeur
    public CompteEpargne(String nomTitulaire, double tauxInteret) {
        super(nomTitulaire);
        this.tauxInteret = tauxInteret;
    }

    // Méthode pour générer les intérêts
    public void genererInterets() {
        double interets = solde * (tauxInteret / 100);
        solde += interets;
        System.out.println("Intérêts générés : " + interets + ". Nouveau solde : " + solde);
    }
}