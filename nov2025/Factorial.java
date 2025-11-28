public class Factorial {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(factorial(i));
        }
    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;
        else if (num == 0)
            return 0;

        int a = factorial(num - 1);
        int b = factorial(num - 2);
        return a + b;
    }

}
