import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int value = matrix[1][2]; // gets the value 6
        matrix[2][1] = 88; // changes value at 3rd row, 2nd column to 88

        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++) { // columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

    }

}