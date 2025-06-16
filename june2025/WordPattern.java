import java.util.*;

public class WordPattern {

    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat fal";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split("\\s");

        if (pattern.length() != arr.length)
            return false;

        Map<String, Character> a1 = new HashMap<>();
        Map<Character, String> a2 = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            String str = arr[i];
            char c = pattern.charAt(i);

            if (a1.containsKey(str)) {
                if (a1.get(str) != c)
                    return false;
            } else {
                a1.put(str, c);
            }

            if (a2.containsKey(c)) {
                if (!a2.get(c).equals(str))
                    return false;
            } else {
                a2.put(c, str);
            }

        }
        return true;
    }

}