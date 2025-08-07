

public class SubsetOfArray {

    static int count = 0;
    static int maxOR = 0;

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5 };
        countMaxOrSubsets(arr);
        System.out.println(count);

    }

    static public int countMaxOrSubsets(int[] nums) {
        for (int num : nums) {
            maxOR |= num;
        }

        dfs(nums, 0, 0);
        return count;
    }

    static private void dfs(int[] nums, int index, int currentOR) {
        if (index == nums.length) {
            if (currentOR == maxOR) {
                count++;
            }
            return;
        }

        dfs(nums, index + 1, currentOR | nums[index]);

        dfs(nums, index + 1, currentOR);
    }
}
