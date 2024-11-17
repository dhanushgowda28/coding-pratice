public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    static public boolean isPalindrome(String s) {

        int n = s.length();
        StringBuilder pal = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                pal.append(s.charAt(i));
            }
        }
        String a = pal.toString().toLowerCase();
        String b = pal.reverse().toString().toLowerCase();
        return a.equals(b);
    }

}
