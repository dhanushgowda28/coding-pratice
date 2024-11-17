import java.util.Stack;

public class ValidParentises {

    public static void main(String[] args) {

        String s = ")(";
        System.out.println(getCount(s));

    }

    public static int getCount(String s) {

        int res = 0;

        int l = 0, r = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                l++;
            } else {
                r++;
            }

            if (l == r) {
                res = Math.max(res, 2 * r);
            } else if (r > l) {
                l = r = 0;
            }
        }

        int n = s.length();
        l = r = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                l++;
            } else {
                r++;
            }

            if (l == r) {
                res = Math.max(res, 2 * l);
            } else if (r > l) {
                l = r = 0;
            }
        }

        return res;
    }

}
