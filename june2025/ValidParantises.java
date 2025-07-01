import java.util.Stack;

public class ValidParantises {

    public static void main(String[] args) {

        String s1 = "()";
        String s2 = "({[]})";
        String s3 = ")(";
        String s4 = "()[]{}{[(])}";
        System.out.println(isVaild(s1) + " " + isVaild(s2) + " " + isVaild(s3) + " " + isVaild(s4));
    }

    public static boolean isVaild(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
                continue;
            } else if (st.isEmpty()) {
                return false;
            } else if (c == ')' && st.peek() != '(') {
                return false;
            } else if (c == '}' && st.peek() != '{') {
                return false;
            } else if (c == ']' && st.peek() != '[') {
                return false;
            }

            st.pop();

        }
        return st.isEmpty();
    }

}