import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        rev(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static void rev(List<Integer> list) {

        int l = 2;
        int r = 4;

        while (l < r) {
            Integer i = list.get(l - 1);
            list.set(l - 1, list.get(r - 1));
            list.set(r - 1, i);
            l++;
            r--;
        }
       
    }
}
