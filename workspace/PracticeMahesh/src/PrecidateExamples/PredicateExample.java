package PrecidateExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();

        emp.add(new Employee("A", 20));
        emp.add(new Employee("B", 30));
        emp.add(new Employee("C", 40));
        emp.add(new Employee("D", 50));
        emp.add(new Employee("E", 60));
        emp.add(new Employee("F", 70));
        emp.add(new Employee("G", 80));
        emp.add(new Employee("H", 90));
        emp.add(new Employee("I", 100));

        Predicate<Employee> olderThan30 = e -> e.getAge() >= 30;

        emp.stream().filter(olderThan30).forEach(System.out::println);


    }
}
