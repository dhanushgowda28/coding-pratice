public class Palindrome {

    public static void main(String[] args) {

        String str = "ASDFFDSA";
        System.out.println(checkPal(str, 0));

    }

    public static boolean checkPal(String str, int start) {

        if (start >= str.length() / 2) {
            return true;
        } else if (str.charAt(start) == str.charAt(str.length() - start - 1)) {
            return checkPal(str, start + 1);
        }
        return false;
    }

}
