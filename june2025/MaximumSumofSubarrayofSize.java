public class MaximumSumofSubarrayofSize {

    public static void main(String[] args) {

        int[] nums = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        System.out.println(minSubArrayLen(nums, k));

    }

    public static int minSubArrayLen(int[] nums, int target) {
        int maxSum = 0, sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (right >= target - 1) {
                maxSum = Math.max(maxSum, sum);
                sum -= nums[right - target + 1];
            }
        }

        return maxSum;
    }

}