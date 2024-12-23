import java.util.Arrays;

public class MinimumNumberofArrowstoBurstBalloons {

    public static void main(String[] args) {

        int[][] nums = { { 10, 16 }, { 2, 8 }, { 1, 6 }, { 7, 12 } };

        System.out.println(findMinArrowShots(nums));

    }

    static public int findMinArrowShots(int[][] points) {

        int arr = 0;

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        return arr;
    }
}
