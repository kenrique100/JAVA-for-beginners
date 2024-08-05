package org.example.operations;

public class IfElseConditions {
    public static void main(String[] args) {
        int testScore = 64;
        char grade;
        if(testScore >= 90) {
            grade = 'A';

        }else if(testScore >= 80) {
            grade = 'B';
        } else if (testScore >= 70) {
            grade = 'C';
        } else if (testScore >= 60) {
            grade = 'D';
        } else if (testScore == 50) {
            grade = 'E';
        }else {
            grade = 'F';
        }
        System.out.println("Grade: " +grade);
    }
}
