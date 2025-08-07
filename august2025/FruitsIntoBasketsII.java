public class FruitsIntoBasketsII {
    public static void main(String[] args) {

        int[] fruits = { 1,4 };
        int[] baskets = { 8,1 };

        System.out.println(numOfUnplacesFruits(fruits, baskets));

    }

    public static int numOfUnplacesFruits(int[] fruits, int[] baskets) {
        int i = 0;
        int j = 0;
        while (i < fruits.length && j < baskets.length) {
            if (fruits[i] > baskets[j]) {
                while (j < baskets.length && baskets[j] < fruits[i]) {
                    j++;
                }

            } else {
                i++;
                j++;
            }

        }
        return fruits.length - i;

    }

}
