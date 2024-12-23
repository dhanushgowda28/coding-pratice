import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        System.out.println(Arrays.toString(merge(arr)));
    }

    static public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(b[1], a[1]));

        LinkedList<int[]> list = new LinkedList<>();

        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int[] a = list.peekLast();
            int[] b = intervals[i];

            if (a[1] >= b[0]) {
                int[] la = list.pollLast();
                la[1] = b[1];
                list.add(la);
            } else {
                list.add(b);
            }

        }
        return list.toArray(new int[list.size()][2]);
    }

}
