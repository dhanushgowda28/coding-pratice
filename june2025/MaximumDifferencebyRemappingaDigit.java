public class MaximumDifferencebyRemappingaDigit {
    public static void main(String[] args) {
        System.out.println(minMaxDifference(90));
    }

    public static int minMaxDifference(int num) {

        String str = "" + num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {
                if (!str.contains("" + i))
                    break;
                String temp = str.replace("" + i, "" + j);
                min = Math.min(min, Integer.parseInt(temp));
                max = Math.max(max, Integer.parseInt(temp));
            }

        }
        return max - min;
    }

}
