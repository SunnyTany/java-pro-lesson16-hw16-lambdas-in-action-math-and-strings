package app;

public class Main {
    public static void main(String[] args) {
        System.out.printf("=== Lambdas in Action: Math and Strings ===%n%n");

        LambdaDemoService demoService = new LambdaDemoService();

        try {
            demoService.demoAnonymousClass();
            demoService.demoLambdaExpression();
            demoService.demoMethodReference();
            demoService.demoSupplier();
        } catch (IllegalArgumentException e) {
            System.err.printf("Error during execution: %s%n", e.getMessage());
        } catch (Exception e) {
            System.err.printf("An unexpected error occurred: %s%n", e.getMessage());
        }
    }
}