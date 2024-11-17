public class JumpGameII {

    public static void main(String[] args) {
        int[]  nums = {2,3,0,1,4};
        System.out.println(jump(nums));
    }

    static public int jump(int[] nums) {
        int n = nums.length;
        if (nums[0] == 0 || n == 0) {
            return 0;
        }
        int i = nums[0];

        int c = 1;
        while (i < n-1) {
            i += i+ nums[i];
            c++;
        }
        return c;
    }
    
}
