package Ex2;

class Sommeur implements Runnable {
    private int[] tableau;
    private int debut;
    private int fin;
    private long somme;

    public Sommeur(int[] tableau, int debut, int fin) {
        this.tableau = tableau;
        this.debut = debut;
        this.fin = fin;
        this.somme = 0;
    }

    public void run() {
        for (int i = debut; i <= fin; i++) {
            somme += tableau[i];
        }
    }

    public long getSomme() {
        return somme;
    }
}