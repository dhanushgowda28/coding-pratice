public class SimplefyPath {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }

    static public String simplifyPath(String path) {
        String[] str = path.split("/");
        String res = "";
        for (String s : str) {
            if (!s.isEmpty()) {

                if (s.equals(".")) {
                    continue;
                }
                if (s.equals("..")) {
                    if (res.isEmpty())
                        continue;
                    else
                        res = res.substring(0, res.lastIndexOf("/"));
                } else {
                    res += "/";
                    res += s;
                }
            }

        }
        return res.isEmpty() ? "/" : res;
    }
}
