package Ex5;

public class Main {
    public class GestionFigures {
        public static void main(String[] args) {
            Cercle cercle = new Cercle("Cercle1", 5.0);
            System.out.println("Détails du Cercle:");
            cercle.afficherDetails();
            System.out.println();

            Rectangle rectangle = new Rectangle("Rectangle1", 4.0, 7.0);
            System.out.println("Détails du Rectangle:");
            rectangle.afficherDetails();
            System.out.println();
        }
    }

}
