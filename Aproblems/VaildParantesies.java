import java.util.Stack;

public class VaildParantesies {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(vaildParantesies(s));
    }

    public static boolean vaildParantesies(String str) {

        Stack<Character> s = new Stack<>();
        boolean b = true;
        for (char c : str.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                s.add(c);
            } else if (c == ')') {

                b = s.peek() == '(';
                s.pop();

            } else if (c == ']') {
                b = s.peek() == '[';
                s.pop();

            } else if (c == '}') {
                b = s.peek() == '{';
                s.pop();

            }
            if (!b) {
                return false;
            }
        }
        return s.isEmpty();
    }

}
