package Ex2;

import java.util.UUID;

class CompteBancaire {
    private String numeroCompte;
    protected double solde;
    private String nomTitulaire;

    public CompteBancaire(String nomTitulaire) {
        this.numeroCompte = UUID.randomUUID().toString(); // Génération d'un numéro de compte aléatoire
        this.solde = 0.0;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        solde += montant;
        System.out.println("Dépôt de " + montant + " effectué. Nouveau solde : " + solde);
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        }
        solde -= montant;
        System.out.println("Retrait de " + montant + " effectué. Nouveau solde : " + solde);
    }

    public void afficherSolde() {
        System.out.println("Solde du compte : " + solde);
    }

    public void transferer(CompteBancaire autreCompte, double montant) throws FondsInsuffisantsException, CompteInexistantException {
        if (montant > solde) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le transfert.");
        }
        if (autreCompte == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        }
        retirer(montant);
        autreCompte.deposer(montant);
        System.out.println("Transfert de " + montant + " effectué vers le compte de " + autreCompte.nomTitulaire);
    }
}

