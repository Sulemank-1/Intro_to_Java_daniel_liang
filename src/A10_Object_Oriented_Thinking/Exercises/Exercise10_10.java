package A10_Object_Oriented_Thinking.Exercises;

public class Exercise10_10 {
    public static void main(String[] args) {
        Queue numbers = new Queue();

        for (int i = 1; i <= 20; i++)
            numbers.enqueue(i);

        while (!numbers.empty())
            System.out.print(numbers.dequeue() + " ");


    }
}

class Queue{
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;


    public Queue(){
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int value){
        if (size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int dequeue(){
        int element = elements[0];

        for (int i = 0; i < size - 1; i++)
            elements[i] = elements[i+1];

        size--;

        return element;
    }


    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
