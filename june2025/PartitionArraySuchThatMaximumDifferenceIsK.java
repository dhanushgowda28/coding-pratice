import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK {

    public static void main(String[] args) {

        int[] nums = { 2, 2, 4, 5 };
        int k = 0;

        System.out.println(partitionArray(nums, k));

    }

    public static int partitionArray(int[] nums, int k) {

        Arrays.sort(nums);
        int res = 1;
        int i = 0;
        int j = 0;
        while (j < nums.length && i < nums.length) {

            if (nums[j] - nums[i] <= k) {
                j++;
            } else {
                i = j;
                res++;
            }

        }
        return res;
    }
}
