package A10_Object_Oriented_Thinking;

public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

//    public void dropStudent(String student){
//        int index = -1;
//        for (int i = 0; i < numberOfStudents; i++)
//            if (student == students[i])
//                index = i;
//
//        if (index >= 0) {
//            for (int i = index; i < numberOfStudents - 1; i++)
//                students[i] = students[i + 1];
//            numberOfStudents--;
//        }
//    }
}
