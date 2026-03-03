package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Arrays;

public class Exercise07_15 {
    public static void main(String[] args) {
        int[] list = {1,2,3,2,1,6,3,4,5,2};

        System.out.println(Arrays.toString(eliminateDuplicates(list)));
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] temp = new int[list.length];
        int count =0;
        for (int i=0; i<list.length; i++){
            boolean present = false;

            for (int j=0; j<i; j++){
                if (list[i] == list[j]){
                    present = true;
                    break;
                }
            }

            if (!present){
                temp[count] = list[i];
                count++;
            }
        }

        int[] result = new int[count];
        System.arraycopy(temp, 0, result, 0, count);

        return result;

    }
}
