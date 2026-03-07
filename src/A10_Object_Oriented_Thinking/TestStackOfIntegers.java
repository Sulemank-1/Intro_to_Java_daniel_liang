package A10_Object_Oriented_Thinking;

public class TestStackOfIntegers {
    static void main() {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.empty())
            System.out.print( stack.pop() + " ");
    }
}
