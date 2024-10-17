import java.util.Arrays;
import java.util.List;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args) {

        int[] arr = { 0, -10, 1, 3, -20 };
        System.out.println(getEle(arr));

    }

    public static int getEle(int[] arr) {

        List<Integer> a = Arrays.stream(arr).boxed().toList();
        for (int i = 1; i <= arr.length+1; i++) {
            if (!a.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}