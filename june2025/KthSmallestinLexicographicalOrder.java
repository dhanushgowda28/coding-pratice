import java.util.*;

public class KthSmallestinLexicographicalOrder {

    public static void main(String[] args) {

        System.out.println(findKthNumber(13, 2));
    }

    public static int findKthNumber(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (df(n, k, res, i))
                return res.get(res.size() - 1);
        }
        return 0;
    }

    public static boolean df(int n, int k, List<Integer> res, int ind) {
        if (ind > n) {
            return false;
        }
        res.add(ind);
        if (res.size() == k) {
            return true;
        }
        for (int i = 0; i <= 9; i++) {
            int current = ind * 10 + i;
            if (df(n, k, res, current))
                return true;
        }
        return false;
    }

}