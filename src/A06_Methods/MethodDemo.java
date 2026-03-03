package A06_Methods;

public class MethodDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 10));
    }

    public static int sum(int i1, int i2){
        int result = 0;
        for (int i = i1; i<=i2; i++){
            result += i;
        }

        return result;
    }
}
