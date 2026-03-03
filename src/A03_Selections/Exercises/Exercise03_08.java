package A03_Selections.Exercises;

import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args) {

    }

    public static void sortThreeIntegers8(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }

        if (a>c){
            int temp = a;
            a = c;
            c = temp;
        }

        if (b>c){
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
