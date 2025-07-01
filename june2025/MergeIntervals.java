import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

    }

    public static int[][] merge(int[][] nums) {

        Arrays.sort(nums, (a, b) -> Integer.compare(a[0], b[0]));

        int[] pre = nums[0];

        List<int[]> list = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            int[] next = nums[i];
            if (pre[1] >= next[0]) {
                pre[1] = Math.max(pre[1], next[1]);
            } else {
                list.add(pre);
                pre = next;
            }
        }
        list.add(pre);

        int[][] res = new int[list.size()][2];

        for (int i = 0; i < nums.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
