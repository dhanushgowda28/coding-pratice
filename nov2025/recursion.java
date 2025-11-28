import java.util.*;

public class recursion {

    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int[] nums = {1, 2, 1};
        recursionSum(nums, 0, new ArrayList<Integer>(), res, 0, 2);

        for (List<Integer> list : res)
            System.out.println(list);
    }

    public static void recursionSum(int[] nums, int i, List<Integer> list, List<List<Integer>> res, int sum, int k) {

        if (sum == k) {
            res.add(new ArrayList<Integer>(list));  // USE FULL TYPE
        }

        if (i == nums.length) {
            return;
        }

        // include current element
        list.add(nums[i]);
        recursionSum(nums, i + 1, list, res, sum + nums[i], k);

        // backtrack
        list.remove(list.size() - 1);

        // exclude current element
        recursionSum(nums, i + 1, list, res, sum, k);
    }
}
