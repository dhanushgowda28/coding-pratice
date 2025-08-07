public class MaximumFruitsHarvestedAfteratMostKSteps {

    public static void main(String[] args) {

        int[][] arr = {
                { 0, 9 },
                { 4, 1 },
                { 5, 7 },
                { 6, 2 },
                { 7, 4 },
                { 10, 9 }
        };

        int step = 5;
        int k = 4;
        System.out.println(maxTotalFruits(arr, step, k));

    }

    public static int maxTotalFruits(int[][] fru, int step, int k) {

        int left = 0;
        int right = 0;
        for (int i = 0; i < fru.length; i++) {
            if (Math.abs(k - fru[i][0]) <= step) {
                if (fru[i][0] < step) {
                    left += fru[i][1];
                } else if (fru[i][0] > step) {
                    right += fru[i][1];
                } else {
                    left += fru[i][1];
                    right += fru[i][1];
                }
            }
        }

        return Math.max(left, right);

    }

}