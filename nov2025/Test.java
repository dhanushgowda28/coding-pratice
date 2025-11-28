
public class Test {

    public static void main(String[] args) {

        String str = "011";
        int res = 0;
        for (int i = 0; i < str.length(); i++)
            res = res * 2 + (str.charAt(i) - '0');

        System.out.println(res);
    }

}