import java.util.List;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
         double b = 5.9 ;
         System.out.println((int) (b));

        int[] nums = { 3, 1, 4, 2 };
        int p = 6;

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subSeqArray(nums, 0, list, res, 0, p);
        System.out.println(list);
        for (List<Integer> i : res)
            System.out.println(i);
    }

    public static boolean subSeqArray(int[] nums, int i, List<Integer> list, List<List<Integer>> res, int temp,
            int sum) {
        if (i == nums.length) {
            if (sum == temp) {
                return true;
            }
            return false;
        }

        list.add(nums[i]);
        temp+=nums[i];
        if (true == subSeqArray(nums, i + 1, list, res, temp, sum))
            return true;

        list.remove(list.size() - 1);
        temp-=nums[i];
        if (true == subSeqArray(nums, i + 1, list, res, temp, sum))
            return true;

        return false;
    }

}