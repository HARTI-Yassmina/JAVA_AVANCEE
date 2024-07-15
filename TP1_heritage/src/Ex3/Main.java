package Ex3;

public class Main {
    public static void main(String[] args) {
        Voiture voiture = new Voiture("Voiture de sport", 50000.0, "Model S", 2022);

        Moto moto = new Moto("Moto de course", 15000.0, "Yamaha", 200);

        Avion avion = new Avion("Avion commercial", 150000000.0, "Airbus", 900);

        System.out.println("Son de la voiture:");
        voiture.emettreSon();

        System.out.println("\nSon de la moto:");
        moto.emettreSon();

        System.out.println("\nSon de l'avion:");
        avion.emettreSon();

        System.out.println("\nInformations de la voiture:");
        voiture.afficherInformations();

        System.out.println("\nInformations de la moto:");
        moto.afficherInformations();

        System.out.println("\nInformations de l'avion:");
        avion.afficherInformations();
    }
}
