import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,2,3,0,4,2 };
        int val = 3;
        int l = nums.length;
        int res = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] == val) {
                int j = l - 1;
                res++;
                while (j > i) {
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                    j--;
                }

            }
        }
        System.out.println(res);
        System.out.println(Arrays.toString(nums));
    }
}
