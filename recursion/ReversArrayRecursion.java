import java.util.Arrays;

public class ReversArrayRecursion {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 0;
        int end = arr.length;

        reversArray(arr, start, end - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void reversArray(int[] nums, int start, int end) {
        if (start > end)
            return;

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;

        reversArray(nums, start + 1, end - 1);
    }

}
