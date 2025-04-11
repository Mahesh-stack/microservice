package PrecidateExamples;

import java.util.function.Predicate;

public class StudentEligibility {

    public static void main(String[] args) {
        Student student = new Student("Rutuja", 45,75.0);

        Predicate<Student> marks = stud -> stud.getMarks() >= 40;
        Predicate<Student> perCentAttend = stud -> stud.getAttendancePercentage() >= 75;

        Predicate<Student> valid = marks.and(perCentAttend);

        if (valid.test(student)){
            System.out.println("Student has passed");
        } else {
            System.out.println("Student is low in marks and attendance");
        }
    }
}
