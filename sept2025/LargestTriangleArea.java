public class LargestTriangleArea {

    public static void main(String[] args) {
        System.out.println(largestTriangleArea(new int[][] { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } }));
        System.out.println(largestTriangleArea(new int[][] { { 1, 0 }, { 0, 0 }, { 0, 1 } }));
    }

    public static double largestTriangleArea(int[][] points) {

        int x = 0;
        int y = 0;
        for (int[] i : points) {
            x = Math.max(i[0], x);
            y = Math.max(i[1], y);
        }
        return ( (double )y * x / 2);

    }

}