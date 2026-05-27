package app;

/**
 * Main entry point of the application.
 * Orchestrates the execution of functional programming demonstrations.
 */
public class Main {
    /**
     * Executes the lambda and functional interface demonstration scenario.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.printf("=== Lambdas in Action: Math and Strings ===%n%n");

        LambdaDemoService demoService = new LambdaDemoService();

        try {
            demoService.demoAnonymousClass();
            demoService.demoLambdaExpression();
            demoService.demoNonStaticMethodReference();
            demoService.demoStaticMethodReference();
            demoService.demoSupplier();
        } catch (IllegalArgumentException e) {
            System.err.printf("Error during execution (Invalid Argument): %s%n", e.getMessage());
        }
    }
}