import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindWordsContainingCharacter {

    public static void main(String[] args) {
        String[] arr = { "abc", "bcd", "aaaa", "cbc" };
        char x = 'a';
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(""+x)) {
                list.add(i);
            }

        }

        List<Integer> list2 = IntStream.range(0, arr.length).filter(i -> arr[i].indexOf(x)!=-1).boxed().collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);
    }

}
