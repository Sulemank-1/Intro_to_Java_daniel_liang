package A10_Object_Oriented_Thinking.Exercises;

public class Exercise10_03 {
    public static void main(String[] args) {
        // 1. Test Instance Methods
        MyInteger n1 = new MyInteger(7);
        System.out.println("n1 value: " + n1.getValue());
        System.out.println("n1 isEven: " + n1.isEven());
        System.out.println("n1 isOdd: " + n1.isOdd());
        System.out.println("n1 isPrime: " + n1.isPrime());

        // 2. Test Static Methods (Primitive)
        System.out.println("\nStatic check for 10:");
        System.out.println("10 isEven: " + MyInteger.isEven(10));
        System.out.println("10 isOdd: " + MyInteger.isOdd(10));
        System.out.println("10 isPrime: " + MyInteger.isPrime(10));

        // 3. Test Static Methods (Object)
        MyInteger n2 = new MyInteger(24);
        System.out.println("\nStatic check for MyInteger object (24):");
        System.out.println("n2 isEven: " + MyInteger.isEven(n2));
        System.out.println("n2 isOdd: " + MyInteger.isOdd(n2));
        System.out.println("n2 isPrime: " + MyInteger.isPrime(n2));

        // 4. Test Equals Methods
        System.out.println("\nTesting equality:");
        System.out.println("n1 equals 7: " + n1.equals(7));
        System.out.println("n1 equals n2: " + n1.equals(n2));

        // 5. Test ParseInt Methods
        System.out.println("\nTesting parseInt:");
        char[] chars = {'3', '5', '2'};
        String str = "987";
        System.out.println("Parse char array {'3','5','2'}: " + MyInteger.parseInt(chars));
        System.out.println("Parse string \"987\": " + MyInteger.parseInt(str));
    }
}

class MyInteger{
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return isEven(value);
    }

    public boolean isOdd(){
        return isOdd(value);
    }

    public boolean isPrime(){
        return isPrime(value);
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 == 1;
    }

    public static boolean isPrime(int value){
        for (int i = 2; i <= value/2; i++)
            if (value % i == 0)
                return false;
        return true;
    }

    public static boolean isEven(MyInteger value){
        return isEven(value.getValue());
    }

    public static boolean isOdd(MyInteger value){
        return isOdd(value.getValue());
    }

    public static boolean isPrime(MyInteger value){
        return isPrime(value.getValue());
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger value){
        return this.value == value.getValue();
    }

    public static int parseInt(char[] values){
        int value = 0;
        for (int i = 0; i < values.length; i++)
            value = value * 10 + (values[i] - '0');
        return value;
    }

    public static int parseInt(String str){
        int value = 0;
        for (int i = 0; i < str.length(); i++)
            value = value * 10 + (str.charAt(i) - '0');
        return value;
    }


}
