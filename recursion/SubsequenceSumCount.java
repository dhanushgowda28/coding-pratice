public class SubsequenceSumCount {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1 };
        int sum = 2;

        System.out.println(checkCount(0, sum, arr, 0));

    }

    public static int checkCount(int index, int sum, int[] arr, int current) {
        if (index == arr.length) {
            if (current == sum)
                return 1;

            return 0;
        }

        current += arr[index];
        int l = checkCount(index + 1, sum, arr, current);
        current -= arr[index];
        int r = checkCount(index + 1, sum, arr, current);

        return r + l;

    }

}
