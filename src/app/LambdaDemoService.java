package app;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Service class responsible for demonstrating various Java functional programming features.
 */
public class LambdaDemoService {

    /**
     * Demonstrates the usage of an anonymous class implementing {@link MathOperation}
     * to perform an addition operation.
     */
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

    /**
     * Demonstrates the usage of a lambda expression implementing {@link StringManipulator}
     * to convert a string to uppercase.
     */
    public void demoLambdaExpression() {
        StringManipulator toUpperCase = s -> s.toUpperCase();
        String upperText = toUpperCase.manipulate("hello java lambda");
        System.out.printf("2. Lambda StringManipulator (to upper case): %s%n", upperText);
    }

    /**
     * Demonstrates a non-static method reference (Class::instanceMethod) on an arbitrary object.
     * Maps an input string to lowercase via Function interface.
     */
    public void demoNonStaticMethodReference() {
        // String::toLowerCase is an instance method reference, equivalent to: s -> s.toLowerCase()
        Function<String, String> toLowerCaseConverter = String::toLowerCase;
        String testString = "JAVA_METHOD_REFERENCE";
        String lowerText = toLowerCaseConverter.apply(testString);
        System.out.printf("3. Non-static method reference (to lower case: '%s'): %s%n", testString, lowerText);
    }

    /**
     * Demonstrates the usage of a static method reference (Class::staticMethod).
     * Passes {@link StringListProcessor#countUppercase(String)} as an argument to a {@link Function}.
     */
    public void demoStaticMethodReference() {
        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        String testString = "JavaStaticMethodReferenceInAction";
        int uppercaseCount = uppercaseCounter.apply(testString);
        System.out.printf("4. Static method reference (uppercase count in '%s'): %d%n", testString, uppercaseCount);
    }

    /**
     * Demonstrates the usage of a built-in {@link Supplier} interface to lazy-generate
     * random numbers using {@link RandomNumberGenerator}.
     */
    public void demoSupplier() {
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.printf("5. Supplier using ThreadLocalRandom (random number 1-100): %d%n", randomSupplier.get());
        System.out.printf("6. Supplier using ThreadLocalRandom (another random number): %d%n", randomSupplier.get());
    }
}