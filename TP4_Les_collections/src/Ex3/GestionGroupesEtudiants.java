package Ex3;

import java.util.HashSet;
import java.util.Set;

public class GestionGroupesEtudiants {
    public static void main(String[] args) {
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        groupeA.add("ali");
        groupeA.add("youssef");
        groupeA.add("amine");

        groupeB.add("chouaib");
        groupeB.add("reda");
        groupeB.add("mehdi");

        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection des groupes A et B : " + intersection);

        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union des groupes A et B : " + union);
    }
}

