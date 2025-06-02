import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        while (a < 10) {
            System.out.println(a);
            int temp = b;
            a = b;
            b = temp + b;
        }

    }
}
