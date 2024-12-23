package Aproblems;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }

    static public boolean isHappy(int n) {

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while (sum != 1) {

            while (n != 0) {
                int sq = n % 10;
                n = n / 10;
                sum += sq * sq;
            }
            
            if (list.contains(sum)) {
                break;
            }
            list.add(sum);
            if (sum == 1) {
                return true;
            } else {
                n = sum;
            }
            sum =0;

        }
        return false;
    }
}
