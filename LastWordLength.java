public class LastWordLength {

    public static void main(String[] args) {
        String s = "a ";
        System.out.println(lengthOfLastWord(s));
    }

    static public int lengthOfLastWord(String s) {
        String res = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                int j = i;
                while (j >= 0 && s.charAt(j) != ' ') {
                    res = s.charAt(j) + res;
                    j--;
                }
                break;
            }

        }
        return res.length();
    }
}
