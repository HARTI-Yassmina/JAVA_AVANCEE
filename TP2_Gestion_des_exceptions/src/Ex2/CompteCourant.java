package Ex2;

class CompteCourant extends CompteBancaire {
    private double decouvertAutorise;

    public CompteCourant(String nomTitulaire, double decouvertAutorise) {
        super(nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > (solde + decouvertAutorise)) {
            throw new FondsInsuffisantsException("Retrait impossible : dépassement du découvert autorisé.");
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
    }
}
