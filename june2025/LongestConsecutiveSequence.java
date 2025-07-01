import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(nearByDupicates(nums));
    }

    public static int nearByDupicates(int[] nums) {
        Arrays.sort(nums);

        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            int c = 1;
            while (i < nums.length) {
                if (nums[i - 1] == nums[i]) {
                    i++;
                }
                if (nums[i - 1] + 1 == nums[i]) {
                    c++;
                    i++;
                } else {
                    break;
                }

            }
            max = Math.max(c, max);

        }
        return max;
    }
}
