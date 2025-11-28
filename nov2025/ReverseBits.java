public class ReverseBits {

    public static void main(String[] args) {
        System.out.println(revbit(43261596));
    }

    public static int revbit(int n) {
        String str = "";
        while (n > 0) {
            int rem = n % 2;
            str = rem + str;
            n /= 2;
        }
        while (str.length() != 32) {
            str = 0 + str;
        }
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        int decimal = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            decimal = decimal * 2 + (ch - '0');
        }
        return decimal;
    }

}
