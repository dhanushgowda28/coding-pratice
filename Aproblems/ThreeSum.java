package Aproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = i + 1;
            int j = n - 1;
            while (a < j) {
                int sum = nums[i] + nums[a] + nums[j];
                if (sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[a]);
                    list.add(nums[j]);
                    res.add(list);
                    a++;
                    j--;
                } else if (sum > 0) {
                    a++;
                } else {
                    j--;
                }
            }
        }
        return res;
    }

}
