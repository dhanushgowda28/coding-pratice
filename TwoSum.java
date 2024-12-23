import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int nums[] = { 2, 7, 8, 9, 10 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sub = target -nums[i] ;
            if (map.containsKey(sub)) {
                return new int[] { map.get(sub), i };
            }
            map.put(nums[i], i);

        }
        return new int[] { 0, 0 };
    }
}
