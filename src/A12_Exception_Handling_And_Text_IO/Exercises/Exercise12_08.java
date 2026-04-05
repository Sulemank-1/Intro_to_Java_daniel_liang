package A12_Exception_Handling_And_Text_IO.Exercises;

import java.util.Scanner;

public class Exercise12_08 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number: ");
        String hex = input.nextLine();

        try {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex));
        }catch (HexFormatException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static int hexToDecimal(String hex) throws HexFormatException{
        if (!hex.matches("^[A-Fa-f0-9]+$"))
            throw new HexFormatException(hex);

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

class HexFormatException extends Exception{
    private String hexadecimal;

    public HexFormatException(String hexadecimal) {
        super(hexadecimal + " is not a hexadecimal string");
        this.hexadecimal = hexadecimal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }
}
