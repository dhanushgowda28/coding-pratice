public class MinOperation {

    public static void main(String[] args) {
        int[] nums = { 3, 9, 7 };
        int[] nums1 = { 4, 1, 3 };
        System.out.println(minOperation(nums, 5));
        System.out.println(minOperation(nums1, 4));
    }

    public static int minOperation(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
      return sum % k;
       
    }

}