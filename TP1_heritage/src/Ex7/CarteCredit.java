package Ex7;

class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(double montant, String numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " par carte de crédit (Numéro de carte: " + numeroCarte + ").");
    }
}
