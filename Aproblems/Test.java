import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        rotate(arr, 3);
    }

    static public void rotate(int[] nums, int k) {
        rotate(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    static public void rotate(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}