package A10_Object_Oriented_Thinking.Exercises;

public class Exercise10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println(time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
}

class Time{
      private long hour;
      private long minute;
      private long second;

      public Time(){
          this(System.currentTimeMillis());
      }

      public Time(long elapsedTime){
          setTime(elapsedTime);
      }

      public Time(long hour, long minute, long second){
          this.hour = hour;
          this.minute = minute;
          this.second = second;
      }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime){
        long totalMilliSeconds = elapseTime;

        long totalSeconds = totalMilliSeconds / 1000;

        second = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        minute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        hour = totalHours % 24;
    }

}
