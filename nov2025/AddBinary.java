public class AddBinary {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        int sum = findDecimal(a) + findDecimal(b);
        String bin = "";
        while (sum > 0) {
            int rem = sum % 2;
            bin = rem + bin;
            sum /= 2;
        }
        return bin;
    }

    public static int findDecimal(String a) {
        int dec = 0;
        for (int i = 0; i < a.length(); i++) {
            int bit = a.charAt(i) - '0';
            dec = dec * 2 + bit;
        }
        return dec;
    }

}