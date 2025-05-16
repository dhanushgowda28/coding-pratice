package Aproblems;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        System.out.println(maxArea(arr));
    }

    static public int maxArea(int[] hei) {
        int n = hei.length;
        int max = 0;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int w = j-i;
            int num = Math.min(hei[i], hei[j]) * w;
            max = Math.max(max, num);
            if (hei[i] < hei[j]) {
                i++;
            } else {
                j--;
            }
        }
        //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

        return max;
    }

}
