package app;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min value cannot be greater than max value");
        }
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}