package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.GregorianCalendar;

public class Exercise11_02 {
    public static void main(String[] args) {
        Person person = new Person("john doe");
        Student student = new Student("oliver", Student.FRESHMAN);
        Employee employee = new Employee("Samantha", "office1", 50000, 2005, 2, 5);
        Faculty faculty = new Faculty("Ali", "0900", "Assistant Professor");
        Staff staff = new Staff("Haris", "account manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}

class Person{
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(){
        this("undefined", "undefined", "undefined", "undefined");
    }

    public Person(String name){
        this(name, "undefined", "undefine", "undefined");
    }

    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Class: Person \nName: " + getName();
    }
}

class Student extends Person{
    private final String classStatus;
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";


    public Student(String name, String classStatus){
        super(name);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    @Override
    public String toString(){
        return "Class: Student \nName: " + getName();
    }
}

class Employee extends Person{
    private String office;
    private double salary;
    private MyDate dateHired;


    public Employee(String name) {
        super(name);
    }

    public Employee(String name, String office, double salary, int year, int month, int day){
        super(name);
        this.office = office;
        this.salary = salary;
        dateHired = new MyDate(year, month, day);
    }



    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    @Override
    public String toString(){
        return "Class: Employee \nName: " + getName();
    }
}

class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String officeHours, String rank){
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Class: Faculty \nName: " + getName();
    }
}

class Staff extends Employee{
    private String title;


    public Staff(String name, String title){
        super(name);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString(){
        return "Class: Staff \nName: " + getName();
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
