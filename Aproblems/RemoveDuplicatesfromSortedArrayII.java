public class RemoveDuplicatesfromSortedArrayII {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        int insertPos = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[i - 2]) {
                arr[insertPos++] = arr[i];
            }
        }
        System.out.println(insertPos);
    }
}
