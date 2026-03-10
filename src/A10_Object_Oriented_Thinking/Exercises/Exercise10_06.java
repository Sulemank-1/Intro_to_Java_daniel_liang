package A10_Object_Oriented_Thinking.Exercises;

import A10_Object_Oriented_Thinking.StackOfIntegers;

import java.util.Scanner;

public class Exercise10_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();


        for (int i = 2; i <= number; i++)
            if (isPrime(i))
                stack.push(i);



        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }


    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
