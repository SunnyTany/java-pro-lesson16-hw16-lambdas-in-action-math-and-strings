package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaDemoService {

    // 1. Anonymous class for addition operation
    public void demoAnonymousClass() {
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int sumResult = addition.operate(15, 25);
        System.out.printf("1. Addition via anonymous class (15 + 25): %d%n", sumResult);
    }

    // 2. Lambda expression to convert string to uppercase
    public void demoLambdaExpression() {
        StringManipulator toUpperCase = s -> s.toUpperCase();
        String upperText = toUpperCase.manipulate("hello java lambda");
        System.out.printf("2. Lambda StringManipulator (to upper case): %s%n", upperText);
    }

    // 3. Method reference to countUppercase via Function<String, Integer>
    public void demoMethodReference() {
        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        String testString = "JavaLambdasInAction";
        int uppercaseCount = uppercaseCounter.apply(testString);
        System.out.printf("3. Method reference (uppercase count in '%s'): %d%n", testString, uppercaseCount);
    }

    // 4. Supplier interface to generate random numbers
    public void demoSupplier() {
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.printf("4. Supplier (random number 1-100): %d%n", randomSupplier.get());
        System.out.printf("5. Supplier (another random number): %d%n", randomSupplier.get());
    }
}