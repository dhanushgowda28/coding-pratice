public class ValidPalndrome {

    public static void main(String[] args) {
        String s = "race a car";
        StringBuilder b = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                b.append(c);
            }
        }

        String fo = b.toString().toLowerCase();
        String rev = b.reverse().toString().toLowerCase();
        System.out.println(fo.equals(rev));

    }
}
