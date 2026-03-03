package A06_Methods.Exercises;

public class Exercise06_06 {
    public static void main(String[] args) {
        displayPattern(15);
    }

    public static void displayPattern(int n){

        for (int i = 1; i <= n; i++) {
            for (int spaces = 1; spaces <= n-i; spaces++) {
                System.out.print("   ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.printf("%2d ", j);
            }

            System.out.println();
        }
    }
}
