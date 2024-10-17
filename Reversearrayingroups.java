import java.util.ArrayList;
import java.util.Arrays;

public class Reversearrayingroups {

    public static void main(String[] args) {

        ArrayList<Long> arr = new ArrayList<>(Arrays.asList(1L, 2L, 3L, 4L, 5L));

        int k = 7;

        
        if(k>=arr.size()){
            rotate(arr, arr.size());
        } else {
            rotate(arr, k);
        }
        System.out.println(arr);
    }

    static public void rotate(ArrayList<Long> arr, int k) {

        int i = 0;
        int j = k - 1;

        while (i < j) {
            long temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }

    }

}
