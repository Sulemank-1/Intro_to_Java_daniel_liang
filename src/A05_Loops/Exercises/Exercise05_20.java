package A05_Loops.Exercises;

public class Exercise05_20 {
    public static void main(String[] args) {

    }

    public static void primeNumbers(){
        /*(Display prime numbers between 2 and 1,000) Modify the program given in Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive. Display eight prime numbers per line. Numbers are separated by exactly one space.*/

        final int NUMBER_OF_PRIMES = 2000;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count  = 0;
        int number = 2;

        System.out.println("The first 50 prime numbers are");

        while(count < NUMBER_OF_PRIMES){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number/2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }

            number++;
        }
    }

}
