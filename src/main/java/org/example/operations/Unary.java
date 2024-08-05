package org.example.operations;

public class Unary {
    public static void main(String[] args) {
        int result = 5;
        // for positive
        System.out.println(result);

        // for decrement
        result--;
        System.out.println(result);

        // for increment
        result++;
        System.out.println(result);

        // for negative
        result = -result;
        System.out.println(result);

        // for Boolean
        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

    }
}
