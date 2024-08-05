package org.example.operations;

public class Conditional {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int result;

        if((x == 1) && (y == 2)){
            System.out.println("x is 1 AND y is 2");
        }
        if((x == 1) || (y == 1)){
            System.out.println("x is 1 OR y is 1");
        }
        boolean someCondition = true;
        result = someCondition ? x:y;
        System.out.println(result);
    }
}
