package A05_Loops.Exercises;

public class Exercise05_17 {
    public static void main(String[] args) {
        pyramid17();
    }

    public static void pyramid17(){

        int lines = 15;

        for (int k=1; k<=lines; k++){

            for (int spaces = 1; spaces <= lines - k; spaces++) {
                System.out.print("   ");
            }

            for(int i = k; i>=1; i--)
                System.out.printf("%2d ", i);

            for(int j = 2; j<=k; j++) {
                System.out.printf("%2d ", j);
            }

            System.out.println();
        }
    }

}
