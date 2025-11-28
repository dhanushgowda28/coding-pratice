import java.util.Arrays;

public class inserstionSort {

    public static void main(String[] args) {
        int[] nums = { 7, 3, 5, 2, 1, 8, 9 };

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
        System.out.println(Arrays.toString(nums));
    }

}
