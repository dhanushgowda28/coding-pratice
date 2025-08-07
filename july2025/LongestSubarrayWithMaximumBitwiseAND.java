import java.util.Arrays;

public class LongestSubarrayWithMaximumBitwiseAND {

    static int maxbit = 0;
    static int maxlength = 0;

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, 2, 2 };
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {

        bitwiseAnd(nums, 0, 0);
        return maxlength;
    }

    public static void bitwiseAnd(int[] nums, int start, int end) {

        if (nums.length == end) {
            return;
        } else if (start > end) {
            bitwiseAnd(nums, 0, end + 1);
        } else {
            maxBitwiseLength(Arrays.copyOfRange(nums, start, end + 1));
            bitwiseAnd(nums, start + 1, end);
        }

    }

    public static void maxBitwiseLength(int[] nums) {
        int and = nums[0];
        for (int i = 1; i < nums.length; i++) {
            and &= nums[i];
        }
        if (and > maxbit) {
            maxbit = and;
            maxlength = nums.length;
        } else if (and == maxbit) {
            maxlength = Math.max(nums.length, maxlength);
        }

    }

}