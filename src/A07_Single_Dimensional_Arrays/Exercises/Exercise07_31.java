package A07_Single_Dimensional_Arrays.Exercises;

import java.util.Scanner;

public class Exercise07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[input.nextInt()];
        for (int i=0; i<list1.length; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[input.nextInt()];
        for (int i=0; i<list2.length; i++)
            list2[i] = input.nextInt();

        int[] mergedList = merge(list1, list2);

        for(int i: mergedList)
            System.out.print(i + " ");

    }

    public static int[] merge(int[] list1, int[] list2){
        int c1 = 0, c2 = 0, c3 = 0;
        int[] temp = new int[list1.length + list2.length];

        while(c1 < list1.length && c2 < list2.length){
            if (list1[c1] <= list2[c2])
                temp[c3++] = list1[c1++];
            else
                temp[c3++] = list2[c2++];
        }

        while (c1 < list1.length) {
            temp[c3++] = list1[c1++];
        }


        while (c2 < list2.length) {
            temp[c3++] = list2[c2++];
        }

        return temp;
    }
}
