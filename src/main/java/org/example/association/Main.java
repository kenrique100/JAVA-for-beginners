package org.example.association;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating Student objects
        Student stu1 = new Student("Kenrique");
        Student stu2 = new Student("John");

        // adding the students to a set
        Set<Student> students = new HashSet<>();
        students.add(stu1);
        students.add(stu2);

        // Creating a school object
        School school = new School("MIT");

        // setting the students for the school object
        school.setStudents(students);

        // traversing and displaying the bank employees 
        for (Student stu : school.getStudents()) {
            System.out.println(stu.getStudentName()
                    + " belongs to School "
                    + school.getSchoolName());
        }
    }
}
