package A05_Loops.Exercises;

public class Exercise05_19 {
    public static void main(String[] args) {

    }

    public static void pyramid(){
        int lines = 7;

        for (int k=0; k<=lines; k++){

            for (int l = k; l <= lines-1; l++)
                System.out.print("__");

            for(int i = 0; i<k; i++)
                System.out.print((int)Math.pow(2, i) + "i ");

            for(int j = k; j >= 0; j--) {
                System.out.print((int)Math.pow(2, j) + "j ");
            }

            System.out.println();
        }
    }

}
