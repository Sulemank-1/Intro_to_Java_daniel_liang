package A10_Object_Oriented_Thinking.Exercises;

import A10_Object_Oriented_Thinking.Course;

public class Exercise10_09 {
    public static void main(String[] args) {
        Course course = new Course("Object Oriented Programming");

        course.addStudent("Suleman");
        course.addStudent("Sheraz");
        course.addStudent("Haris");

        course.dropStudent("Haris");

        String[] students = new String[course.getNumberOfStudents()];
        students = course.getStudents();
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
    }
}
