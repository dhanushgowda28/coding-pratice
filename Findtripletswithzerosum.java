public class Findtripletswithzerosum {

    public static void main(String[] args) {
        int[] arr = { 1,2,3 };

        System.out.println(gettriplet(arr));

    }

    public static boolean gettriplet(int[] arr) {

        int l = arr.length;

        for (int i = 0; i < l - 2; i++) {

            int r = i + 1;
            int le = l - 1;

            while (r < le) {

                int sum = arr[i] + arr[r] + arr[le];

                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    le++;
                } else {
                    r++;
                }

            }

        }

        return false;
    }
}
