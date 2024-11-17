public class IntegerToRoman {

    public static void main(String[] args) {
        int num = 3749;
        int[] nums = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] str = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {

            if (num == 0) {
                break;
            }

            while (num >= nums[i]) {
                s.append(str[i]);
                num -= nums[i];
            }
        }

        System.out.println(s.toString());
    }

}
