package A07_Single_Dimensional_Arrays;

public class Main {
    public static void main(String[] args) {
        int[] source = {3, 4, 5};
        int[] t = new int[3];

        System.arraycopy(source, 0, t, 0, 3);

        printArray(source);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }

        return result;
    }
}
