package Ex7;

class Paiement {
    protected double montant;
    protected String numeroTransaction;

    public Paiement(double montant, String numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " en cours...");
    }
}

