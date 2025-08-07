import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        subArray(arr, 0, new ArrayList<>());
    }

    public static void subArray(int[] arr, int index, List<Integer> list) {
        if (index == arr.length) {
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        subArray(arr, index + 1, list);
        list.remove(list.remove(list.size() - 1));
        subArray(arr, index+1, list);

    }
}
