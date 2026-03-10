package A10_Object_Oriented_Thinking.Exercises;

import A10_Object_Oriented_Thinking.StackOfIntegers;

public class Exercise10_06 {
    public static void main(String[] args) {
        int n = 120;
        StackOfIntegers primeNumbers = new StackOfIntegers();

        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                primeNumbers.push(i);



        while (!primeNumbers.empty())
            System.out.print(primeNumbers.pop() + " ");
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
