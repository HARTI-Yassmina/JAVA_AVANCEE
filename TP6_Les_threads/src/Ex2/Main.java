package Ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int nombreThreads = 4;

        int taillePlage = tableau.length / nombreThreads;

        ExecutorService poolThreads = Executors.newFixedThreadPool(nombreThreads);

        long sommeTotale = 0;

        for (int i = 0; i < nombreThreads; i++) {
            int debutPlage = i * taillePlage;
            int finPlage = (i == nombreThreads - 1) ? tableau.length - 1 : (i + 1) * taillePlage - 1;

            Sommeur sommeur = new Sommeur(tableau, debutPlage, finPlage);
            poolThreads.execute(sommeur);
        }

        poolThreads.shutdown();

        try {
            poolThreads.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < nombreThreads; i++) {
            int debutPlage = i * taillePlage;
            int finPlage = (i == nombreThreads - 1) ? tableau.length - 1 : (i + 1) * taillePlage - 1;

            Sommeur sommeur = new Sommeur(tableau, debutPlage, finPlage);
            sommeTotale += sommeur.getSomme();
        }

        System.out.println("Somme totale du tableau : " + sommeTotale);
    }
}
