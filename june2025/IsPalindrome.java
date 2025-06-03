public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(arr[i]))
                sb.append(str.charAt(i));
        }

        return sb.toString().toLowerCase().equals(sb.reverse().toString().toLowerCase());

    }

}