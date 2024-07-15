package Ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperationsSurListeDeMots {
    public static void main(String[] args) {
        List<String> mots = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby", "Swift");

        // 1. Filtrer les mots qui contiennent la lettre "a"
        List<String> motsAvecA = mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Mots contenant la lettre 'a' : " + motsAvecA);

        // 2. Filtrer les mots avec longueur > 3 et transformer chaque mot en son inverse
        List<String> motsInverseLongueurSuperieure3 = mots.stream()
                .filter(mot -> mot.length() > 3)
                .map(mot -> new StringBuilder(mot).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Mots avec longueur > 3 et inversés : " + motsInverseLongueurSuperieure3);

        // 3. Filtrer les mots contenant la lettre "e" et aplatir chaque chaîne en une liste de ses caractères
        List<Character> caracteresMotsAvecE = mots.stream()
                .filter(mot -> mot.contains("e"))
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Caractères des mots contenant la lettre 'e' : " + caracteresMotsAvecE);

        // 4. Transformer chaque chaîne en majuscules
        List<String> motsEnMajuscules = mots.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Mots en majuscules : " + motsEnMajuscules);

        // 5. Convertir chaque chaîne en sa longueur
        List<Integer> longueursMots = mots.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Longueurs des mots : " + longueursMots);

        // 6. Transformer chaque chaîne en une liste de ses caractères, puis aplatir toutes les listes
        List<Character> caracteresAplatis = mots.stream()
                .flatMap(mot -> mot.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList());
        System.out.println("Liste aplatie des caractères : " + caracteresAplatis);

        // 7. Transformer chaque nom en une chaîne de la forme "Nom - Index"
        List<String> nomsAvecIndex = IntStream.range(0, mots.size())
                .mapToObj(i -> mots.get(i) + " - " + i)
                .collect(Collectors.toList());
        System.out.println("Noms avec index : " + nomsAvecIndex);
    }
}

