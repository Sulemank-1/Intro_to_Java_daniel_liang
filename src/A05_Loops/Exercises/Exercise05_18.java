package A05_Loops.Exercises;

public class Exercise05_18 {
    public static void main(String[] args) {

    }

    public static void fourPatterns(){
        int lines = 15;

        for (int k=1; k<=lines; k++){


            for(int i = 1; i<=k; i++)
                System.out.print(i + " ");


            System.out.println();
        }

        System.out.println();

        for (int k=lines; k>=1; k--){

            for(int i = 1; i<=k; i++)
                System.out.print(i + " ");

            System.out.println();
        }

        for (int k=1; k<=lines; k++){

            for (int l = k; l <= lines-1; l++)
                System.out.print(" ");

            for(int j = k; j>=1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println();

        for (int k=lines; k>=1; k--){

            for (int l = k; l <= lines-1; l++)
                System.out.print(" ");

            for(int j = 1; j<=k; j++) {
                System.out.print(j + " ");
            }



            System.out.println();
        }
    }

}
