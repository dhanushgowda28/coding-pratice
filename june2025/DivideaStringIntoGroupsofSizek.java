public class DivideaStringIntoGroupsofSizek {

    public static void main(String[] args) {

        for (String i : divideString("acbdefghijflm", 3, 'x')) {
            System.out.println(i);
        }

    }

    public static String[] divideString(String s, int k, char fill) {

        int l = s.length();
        int index = l / k;
        index += l % k == 0 ? 0 : 1;
        String[] arr = new String[index];
        int j = 0;
        for (int i = 0; i < l; i += k, j++) {
            arr[j] = s.substring(i, Math.min(l, i + k));
        }
        while (arr[arr.length - 1].length() < k) {
            arr[arr.length - 1] += fill;
        }
        return arr;
    }

}
