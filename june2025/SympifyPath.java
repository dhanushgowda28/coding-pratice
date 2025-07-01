import java.util.Arrays;
import java.util.Stack;

public class SympifyPath {

    public static void main(String[] args) {

        String s = "/.../a/../b/c/../d/./";

        String[] arr = s.split("/");
        System.out.println(Arrays.toString(arr));
        Stack<String> st = new Stack<>();

        for (String i : arr) {

            if (i.equals(".") || i.isEmpty()) {
                continue;
            } else if (i.equals("..")) {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push("/" + i);
            }
        }
        String res = "";
        while (!st.isEmpty()) {
            res = st.pop() + res;
        }
        System.out.println(res.isEmpty() ? "/" : res);
    }

    public String simplifyPath(String path) {

        return "";

    }
}
