package A07_Single_Dimensional_Arrays.Exercises;

public class Exercise07_20 {
    public static void selectionSort(double[] list){

        for (int i=0; i<list.length-1; i++){
            double currentMax = list[i];
            int currentMaxIndex = i;

            for (int j = i+1; j<list.length; j++){
                if (currentMax < list[j]){
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i){
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }

}
