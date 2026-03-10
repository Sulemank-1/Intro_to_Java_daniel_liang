package A10_Object_Oriented_Thinking.Exercises;

import A10_Object_Oriented_Thinking.StackOfIntegers;

import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        StackOfIntegers stack = new StackOfIntegers();

        primeFactors(number, stack);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }

    public static void primeFactors(int number, StackOfIntegers stack){
        int i = 2;
        while (number > 1){
            while (number % i == 0){
                number /= i;
                stack.push(i);
            }
            i++;
        }
    }
}
