package org.example.singleObjectsAndClass;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Kenrique";
        s.gender = "M";
        System.out.println("ID:" +s.id +"\nStudent name:" + s.name +"\nGender:" + s.gender);
    }
}
