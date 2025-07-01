import java.util.Arrays;

public class FindSubsequenceofLengthKWiththeLargestSum {

    public static void main(String[] args) {
        int[] nums = { -1, -2, 3, 4 };
        int k = 3;
        maxsubsequence(nums, k);
    }

    public static void maxsubsequence(int[] nums, int k) {

        Arrays.sort(nums);
        int sum = 0;
        int max1 = Integer.MIN_VALUE;
        int[] res1 = new int[k];
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            res1[i] = nums[i];
        }
        max1 = Math.max(sum, max1);
        sum = 0;
        int max2 = Integer.MIN_VALUE;
        int[] res2 = new int[k];
        int j = 0;
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            sum += nums[i];
            res2[j++] = nums[i];
        }
        max2 = Math.max(sum, max2);

        System.out.println(max1 > max2 ? Arrays.toString(res1) : Arrays.toString(res2));

        // return max1>max2?res1:res2;

    }

}
