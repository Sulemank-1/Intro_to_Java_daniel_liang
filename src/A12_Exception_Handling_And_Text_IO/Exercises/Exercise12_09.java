package A12_Exception_Handling_And_Text_IO.Exercises;

import java.util.Scanner;

public class Exercise12_09 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = input.nextLine();

        try {
            System.out.println("The decimal value for binary number " + binary + " is " + bin2Dex(binary));
        }catch (BinaryFormatException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int bin2Dex(String binary) throws BinaryFormatException{
        if (!binary.matches("^[0-1]+$"))
            throw new BinaryFormatException(binary);
        StringBuilder bin = new StringBuilder(binary);
        bin.reverse();
        int decimal = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1')
                decimal += (int)Math.pow(2,i);
        }

        return decimal;
    }
}

class BinaryFormatException extends Exception{
    private String binary;

    public BinaryFormatException(String binary) {
        super(binary + " is not a binary number");
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }
}
