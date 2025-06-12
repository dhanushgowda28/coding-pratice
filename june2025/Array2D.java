import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2D {

   public static void main(String[] args) {
      int[][] matrix = {
            { 1, },
            { 4, 5 },
            { 7, 8, 9, 5 }
      };

      int[][] a1 = { { 1, 2, 3 }, { 4, 5, 6 } };
      int[][] a2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
      print2DArr(matrix);
      System.out.println();
      SumOfAll(matrix);
      System.out.println();
      rowWiseSum(matrix);
      System.out.println();
      columnWiseSum(matrix);
      System.out.println();
      findAnElement(matrix, 8);
      System.out.println();
      TransposeMertix(matrix);
      System.out.println();
      diagonalSum(matrix);
      System.out.println();
      identityMatrix();
      System.out.println();
      spiralOrder();
      System.out.println();
      flipImageHorizontally();
      System.out.println();
      magicSquare();
      System.out.println();
      printZigZag();
      System.out.println();
      maxAdjacentDistance();
      System.out.println();
      NeighborsSum();
   }

   public static void print2DArr(int[][] arr) {

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static void SumOfAll(int[][] arr) {
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
         }
      }
      System.out.println(sum);

   }

   public static void rowWiseSum(int[][] arr) {

      int[] nums = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
         int sum = 0;
         for (int j = 0; j < arr[i].length; j++) {
            sum += arr[i][j];
         }
         nums[i] = sum;
      }
      System.out.println(Arrays.toString(nums));
   }

   public static void columnWiseSum(int[][] arr) {

      int max = 0;
      for (int i = 0; i < arr.length; i++) {
         max = Math.max(max, arr[i].length);
      }
      int[] nums = new int[max];
      for (int i = 0; i < max; i++) {
         int sum = 0;
         for (int j = 0; j < arr.length; j++) {
            if (i < arr[j].length)
               sum += arr[j][i];
         }
         nums[i] = sum;
      }
      System.out.println(Arrays.toString(nums));
   }

   public static void findAnElement(int[][] arr, int k) {

      outerLoop: for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            if (arr[i][j] == k) {
               System.out.println(i + "" + j);
               break outerLoop;
            }
         }
      }

   }

   public static void TransposeMertix(int[][] arr) {

      int maxCol = 0;

      for (int[] i : arr) {
         maxCol = Math.max(i.length, maxCol);
      }

      int[][] res = new int[maxCol][arr.length];

      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[i].length; j++) {
            res[j][i] = arr[i][j];
         }
      }
      for (int[] i : res) {
         System.out.println(Arrays.toString(i));
      }

   }

   public static void diagonalSum(int[][] arr) {
      int priSum = 0;
      int secSum = 0;
      int n = arr.length;

      for (int i = 0; i < n; i++) {

         int j = n - i - 1;
         priSum += arr[i][i];
         if (j < arr[i].length)
            secSum += arr[i][n - i - 1];
      }

      System.out.println(priSum + "  " + secSum);
   }

   public static void identityMatrix() {

      int[][] arr = {
            { 1, 0, 1 },
            { 0, 1, 0 },
            { 1, 0, 1 }
      };
      boolean b = true;
      outerLoop: for (int i = 0; i < arr.length; i++) {
         if (arr[i][i] != 1) {
            b = false;
            break;
         }
         if (arr[i][arr.length - i - 1] != 1) {
            b = false;
            break;
         }
         for (int j = 0; j < arr.length; j++) {
            if (i != j && j != arr.length - i - 1)
               if (arr[i][j] == 1) {
                  b = false;
                  break outerLoop;
               }
         }
      }
      System.out.println(b);
   }

   public static void spiralOrder() {
      int[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
      };
      List<Integer> list = new ArrayList<>();
      int top = 0;
      int bottom = matrix.length - 1;
      int left = 0;
      int right = matrix[0].length - 1;

      while (left <= right && top <= bottom) {

         for (int i = left; i <= right; i++) {
            list.add(matrix[top][i]);
         }
         top++;
         for (int i = top; i <= bottom; i++) {
            list.add(matrix[i][right]);
         }
         right--;
         if (top <= bottom) {
            for (int i = right; i >= left; i--) {
               list.add(matrix[bottom][i]);
            }
            bottom--;
         }
         if (left <= right) {
            for (int i = bottom; i >= top; i--) {
               list.add(matrix[i][left]);
            }
            left++;
         }

      }

      System.out.println(list);
   }

   public static void flipImageHorizontally() {
      int[][] arr = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
      };
      int n = arr.length;
      for (int i = 0; i < arr.length; i++) {
         int j = 0;
         while (j < n / 2) {
            int temp = arr[i][j];
            arr[i][j] = arr[i][n - j - 1];
            arr[i][n - j - 1] = temp;
            j++;
         }
      }

      for (int[] i : arr)
         System.out.println(Arrays.toString(i));
   }

   public static void magicSquare() {
      int[][] arr = {
            { 2, 7, 6 },
            { 9, 5, 1 },
            { 4, 3, 8 }
      };
      int k = 15;
      boolean b = true;
      for (int i = 0; i < arr.length; i++) {
         int row = 0;
         int col = 0;
         for (int j = 0; j < arr.length; j++) {
            row += arr[i][j];
            col += arr[j][i];
         }
         if (row != col) {
            b = false;
         }
      }

      System.out.println(b);
   }

   public static void printZigZag() {

      int[][] arr = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
      };

      int m = arr.length;
      int n = arr[0].length;
      List<Integer> list = new ArrayList<>();

      for (int i = 0; i < m + n - 1; i++) {
         int row, col;

         if (i % 2 == 0) {

            row = i < m ? i : m - 1;
            col = i - row;
            while (row >= 0 && col < n) {
               list.add(arr[row][col]);
               row--;
               col++;
            }

         } else {

            col = i < n ? i : n - 1;
            row = i - col;
            while (col >= 0 && row < m) {
               list.add(arr[row][col]);
               row++;
               col--;
            }

         }

      }
      System.out.println(list);

   }

   public static void maxAdjacentDistance() {

      int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
      };

      for (int i = 0; i < matrix.length; i++) {
         for (int j = 0; j < matrix.length; j++) {
            if (i > j) {
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
         }
      }

      int i = 0;
      int n = matrix.length;
      while (i < matrix.length) {

         for (int j = 0; j < matrix.length / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][n - j - 1];
            matrix[i][n - j - 1] = temp;
         }
         i++;
      }

      for (int[] arr : matrix) {
         System.out.println(Arrays.toString(arr));
      }

   }

   public static void NeighborsSum() {

      int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
      };

      int[][] res = new int[matrix.length][matrix[0].length];
      int row = matrix.length - 1;
      int col = matrix[0].length - 1;

      for (int i = 0; i <= row; i++) {
         for (int j = 0; j <= col; j++) {
            int sum = 0;
            if (j < col) {
               sum += matrix[i][j + 1];
            }
            if (j > 0) {
               sum += matrix[i][j - 1];
            }
            if (i > 0) {
               sum += matrix[i - 1][j];
            }
            if (i < row) {
               sum += matrix[i + 1][j];
            }
            res[i][j] = sum;
         }
      }
      for (int[] arr : res) {
         System.out.println(Arrays.toString(arr));
      }
   }

}
