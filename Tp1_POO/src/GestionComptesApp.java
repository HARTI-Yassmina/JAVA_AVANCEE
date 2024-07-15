public class GestionComptesApp {
    public static void main(String[] args) {
        Compte c1 = new Compte(11111L, "Ahmed", 20000.0);
        Compte c2 = new Compte(22222L, "Hajar", 30000.0);

        System.out.println("Informations initiales des comptes :");
        System.out.println("Compte 1 :");
        c1.afficherCompteInfo();
        System.out.println("Compte 2 :");
        c2.afficherCompteInfo();

        System.out.println("\nRetrait de 19000 du compte 1");
        c1.retirer(19000.0);
        c1.afficherCompteInfo();

        System.out.println("\nRetrait de 45000 du compte 2");
        c2.retirer(45000.0);
        c2.afficherCompteInfo();

        System.out.println("\nDépôt de 15000 dans le compte 1");
        c1.deposer(15000.0);
        c1.afficherCompteInfo();
    }
}
