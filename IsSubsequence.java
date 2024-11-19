public class IsSubsequence {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));

    }

    static public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int c = 0;
        while (i < t.length() && j < s.length()) {
            if (s.charAt(j) == t.charAt(i)) {
                i++;
                j++;
                c++;
            } else {
                i++;
            }
        }
        return c == s.length();
    }
}
