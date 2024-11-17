import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] nums1 = { -1, 1, 0, -3, 3 };
        System.out.println(Arrays.toString(productExceptSelf(nums1)));
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    static public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int[] res = new int[n];
        // res[0] = 1;
        // int zero = 0;
        // for (int i = 1; i < n; i++) {
        // if(nums[i]==0){
        // zero++;
        // }
        // res[i] = res[i - 1] * nums[i-1];
        // }

        // int suf = 1;
        // for (int i = n - 1; i >= 0; i--) {
        // res[i] = res[i] * suf;
        // suf *= nums[i];
        // }
        // return res;

        int n = nums.length;

        int[] res = new int[n];
        int zero = 0;
        int mal = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                mal *= nums[i];
            }
        }

        if (zero >= 2) {
            return res;
        } else if (zero == 1) {
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    res[i] = mal;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                res[i] = mal / nums[i];
            }
        }
        return res;
    }

}
