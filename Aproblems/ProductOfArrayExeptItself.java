import java.util.Arrays;

public class ProductOfArrayExeptItself {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.productExceptSelf(new int[] { -1, 1, 0, -3, 3 })));
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int prod = 1;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                index = i;
                if (zeroCount > 2) {
                    break;
                }
            } else {
                prod *= nums[i];
            }
        }

        if (zeroCount >= 2) {
            return new int[nums.length];
        } else if (zeroCount == 1) {
            int[] res = new int[nums.length];
            res[index] = prod;
            return res;
        } else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = prod / nums[i];
            }
        }
        return nums;
    }
}
