public class Demo {
    public static void main(String[] args) {

        int[] arr2 = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };

        System.out.println(maxIndexDiff(arr2)); // Output: 6
    }

    public static int maxIndexDiff(int[] arr) {
        int n = arr.length;
        int maxDiff = -1;

        int[] leftMin = new int[n];
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = Math.max(rightMax[j + 1], arr[j]);
        }

        int i = 0, j = 0;
        while (i < n && j < n) {
            if (leftMin[i] < rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;

            }
        }

        return maxDiff;
    }
}
