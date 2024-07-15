package Ex1;

public class Compte {
    private String numero;
    private double solde;
    private static int nbComptes = 0;

    public Compte() {
        this.numero = "";
        this.solde = 0;
        nbComptes++;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        if (montant > 0) {
            this.solde += montant;
            System.out.println(montant + " déposé avec succès.");
        } else {
            System.out.println("Montant invalide pour le dépôt.");
        }
    }

    public void retirer(double montant) {
        if (montant > 0 && montant <= this.solde) {
            this.solde -= montant;
            System.out.println(montant + " retiré avec succès.");
        } else {
            System.out.println("Solde insuffisant pour effectuer cette opération.");
        }
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte : " + numero);
        System.out.println("Solde : " + solde);
    }

    public static void afficherNbComptes() {
        System.out.println("Nombre de comptes créés : " + nbComptes);
    }
}
