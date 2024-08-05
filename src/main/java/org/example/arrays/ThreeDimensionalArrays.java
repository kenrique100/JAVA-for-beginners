package org.example.arrays;

public class ThreeDimensionalArrays {
    public static void main(String[] args) {
        // Define the dimensions of the 3D array
        int depth = 6;
        int rows = 3;
        int columns = 3;

        // Create the 3D array
        int[][][] arr = new int[depth][rows][columns];

        // Initialize the 3D array with some values
        int value = 1;
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    arr[i][j][k] = value++;
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < depth; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < columns; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
