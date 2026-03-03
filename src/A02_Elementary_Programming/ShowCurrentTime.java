package A02_Elementary_Programming;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long totalMillieSeconds = System.currentTimeMillis();

        long totalSeconds = totalMillieSeconds / 1000;

        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
