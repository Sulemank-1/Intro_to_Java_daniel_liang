package A10_Object_Oriented_Thinking;


public class Course {
    private String courseName;
    private String[] students = new String[1];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        if (numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = student;
    }

    public String[] getStudents(){
        String[] students = new String[numberOfStudents];
        System.arraycopy(this.students, 0, students, 0, numberOfStudents);
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++)
            if (student.equals(students[i])){
                index = i;
                break;
            }

        if (index >= 0) {
            for (int i = index; i < numberOfStudents - 1; i++)
                students[i] = students[i + 1];

            students[numberOfStudents - 1] = null;
            numberOfStudents--;
        }
    }

    public void clear(){
        students = new String[1];
        numberOfStudents = 0;
    }
}
