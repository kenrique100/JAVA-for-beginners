package org.example.loops;

public class NestedForLoops {
    public static void main(String[] args) {
        int[][] arr = { { 2, 7, 9 }, { 3, 5, 1 }, { 9, 2, 6 } };
        int depth = 3;
        for(int i=0; i<depth; i++){
            for(int j=0; j<depth; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
