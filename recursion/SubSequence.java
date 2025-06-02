import java.util.ArrayList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<>();
        sequence(0, result, new ArrayList<>(), arr);
        for (List<Integer> i : result)
            System.out.println(i);
    }

    public static void sequence(int ind, List<List<Integer>> result, List<Integer> current, int[] arr) {
        if (ind == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        current.add(arr[ind]);
        sequence(ind + 1, result, current, arr);
        current.remove(current.size() - 1);
        sequence(ind + 1, result, current, arr);
    }

}
