package A12_Exception_Handling_And_Text_IO.Exercises;

import java.util.Scanner;

public class Exercise12_06 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex));
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws NumberFormatException{
        if (!hex.matches("^[A-Fa-f0-9]+$"))
            throw new NumberFormatException("Not a hexadecimal string");

        int decimalValue = 0;
        for (int i=0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
