package Aproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomarpricString {

    public static void main(String[] args) {
        String s1 = "papap";
        String s2 = "titii";
        System.out.println(isIsomorphic(s1, s2));
    }

    static public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {

            }
        }

    }
}
