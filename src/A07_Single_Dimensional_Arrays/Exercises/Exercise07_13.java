package A07_Single_Dimensional_Arrays.Exercises;

public class Exercise07_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1,2,3,4,5));
    }

    public static int getRandom(int... numbers){
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int)(Math.random() * 54);
            for (int i : numbers) {
                if (num == i) {
                    isExcluded = true;
                    break;
                }
            }
        } while (isExcluded);
        return num;
    }
}
