import java.util.Arrays;

public class FruitsIntoBasketsIII {

    public static void main(String[] args) {
        int[] fruits = { 5, 6, 7, 8, 9 }, baskets = { 4, 5 };
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int l = baskets.length;
        Arrays.sort(baskets);
        int b = 0;
        int unplaced = 0;
        for (int fruit : fruits) {

            while (b < l && fruit > baskets[b]) {
                b++;
            }
            if (b == l) {
                unplaced++;
            } else {
                b++;
            }
        }
        return unplaced;
    }
}
