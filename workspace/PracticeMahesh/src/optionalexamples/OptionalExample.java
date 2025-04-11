package optionalexamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalExample {
    public static void main(String[] args) {

        Company company = new Company("Deloitte", "Mumbai", Arrays.asList(
                new Student("Mahesh", 29, "Pune"),
                new Student("Rutuja", 28, "Nashik"),
                new Student("Sangeeta", 45, "Delhi")));

         List<Student> stud = company.getStudents().stream()
                .filter(student -> student.getName() != null)
                .filter(student -> student.getAge() <= 30)
                .toList();

        System.out.println(stud);

        List<Student> studentList = Arrays.asList(new Student("Mahesh", 29, "Pune"),
                new Student("Rutuja", 28, "Nashik"),
                new Student("Sangeeta", 45, "Delhi"));

        Optional<Student> student = studentList.stream()
                .filter(student1 -> student1.getName() != null)
                .filter(student1 -> student1.getAge() <= 30)
                .findFirst();

        student.ifPresent(student1 -> System.out.println(student1));
    }
}
