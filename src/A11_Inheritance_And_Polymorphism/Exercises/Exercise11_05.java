package A11_Inheritance_And_Polymorphism.Exercises;

import java.util.ArrayList;

public class Exercise11_05 {
    public static void main(String[] args) {

    }
}

class Course {
    private String courseName;
    private ArrayList<String> students;

    public Course(String courseName){
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    public void addStudent(String student){
        students.add(student);
    }

    public String[] getStudents(){
        String[] s = new String[getNumberOfStudents()];
        return students.toArray(s);
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        students.remove(student);
    }

    public void clear(){
        students.clear();
    }
}

