public class ZigZag {

    public static void main(String[] args) {

        String str = "PAYPALISHIRING";

        System.out.println(zigZag(str, 3));
        System.out.println("PAHNAPLSIIGYIR".equals(zigZag(str, 3)));

    }

    public static String zigZag(String str, int row) {

        StringBuilder[] arr = new StringBuilder[row];

        for (int i = 0; i < row; i++) {
            arr[i] = new StringBuilder();
        }

        int count = 0;
        boolean updown = false;

        for (char c : str.toCharArray()) {

            arr[count].append(c);

            if (count == 0 || count == row - 1) {
                updown = !updown;

            }
            count += updown ? 1 : -1;

        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder b : arr) {
            result.append(b);
        }
        return result.toString();

    }

}
