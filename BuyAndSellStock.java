import java.util.ArrayList;

public class BuyAndSellStock {

    public static void main(String[] args) {

        int arr[] = { 100, 180, 260, 310, 40, 535, 695 };

        System.out.println(getAns(arr));
    }

    public static ArrayList<ArrayList<Integer>> getAns(int[] arr) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int buy = 0;
            int sell = 0;
            int res = 0;
            for (int j = i; j < n; j++) {
                int a = arr[j] - arr[i];
                if (a <= 0) {
                    break;
                }
                if (a > res) {
                    buy = i;
                    sell = j;
                }
            }
            if (sell > i) {
                ArrayList<Integer> samp = new ArrayList<>();
                samp.add(buy);
                samp.add(sell);
                list.add(samp);
                i = sell;
            }

        }

        return list;

    }

}
