package A07_Single_Dimensional_Arrays.Exercises;

import A07_Single_Dimensional_Arrays.BinarySearch;
import A07_Single_Dimensional_Arrays.LinearSearch;

public class Exercise07_16 {
    public static void main(String[] args) {
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100000);
        }

        int key = array[(int)(Math.random() * 100000)];

        long startTimeLinearSearch = System.nanoTime();

        int linearSearchIndex = LinearSearch.linearSearch(array, key);

        long endTimeLinearSearch = System.nanoTime();

        long executionTimeLinearSearch = endTimeLinearSearch - startTimeLinearSearch;

        System.out.println("Linear search execution time " + executionTimeLinearSearch);

        selectionSort(array);

        long startTimeBinarySearch = System.nanoTime();

        int binarySearchIndex = BinarySearch.binarySearch(array, key);

        long endTimeBinarySearch = System.nanoTime();

        long executionTimeBinarySearch = endTimeBinarySearch - startTimeBinarySearch;

        System.out.println("Binary search execution time " + executionTimeBinarySearch);






    }

    public static void selectionSort(int[] list){
        for (int i=0; i<list.length-1; i++){
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1; j<list.length; j++){
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }



}
