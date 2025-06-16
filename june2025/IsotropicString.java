import java.util.HashMap;
import java.util.Map;

public class IsotropicString {

    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Character> a1 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (a1.containsKey(a)) {
                if (a1.get(a) != b) {
                    return false;
                }
            } else {
                a1.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }
}