package Ex1;

public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(10);
            System.out.println("Valeur initiale : " + entier.getVal());

            entier.decrementer();
            System.out.println("Valeur après décrémentation : " + entier.getVal());

            entier.setVal(5);
            System.out.println("Valeur après modification : " + entier.getVal());

            entier.setVal(-3);
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée : " + e.getMessage());
            System.err.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            EntierNaturel entierNegatif = new EntierNaturel(-1);
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée : " + e.getMessage());
            System.err.println("Valeur erronée : " + e.getValeurErronee());
        }

        try {
            EntierNaturel entier = new EntierNaturel(0);
            entier.decrementer();
        } catch (NombreNegatifException e) {
            System.err.println("Exception capturée : " + e.getMessage());
            System.err.println("Valeur erronée : " + e.getValeurErronee());
        }
    }
}

