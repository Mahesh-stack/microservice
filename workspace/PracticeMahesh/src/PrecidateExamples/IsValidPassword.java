package PrecidateExamples;

import java.util.function.Predicate;

public class IsValidPassword {

    public static void main(String[] args) {
        String password = "p@Ssword123";

        Predicate<String> isLongEnough = s -> s.length() >= 8;
        Predicate<String> hasUpperCase = s -> s.matches(".*[A-Z].*");
        Predicate<String> hasLowerCase = s -> s.matches(".*[a-z].*");
        Predicate<String> hasSpecialChar = s -> s.matches(".*[!@#$%^&*()_+].*");

        Predicate<String> isValid = isLongEnough.and(hasUpperCase).and(hasLowerCase).and(hasSpecialChar);
        System.out.println(isValid.test(password));
    }
}
