package org.example.arrays;

public class TwoDimentionalArrays {
    public static void main(String[] args) {
        int [][] arr= { { 2, 7, 9 }, { 3, 5, 1 }, { 9, 2, 6 } };

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
