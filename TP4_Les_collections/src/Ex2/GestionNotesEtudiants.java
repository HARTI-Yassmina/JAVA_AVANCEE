package Ex2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionNotesEtudiants {
    public static void main(String[] args) {
        Map<String, Double> notesEtudiants = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insérer une note d'un étudiant");
            System.out.println("2. Augmenter la note d'un étudiant");
            System.out.println("3. Supprimer la note d'un étudiant");
            System.out.println("4. Afficher la taille du map");
            System.out.println("5. Afficher la note moyenne, max et min");
            System.out.println("6. Vérifier s'il y a une note égale à 20");
            System.out.println("0. Quitter");

            System.out.print("Choix: ");
            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de l'étudiant: ");
                    String nomEtudiant = scanner.nextLine();
                    System.out.print("Entrez la note de l'étudiant: ");
                    double note = scanner.nextDouble();
                    notesEtudiants.put(nomEtudiant, note);
                    afficherListe(notesEtudiants);
                    break;
                case 2:
                    System.out.print("Entrez le nom de l'étudiant dont vous voulez augmenter la note: ");
                    String nomAugmenter = scanner.nextLine();
                    if (notesEtudiants.containsKey(nomAugmenter)) {
                        System.out.print("Entrez le montant à ajouter à la note: ");
                        double montantAjouter = scanner.nextDouble();
                        double nouvelleNote = notesEtudiants.get(nomAugmenter) + montantAjouter;
                        notesEtudiants.put(nomAugmenter, nouvelleNote);
                        System.out.println("Note augmentée avec succès.");
                    } else {
                        System.out.println("Étudiant non trouvé.");
                    }
                    afficherListe(notesEtudiants);
                    break;
                case 3:
                    System.out.print("Entrez le nom de l'étudiant dont vous voulez supprimer la note: ");
                    String nomSupprimer = scanner.nextLine();
                    if (notesEtudiants.containsKey(nomSupprimer)) {
                        notesEtudiants.remove(nomSupprimer);
                        System.out.println("Note supprimée avec succès.");
                    } else {
                        System.out.println("Étudiant non trouvé.");
                    }
                    afficherListe(notesEtudiants);
                    break;
                case 4:
                    System.out.println("Taille du map : " + notesEtudiants.size());
                    break;
                case 5:
                    afficherStats(notesEtudiants);
                    break;
                case 6:
                    boolean noteEgaleA20 = false;
                    for (double noteEtudiant : notesEtudiants.values()) {
                        if (noteEtudiant == 20.0) {
                            noteEgaleA20 = true;
                            break;
                        }
                    }
                    if (noteEgaleA20) {
                        System.out.println("Il y a une note égale à 20.");
                    } else {
                        System.out.println("Aucune note égale à 20.");
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }

    private static void afficherListe(Map<String, Double> map) {
        System.out.println("Liste des étudiants et leurs notes : ");
        map.forEach((nom, note) -> System.out.println(nom + " : " + note));
    }

    private static void afficherStats(Map<String, Double> map) {
        if (map.isEmpty()) {
            System.out.println("Aucune note disponible.");
            return;
        }

        double somme = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        for (double note : map.values()) {
            somme += note;
            if (note < min) {
                min = note;
            }
            if (note > max) {
                max = note;
            }
        }

        double moyenne = somme / map.size();
        System.out.println("Note moyenne : " + moyenne);
        System.out.println("Note minimale : " + min);
        System.out.println("Note maximale : " + max);
    }
}

