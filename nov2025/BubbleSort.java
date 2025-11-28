import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = { 7, 3, 5, 2, 1, 8, 9 };
        for (int j = 0; j < arr.length -1 ; j++) {
            boolean swap = false;
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
        System.out.println(Arrays.toString(arr));
    }

}
