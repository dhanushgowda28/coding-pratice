public class LongestValidParenticis {

    public static void main(String[] args) {

        System.out.println(maxLength("(((()()))())"));

    }

    static int maxLength(String str) {

        int n = str.length();
        int max = 0, l = 0, r = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                l++;
            } else {
                r++;
            }
            if (l == r) {
                max = Math.max(max, 2 * r);
            } else if (r > l) {
                l = r = 0;
            }
        }

        l = r = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) == '(') {
                l++;
            } else {
                r++;
            }

            if (l == r) {
                max = Math.max(max, 2 * l);
            } else if (l > r) {
                l = r = 0;
            }
        }

        return max;
    }
}
