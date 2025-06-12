import java.util.*;

public class SubstringwithConcatenationofAllWords{

    public static void main(String[] args) {

        String s = "barfoofoobarthefoobarman";
        String[] arr = { "bar", "foo", "the" };
        System.out.println(findSubstring(s, arr));
    }

    public static List<Integer> findSubstring(String s, String[] arr) {

        int arrLength = 0;
        for (String si : arr) {
            arrLength += si.length();

        }
        System.out.println(arrLength);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= s.length() - arrLength; i=i+arr[0].length()) {
            String substr = s.substring(i, i + arrLength);
            System.out.println(substr);
            int count = 0;
            for (String str : arr) {
                if (substr.contains(str)) {
                    count++;
                }
            }
            if (count == arr.length) {
                res.add(i);

            }
        }

        return res;
    }

}
