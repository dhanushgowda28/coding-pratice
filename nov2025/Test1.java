
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static int res = 0;

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 2 };
        int p = 6;
        System.out.println(minSubArray(nums, p));
    }

    public static int minSubArray(int[] nums, int p) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int temp = 0;
        dfs(nums, 0, new ArrayList<>(), sum, temp, p);
        return res;
    }

    public static void dfs(int[] nums, int i, List<Integer> list, int sum, int temp, int p) {
        if (i == nums.length) {
            int sum1 = sum - temp;
            if (sum1 % p == 0) {
                res = Math.min(res, list.size());
            }
            return;
        }
        list.add(nums[i]);
        temp += nums[i];
        dfs(nums, i + 1, list, sum, temp, p);
        list.remove(list.size() - 1);
        temp -= nums[i];
        dfs(nums, i + 1, list, sum, temp, p);
    }

}
