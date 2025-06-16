public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "ba";
        System.out.println(check(ransomNote, magazine));
    }

    public static boolean check(String ransomNote, String magazine) {

        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            arr[c - 'a']--;
        }
        for (int c : arr) {
            if (c < 0)
                return false;
        }
        return true;
    }

}
