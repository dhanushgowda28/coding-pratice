public class Largestsubarraywith0sum {

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int k = 8;

        System.out.println(getInt(arr, k));

    }

    public static int getInt(int[] arr, int l) {

        int res = 0;
        for (int i = 0; i < l; i++) {
            int subsum = 0;
            for (int j = i; j < l; j++) {
                subsum += arr[j];
                if (subsum == 0) {
                    res =  j-i;
                }
            }
        }
        return res;
    }
}
