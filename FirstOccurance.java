public class FirstOccurance {

    public static void main(String[] args) {
        String need = "ll";
        String hay = "hello";

        int n = need.length();
        int h = hay.length();
        int a = h-n;
        for (int i = 0; i < h - n; i++) {
            if (hay.substring(i,i+ n).equals(need)) {
                System.out.println(i);
            }
        }
    }

}
