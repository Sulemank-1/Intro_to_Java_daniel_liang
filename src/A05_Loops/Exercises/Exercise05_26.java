package A05_Loops.Exercises;

public class Exercise05_26 {
    public static void main(String[] args) {

    }

    public static void computeE(){
        int n = 100000;
        double e = 1.0;
        double item = 1.0;
        for (int i=1; i<=n; i++){
            item = item / i;

            e+=item;
        }

        System.out.println(e);
    }

}
