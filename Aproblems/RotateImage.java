import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] res = rotate(arr);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.err.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public int[][] rotate(int[][] matrix) {
        int a = matrix.length;

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < a; i++) {
            int left = 0;
            int right = a - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

        return matrix;
    }

}
