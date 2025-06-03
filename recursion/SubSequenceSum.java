import java.util.ArrayList;
import java.util.List;

public class SubSequenceSum {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int num = 2;
        subSequenceSum(0, new ArrayList<>(), 0, arr, num);
    }

    public static void subSequenceSum(int index, List<Integer> list, int sum, int[] arr, int num) {

        if (index == arr.length) {
            if (sum == num)
                System.out.println(list);
            return;
        }

        list.add(arr[index]);
        subSequenceSum(index + 1, list, sum + arr[index], arr, num);
        list.remove(list.size() - 1);
        subSequenceSum(index + 1, list, sum, arr, num);
    }

}
