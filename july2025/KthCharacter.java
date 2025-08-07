public class KthCharacter {
    public static void main(String[] r) {

        System.out.println(KthCharacte(5));
        // System.out.println(KthCharacter(10));

    }

    public static char KthCharacte(int k) {

        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            int len = word.length();
            StringBuilder next = new StringBuilder();

            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                char nextChar = (char) ((c - 'a' + 1) % 26 + 'a');
                next.append(nextChar);
            }

            word.append(next);
        }

        return word.charAt(k - 1);
    }

}
