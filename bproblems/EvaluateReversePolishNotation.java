import java.util.Collections;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] tokens = { "2", "1", "+", "3", "*" };
        String[] t2 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
        //System.out.println(evalRPN(tokens));
        System.out.println(evalRPN(t2));
    }

    static public int evalRPN(String[] tokens) {
        Stack<String> num = new Stack<>();
        Stack<String> sym = new Stack<>();

        for (String s : tokens) {
            if (s.equals("*") || s.equals("+") || s.equals("-") || s.equals("/")) {
                sym.push(s);
            } else {
                num.push(s);
            }
        }
        Collections.reverse(sym);
        Collections.reverse(num);
        int res = Integer.parseInt(num.pop());
        while (!num.isEmpty() && !sym.isEmpty()) {
            int a = Integer.parseInt(num.pop());
            String s = sym.pop();
            if (s.equals("+")) {
                res += a;
            } else if (s.equals("*")) {
                res *= a;
            } else if (s.equals("/")) {
                res /= a;
            } else if (s.equals("-")) {
                res -= a;
            }
        }

        return res;
    }

}