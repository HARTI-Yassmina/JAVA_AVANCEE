package Ex1;

public class App {
    public static void main(String[] args) {
        StorageGenerique<Integer> storageInt = new StorageGenerique<>();
        storageInt.addElement(10);
        storageInt.addElement(20);
        storageInt.addElement(30);

        System.out.println("Éléments de type Integer :");
        for (int i = 0; i < storageInt.getSize(); i++) {
            System.out.println(storageInt.getElement(i));
        }

        StorageGenerique<String> storageString = new StorageGenerique<>();
        storageString.addElement("Hello");
        storageString.addElement("World");

        System.out.println("\nÉléments de type String :");
        for (int i = 0; i < storageString.getSize(); i++) {
            System.out.println(storageString.getElement(i));
        }

        StorageGenerique<Double> storageDouble = new StorageGenerique<>();
        storageDouble.addElement(3.14);
        storageDouble.addElement(2.71);

        System.out.println("\nÉléments de type Double :");
        for (int i = 0; i < storageDouble.getSize(); i++) {
            System.out.println(storageDouble.getElement(i));
        }

        storageInt.removeElement(1);
        System.out.println("\nÉléments de type Integer après suppression :");
        for (int i = 0; i < storageInt.getSize(); i++) {
            System.out.println(storageInt.getElement(i));
        }
    }
}

