package org.example.operations;

public class Arithmetic {
    public static void main(String[] args) {

        int x = 1;
        int y = 2;

        // For addition
        int original_result = x + y;
        System.out.println("Original result: " + original_result);

        // For subtraction
        int new_result = original_result - 1;
        System.out.println(original_result + " - 1 = " + new_result);
        original_result = new_result;

        // For division
        new_result = original_result / 2;
        System.out.println(original_result + " / 2 = " + new_result);
        original_result = new_result;

        // For multiplication
        new_result = original_result * 8;
        System.out.println(original_result + " * 8 = " + new_result);
        original_result = new_result;

        // For remainder operation
        new_result = original_result % 7;
        System.out.println(original_result + " % 7 = " + new_result);
    }
}
