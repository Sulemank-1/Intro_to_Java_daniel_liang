package A10_Object_Oriented_Thinking.Exercises;

import java.util.GregorianCalendar;

public class Exercise10_14 {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        System.out.print("Year: " + date1.getYear());
        System.out.print("\nMonth: " + date1.getMonth());
        System.out.print("\nDay: " + date1.getDay());

        MyDate date2 = new MyDate(34355555133101L);
        System.out.print("\nYear: " + date2.getYear());
        System.out.print("\nMonth: " + date2.getMonth());
        System.out.print("\nDay: " + date2.getDay());
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(){
        this(System.currentTimeMillis());
    }

    public MyDate(long milliseconds){
        setDate(milliseconds);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
