package Aproblems;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minArray(7, nums));
    }

    public static int minArray(int tar, int[] nums) {

        int n = nums.length;
        int left = 0;
        int sum = 0;
        int sub = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            sum += nums[i];
            while (sum >= tar) {
                sub = Math.min(sub, i - left + 1);
                sum -= nums[left];
                left++;
            }

        }
        return sub == Integer.MAX_VALUE ? 0 : sub;

    }

}
