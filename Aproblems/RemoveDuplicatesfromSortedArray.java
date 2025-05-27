import java.util.Arrays;

class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[count]) {
                nums[++count] = nums[i];
            }

        }
        System.out.println(++count);
        System.out.println(Arrays.toString(nums));
        
    }

}