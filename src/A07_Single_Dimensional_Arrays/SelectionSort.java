package A07_Single_Dimensional_Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        selectionSort(list);
        for (double i: list){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(double[] list){

        for (int i=0; i<list.length-1; i++){
            double currentMin = list[i];
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
