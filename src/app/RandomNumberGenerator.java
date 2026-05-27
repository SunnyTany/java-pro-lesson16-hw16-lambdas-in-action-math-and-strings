package app;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Utility class providing methods for random numbers generation.
 */
public class RandomNumberGenerator {
    /**
     * Generates a random integer within a specified range, inclusive of both limits.
     * Uses highly efficient ThreadLocalRandom under the hood.
     *
     * @param min the lower bound of the range
     * @param max the upper bound of the range
     * @return a random integer between min and max inclusive
     * @throws IllegalArgumentException if the minimum value is greater than the maximum value
     */
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value cannot be greater than max value");
        }
        // ThreadLocalRandom nextInt(origin, bound) is exclusive of the bound, so we add 1
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}