import java.util.*;

public class ThreePalindrome {

    public static void main(String[] args) {
        String s = "aabca";
        System.out.println(countPalindromeSequence(s));
    }

    public static int countPalindromeSequence(String str) {
        Set<String> set = new HashSet<>();
        int[] alp = new int[26];
        int l = str.length();
        for (int i = 0; i < l; i++) {
            char f = str.charAt(i);
            if (alp[f - 'a'] < 1)
                for (int j = i + 1; j < l; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        if (j-i > 1) {
                            for (int k = i + 1; k < j; k++) {
                                set.add("" + i + f + str.charAt(k) + f);
                            }
                        }
                    }

                }

            alp[f - 'a']++;
        }
        return set.size();

    }

}
