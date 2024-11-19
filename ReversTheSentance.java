import java.util.Arrays;

public class ReversTheSentance {

    public static void main(String[] args) {

        String s = "a good   example";

        String[] arr = s.split(" ");

        String res = "";

        for (int i = 0; i < arr.length; i++) {
            res = arr[i]+" " + res;
        }
System.out.println(res.substring(0,res.length()-1));
    }
}
