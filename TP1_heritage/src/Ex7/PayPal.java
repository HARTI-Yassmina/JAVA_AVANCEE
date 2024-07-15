package Ex7;

class PayPal extends Paiement {
    private String email;

    public PayPal(double montant, String numeroTransaction, String email) {
        super(montant, numeroTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        System.out.println("Paiement de " + montant + " via PayPal (Email: " + email + ").");
    }
}
