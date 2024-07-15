package Ex1;

public class Main {
    public static void main(String[] args) {
        Compte compte1 = new Compte();

        compte1.setNumero("12345ABC");
        compte1.setSolde(5000.0);

        System.out.println("Informations initiales du compte :");
        compte1.afficherCompteInfo();

        System.out.println("\nDépôt de 2000.0 sur le compte");
        compte1.deposer(2000.0);
        compte1.afficherCompteInfo();

        System.out.println("\nRetrait de 3000.0 du compte");
        compte1.retirer(3000.0);
        compte1.afficherCompteInfo();

        System.out.println("\nTentative de retrait de 6000.0 du compte");
        compte1.retirer(6000.0);
        compte1.afficherCompteInfo();

        Compte.afficherNbComptes();
    }
}
