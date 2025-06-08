public class LongestSubstringWithoutRepeatingCharacters {

  public static void main(String[] args) {

    System.out.println(lengthOfLongestSubstring("pwwkew"));

  }

  public static int lengthOfLongestSubstring(String str) {

    String substr = "";
    int res = 0;
    for (int i = 0; i < str.length(); i++) {

      while (substr.contains("" + str.charAt(i))) {
        substr = substr.substring(1, substr.length());
      }
      substr += str.charAt(i);
      res = Math.max(substr.length(), res);

    }

    return res;
  }

}