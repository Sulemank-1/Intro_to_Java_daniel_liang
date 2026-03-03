package A03_Selections.Exercises;

public class Exercise03_16 {
    public static void main(String[] args) {

    }

    public static void randomPoint16(){
        // Formula: Min + Math.random() * (Max - Min)
        int x = (int) (-100 + Math.random() * (100 - (-100)));
        int y = (int) (-200 + Math.random() * (200 - (-200)));

        System.out.print("Random Point: " + "(" + x + ", " + y + ")");
    }

}
