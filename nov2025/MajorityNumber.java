public class MajorityNumber {

    public static void main(String[] args) {

        System.out.println(maxNum(new int[] { 3, 2, 3 }));

    }

    public static int maxNum(int[] nums) {
        int max = 0;
        for (int num : nums)
            max = Math.max(max, num);

        int[] arr = new int[max + 1];

        for (int i = 0; i < nums.length; i++)
            arr[nums[i]]++;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > nums.length / 2)
                return i;
        }
        return 0;
    }

}