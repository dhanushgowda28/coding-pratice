import java.util.*;

public class KMirrorNumbers {

    public static void main(String[] args) {
        System.out.println(kMirror(2, 5)); // Output: 25
        System.out.println(kMirror(3, 7)); // Output: 499
        System.out.println(kMirror(7, 17)); // Output: 20379000
    }

    public static long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int length = 1;

        while (count < n) {

            for (long num : generatePalindromes(length)) {
                if (isPalindrome(Long.toString(convertToBaseK(num, k)))) {
                    sum += num;
                    count++;
                    if (count == n)
                        return sum;
                }
            }
            length++;
        }

        return sum;
    }

    private static java.util.List<Long> generatePalindromes(int length) {
        java.util.List<Long> palindromes = new java.util.ArrayList<>();

        int start = (int) Math.pow(10, (length - 1) / 2);
        int end = (int) Math.pow(10, (length + 1) / 2);

        for (int i = start; i < end; i++) {
            String left = Integer.toString(i);
            String right = new StringBuilder(left.substring(0, length % 2 == 0 ? left.length() : left.length() - 1))
                    .reverse().toString();
            String palindromeStr = left + right;
            System.out.println(palindromeStr);
            palindromes.add(Long.parseLong(palindromeStr));
        }

        return palindromes;
    }

    // Convert a number to base-k and return it as an integer (or as a string)
    private static long convertToBaseK(long num, int base) {
        long result = 0;
        long multiplier = 1;

        while (num > 0) {
            result += (num % base) * multiplier;
            num /= base;
            multiplier *= 10;
        }

        return result;
    }

    // Check if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }
        return true;
    }
}
