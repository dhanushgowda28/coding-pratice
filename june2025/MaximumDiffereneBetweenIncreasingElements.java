public class MaximumDiffereneBetweenIncreasingElements {

    public int maximumDifference(int[] nums) {
        int maxNum = nums[nums.length - 1];
        int res = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            res = Math.max(res, maxNum - nums[i]);
            maxNum = Math.max(maxNum, nums[i]);

        }
        return res == 0 ? -1 : res;

    }

}
