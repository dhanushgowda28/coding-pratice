import java.util.Arrays;

public class TowSumSortedArray {

    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };
        int sum = 9;
        System.out.println(Arrays.toString(towSum(arr, sum)));
    }

    public static int[] towSum(int[] arr, int sum) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int total = arr[i] + arr[j];
            if (total == sum) {
                return new int[] { i + 1, j + 1 };
            } else if (total > sum) {
                j--;
            } else {
                i++;
            }
        }
        return new int[0];
    }

}
