package A07_Single_Dimensional_Arrays.Exercises;

public class Exercise07_07 {
    public static void main(String[] args) {
        int[] count = new int[10];

        for (int i=0; i<100; i++){
            int number = (int)(Math.random()*10);
            count[number]++;
        }

        for (int i=0; i<count.length; i++){
            System.out.print(i + "s:" + count[i] + " ");
        }
    }
}
