import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(90, 23, 14, 24, 34, 52, 63, 13));
        list.remove(3);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

}
