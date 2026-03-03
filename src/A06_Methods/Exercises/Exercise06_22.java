package A06_Methods.Exercises;

public class Exercise06_22 {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
    }

    public static double sqrt(long n){
        double lastGuess = 1.0;
        double nextGuess = (lastGuess + n / lastGuess) / 2.0;

        while (Math.abs(nextGuess - lastGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2.0;
        }

        return nextGuess;
    }
}
