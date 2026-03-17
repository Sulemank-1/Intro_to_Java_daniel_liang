package A10_Object_Oriented_Thinking.Exercises;

import java.math.BigInteger;

public class Exercise10_16 {
    public static void main(String[] args) {

        BigInteger num = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 0;
        while (count < 10){
            if (num.remainder(BigInteger.TWO).equals(BigInteger.ZERO) || num.remainder(BigInteger.valueOf(3)).equals(BigInteger.ZERO)) {
                System.out.println(num);
                count++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}
