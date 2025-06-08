import java.util.*;

public class MinimumStringAfterRemovingStars {

    public static void main(String[] args) {

        String str = "aaba*";
        System.out.println(getStr(str));
        for (int i = 0; i < 10; i++) {
            int j = 9;
            while (true) {

            }

        }
    }

    public static String getStr(String str) {

        if (!str.contains("*"))
            return str;

        List<Character> list = new ArrayList<>();

        for (char c : str.toCharArray()) {
            if (c == '*') {
                if (list.size() > 0) {
                    int i = list.size() - 1;
                    int index = i;
                    char small = 'z';
                    while (i >= 0) {
                        if (list.get(i) < small) {
                            small = list.get(i);
                            index = i;
                        }
                        i--;
                    }
                    list.remove(index);
                }
            } else {
                list.add(c);

            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : list) {
            sb.append(c);
        }
        return sb.toString();

    }

}