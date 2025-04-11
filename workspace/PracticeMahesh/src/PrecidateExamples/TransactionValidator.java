package PrecidateExamples;

import java.util.function.Predicate;

public class TransactionValidator {

    public static void main(String[] args) {
        Double amount = 500.0;

        Predicate<Double> isWithinLimit = amt -> amt > 0 && amt <= 1000;

        if (isWithinLimit.test(amount)){
            System.out.println("Amount is Valid");
        } else {
            System.out.println("Amount is not valid");
        }


    }
}
