import java.util.*;

public class CountPartition {

    public static void main(String[] args) {
        int[] nums1 = { 10, 10, 3, 7, 6 };
        int[] nums2 = { 1, 2, 2 };
        System.out.println(solution(nums1));
        System.out.println(solution(nums2));
    }

    public static int solution(int[] nums) {
        int sum = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int subSum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            subSum += nums[i];
            if ((Math.abs((sum - subSum) - subSum) % 2) == 0) {
                even++;
            }
        }
        return even;
    }

}
