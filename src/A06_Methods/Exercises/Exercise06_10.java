package A06_Methods.Exercises;

public class Exercise06_10 {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        for (int i = 2; i<=n; i++){
            if (isPrime(i)){
                System.out.printf("%-5d", i);
                count++;

                if (count % 10 == 0)
                    System.out.println();
            }

        }
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number/2; divisor++){
            if (number % divisor == 0){
                return false;
            }
        }
        return true;
    }
}
