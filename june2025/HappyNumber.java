public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(happyNum(19));
    }

    public static boolean happyNum(int num) {

        while (num > 1 && num < Integer.MAX_VALUE) {

            int sum = 0;

            while (num > 0) {
                int rem = num % 10;
                sum += rem * rem;
                num = num / 10;
            }

            if (sum == 1)
                return true;
            if (sum == 0)
                return false;

            num = sum;

        }

        return false;

    }

}
