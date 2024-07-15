package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OperationsSurListeEmployes {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("ali", "IT", 5000));
        employees.add(new Employee("reda", "HR", 4500));
        employees.add(new Employee("mehdi", "Finance", 6000));
        employees.add(new Employee("youssef", "Marketing", 4800));
        employees.add(new Employee("chouaib", "IT", 5200));

        double sommeSalaires = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Somme totale des salaires : " + sommeSalaires);

        List<Employee> employeesTriesParNom = employees.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
        System.out.println("Liste des employés triés par nom : ");
        employeesTriesParNom.forEach(System.out::println);

        Optional<Employee> employeSalaireMinimum = employees.stream()
                .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employeSalaireMinimum.ifPresent(emp -> System.out.println("Employé avec le salaire le plus bas : " + emp));

        double salaireMinimum = 5000;
        List<Employee> employesSalaireSup = employees.stream()
                .filter(emp -> emp.getSalary() > salaireMinimum)
                .collect(Collectors.toList());
        System.out.println("Liste des employés avec un salaire supérieur à " + salaireMinimum + " : ");
        employesSalaireSup.forEach(System.out::println);

        Optional<Employee> employeSalaireMaximum = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employeSalaireMaximum.ifPresent(emp -> System.out.println("Employé avec le salaire le plus élevé : " + emp));

        String nomsConcatenes = employees.stream()
                .map(Employee::getName)
                .reduce((nom1, nom2) -> nom1 + ", " + nom2)
                .orElse("");
        System.out.println("Noms de tous les employés concaténés : " + nomsConcatenes);
    }
}
