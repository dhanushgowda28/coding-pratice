package Aproblems;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] nums = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        //setZeroes(arr);
        setZeroes(nums);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int c = 0;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    c++;
                    List<Integer> l = new ArrayList<>();
                    l.add(i);
                    l.add(j);
                    list.add(l);
                }
            }
        }
        int a = 0;
        while (a < c) {
            int p = list.get(a).get(0);
            int q = list.get(a).get(1);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    if (i == p || q == j) {
                        matrix[i][j] = 0;
                    }
                }
            }
            a++;
        }

    }

}
