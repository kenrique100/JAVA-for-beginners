package org.example.operations;

public class NestedIf {
    public static void main(String[] args) {
        int i = 50;
        if(i == 50) {
            System.out.println("I is 50");
            if(i < 55) {
                System.out.println("i is smaller than 55");
                if (i < 75) {
                    System.out.println("i is smaller than 75");
                }
            }
        }

    }
}
