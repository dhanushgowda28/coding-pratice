import java.util.List;
import java.util.ArrayList;

public class LexicographicalNumbers {
    public static void main(String[] args) {

        System.out.println(lexicalOrder(23));

    }

    public static List<Integer> lexicalOrder(int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            df(i, n, list);
        }
        return list;

    }

    public static void df(int current, int n, List<Integer> list) {
        if (current > n)
            return;
        list.add(current);

        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (current > n)
                break;
            df(next, n, list);
        }

    }

}
