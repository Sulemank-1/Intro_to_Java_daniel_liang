package A09_Objects_And_Classes.Exercises;

import A07_Single_Dimensional_Arrays.SelectionSort;

public class Exercise09_06 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100000);
        }

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        SelectionSort.selectionSort(numbers);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());

    }
}

class StopWatch{
    private long startTime;
    private long endTime;

    public StopWatch(){
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return getEndTime() - getStartTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime(){
        return endTime;
    }
}
