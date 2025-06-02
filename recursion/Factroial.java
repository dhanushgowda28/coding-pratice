public class Factroial {

    public static void main(String[] args) {

        System.out.println(fact(5));

    }

    public static int fact(int i) {
        if (i == 0)
            return i;
        return i + fact(i - 1);
    }
}