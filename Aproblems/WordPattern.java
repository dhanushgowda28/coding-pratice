package Aproblems;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        String a = "abba";
        String b = "dog dog cat fish";
        System.out.println(wordPattern(a, b));
    }

    static public boolean wordPattern(String p, String s) {
        int pl = p.length();

        String[] arr = s.split("\\s");
        int l = arr.length;
        if (pl != l) {
            return false;
        }
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        map1.keySet();
        for (int i = 0; i < pl; i++) {
            if (map1.containsKey(p.charAt(i))) {
                if (!map1.get(p.charAt(i)).equals(arr[i])) {
                    return false;
                }
            } else {
                map1.put(p.charAt(i), arr[i]);
            }
            if (map2.containsKey(arr[i])) {
                if (map2.get(arr[i]) != p.charAt(i)) {
                    return false;
                }
            } else {
                map2.put(arr[i], p.charAt(i));
            }
        }
        return true;
    }

}
