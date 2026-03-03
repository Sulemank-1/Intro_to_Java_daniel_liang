package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Arrays;

public class Exercise07_18 {
    public static void main(String[] args) {
        double[] list = {10,9,8,7,6,5,4,3,2,1};
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSort(double[] list){
        for (int i = 0; i < list.length-1; i++) {
            boolean swapped = false;
            for(int j = 0; j<list.length-1-i; j++){
                if (list[j] > list[j+1]){
                    double temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
