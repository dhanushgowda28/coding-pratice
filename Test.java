import java.util.*;

public class Test {
    public static void main(String[] args) {

        int[] i = { 1, 2, 3, 4, 5, 7 };
        System.out.println(get(i, 7));
    }

    public static int get(int[] arr, int k) {

        int l = 0;
        int r = arr.length-1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return 0;
    }

}
