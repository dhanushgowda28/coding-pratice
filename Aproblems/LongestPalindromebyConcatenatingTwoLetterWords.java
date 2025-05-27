public class LongestPalindromebyConcatenatingTwoLetterWords {

    public static void main(String[] args) {
        String[] arr = { "lc", "cl", "gg" };

        int palLength = 0;
        for (int i = 0; i < arr.length; i++) {
            String str = "";
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    str += arr[i];
                } else if (i != j) {
                    str += arr[j];
                }
            }
            palLength = Math.max(palLength, palindrome(str));
        }
        System.out.println(palLength);
    }

    public static int palindrome(String pal) {
        int i = 0;
        int j = pal.length() - 1;
        while (i < j) {
            if (pal.charAt(i) == pal.charAt(j)) {
                i++;
                j--;
            } else {
                return 1;
            }

        }
        return 2;

    }

}
