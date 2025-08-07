

public class Binary {

    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5 };
        int maxOR = bitWistOR(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int or = 0;
            for (int j = i; j < nums.length; j++) {
                or |= nums[j];
                if (or == maxOR) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int bitWistOR(int[] num) {

        int max = 0;
        for (int i : num)
            max |= i;
        System.out.println(max);
        return max;
    }

}
